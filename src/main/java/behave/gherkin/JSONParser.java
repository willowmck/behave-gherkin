package behave.gherkin;

import behave.gherkin.formatter.Argument;
import behave.gherkin.formatter.Formatter;
import behave.gherkin.formatter.Reporter;
import behave.gherkin.formatter.model.Background;
import behave.gherkin.formatter.model.BasicStatement;
import behave.gherkin.formatter.model.Comment;
import behave.gherkin.formatter.model.DataTableRow;
import behave.gherkin.formatter.model.DocString;
import behave.gherkin.formatter.model.Examples;
import behave.gherkin.formatter.model.ExamplesTableRow;
import gherkin.deps.com.google.gson.Gson;
import behave.gherkin.formatter.model.Feature;
import behave.gherkin.formatter.model.Match;
import behave.gherkin.formatter.model.Result;
import behave.gherkin.formatter.model.Scenario;
import behave.gherkin.formatter.model.ScenarioOutline;
import behave.gherkin.formatter.model.Step;
import behave.gherkin.formatter.model.Tag;
import gherkin.deps.net.iharder.Base64;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JSONParser {
    
    private final Gson gson = new Gson();
    private final Reporter reporter;
    private final Formatter formatter;
    
    public JSONParser(Reporter reporter, Formatter formatter) {
        this.reporter = reporter;
        this.formatter = formatter;
    }
    
    public void parse(String src) {
        List<Map> featureHashes = gson.fromJson(new StringReader(src), List.class);
        for (Map o : featureHashes) {
            formatter.uri(getUriFromLocation(o));
            new Feature(comments(o), tags(o, line(o)), keyword(o), name(o), description(o), line(o), id(o), status(o)).replay(formatter);
            for (Map featureElement : (List<Map>) getList(o, "elements")) {
                featureElement(featureElement).replay(formatter);
                for (Map hook : (List<Map>) getList(featureElement, "before")) {
                    before(hook);
                }
                for (Map step : (List<Map>) getList(featureElement, "steps")) {
                    step(step);
                }
                for (Map hook : (List<Map>) getList(featureElement, "after")) {
                    after(hook);
                }
                for (Map eo : (List<Map>) getList(featureElement, "examples")) {
                    new Examples(comments(eo), tags(eo, line(eo)), keyword(eo), name(eo), description(eo), line(eo), id(eo), 
                            examplesTableRows(getList(eo, "rows"))).replay(formatter);
                }
            }
            formatter.eof();
        }
    }
    
    private String getString(Map map, String key) {
        Object string = map.get(key);
        return string == null ? null : (String) string;
    }
    
    private List<ExamplesTableRow> examplesTableRows(List o) {
        List<ExamplesTableRow> rows = new ArrayList<>(o.size());
        for (Object e : o) {
            Map row = (Map) e;
            rows.add(new ExamplesTableRow(comments(row), getList(row, "cells"), getInt(row, "line"), id(row)));
        }
        return rows;
    }
    
    private List<Comment> comments(Map o) {
        List<Comment> comments = new ArrayList<>();
        if (o.containsKey("comments")) {
            for (Object e : ((List) o.get("comments"))) {
                Map map = (Map) e;
                comments.add(new Comment(getString(map, "value"), getInt(map, "line")));
            }
        }
        return comments;
    }

    private List<Tag> tags(Map o, int line) {
        List<Tag> tags = new ArrayList<>();
        if (o.containsKey("tags")) {
            for (Object e : ((List) o.get("tags"))) {
                String tagName = (String) e;
                tags.add(new Tag(tagName, line));
            }
        }
        return tags;
    }

    private String keyword(Map o) {
        return getString(o, "keyword");
    }

    private String name(Map o) {
        return getString(o, "name");
    }
    
    private String status(Map o) {
        return getString(o, "status");
    }

    private String description(Map o) {
        return getString(o, "description");
    }

    private Integer line(Map o) {
        String location = location(o);
        String lineString = location.substring(location.indexOf(':')+1);
        if (lineString != null && !lineString.isEmpty()) {
            try {
                return Integer.parseInt(lineString);
            } catch (NumberFormatException e) {
                System.out.println("lineString value " + lineString + " is not an integer.");
            }
        }
        return 0;
    }

    private String id(Map o) {
        return getString(o, "id");
    }

    private List getList(Map map, String key) {
        Object list = map.get(key);
        return list == null ? Collections.emptyList() : (List) list;
    }

    private Integer getInt(Map map, String key) {
        Object n = map.get(key);
        return n == null ? null : ((Number) n).intValue();
    }

    private BasicStatement featureElement(Map o) {
        String type = (String) o.get("type");
        switch (type) {
            case "background":
                return new Background(comments(o), keyword(o), name(o), description(o), line(o));
            case "scenario":
                return new Scenario(comments(o), tags(o, line(o)), keyword(o), name(o), description(o), line(o), id(o), getUriFromLocation(o));
            case "scenario_outline":
                return new ScenarioOutline(comments(o), tags(o, line(o)), keyword(o), name(o), description(o), line(o), id(o));
            default:
                return null;
        }
    }

    private List<Argument> arguments(Map m) {
        List arguments = getList(m, "arguments");
        List<Argument> result = new ArrayList<>();
        for (Object argument : arguments) {
            Map argMap = (Map) argument;
            result.add(new Argument(getInt(argMap, "offset"), getString(argMap, "val")));
        }
        return result;
    }

    private String location(Map m) {
        return getString(m, "location");
    }
    
    private String getUriFromLocation(Map m) {
        String location = location(m);
        return location.substring(0, location.indexOf(':'));
    }

    private Long getLong(Map map, String key) {
        Object n = map.get(key);
        return n == null ? null : ((Number) n).longValue();
    }

    private Long getMicroseconds(Map map, String key) {
        Object n = map.get(key);
        return n == null ? null : new Double((((Number) n)).doubleValue() * 1000000).longValue();
    }

    private String errorMessage(Map r) {
        return getString(r, "error_message");
    }

    private Long duration(Map r) {
        return getMicroseconds(r, "duration");
    }

    private void before(Map o) {
        Map m = (Map) o.get("match");
        Match match = new Match(arguments(m), location(m));
        Map r = (Map) o.get("result");
        Result result = new Result(status(r), duration(r), errorMessage(r));
        reporter.before(match, result);
    }

    private void after(Map o) {
        Map m = (Map) o.get("match");
        Match match = new Match(arguments(m), location(m));
        Map r = (Map) o.get("result");
        Result result = new Result(status(r), duration(r), errorMessage(r));
        reporter.after(match, result);
    }

    private List<DataTableRow> dataTableRows(List o) {
        List<DataTableRow> rows = new ArrayList<>(o.size());
        for (Object e : o) {
            Map row = (Map) e;
            rows.add(new DataTableRow(comments(row), getList(row, "cells"), getInt(row, "line")));
        }
        return rows;
    }

    private void step(Map o) {
        List<DataTableRow> rows = null;
        if (o.containsKey("rows")) {
            rows = dataTableRows(getList(o, "rows"));
        }

        DocString docString = null;
        if (o.containsKey("doc_string")) {
            Map ds = (Map) o.get("doc_string");
            docString = new DocString(getString(ds, "content_type"), getString(ds, "value"), getInt(ds, "line"));
        }

        Step step = new Step(comments(o), keyword(o), name(o), line(o), rows, docString, getUriFromLocation(o));
        step.replay(formatter);

        if (o.containsKey("match")) {
            Map m = (Map) o.get("match");
            new Match(arguments(m), location(m)).replay(reporter);
        }

        if (o.containsKey("result")) {
            Map r = (Map) o.get("result");
            new Result(status(r), duration(r), errorMessage(r)).replay(reporter);
        }

        if (o.containsKey("embeddings")) {
            List<Map> embeddings = (List<Map>) o.get("embeddings");
            for (Map embedding : embeddings) {
                try {
                    reporter.embedding(getString(embedding, "mime_type"), Base64.decode(getString(embedding, "data")));
                } catch (IOException ex) {
                    throw new RuntimeException("Couldn't decode data", ex);
                }
            }
        }

        if (o.containsKey("output")) {
            List<String> output = (List<String>) o.get("output");
            for (String text : output) {
                reporter.write(text);
            }
        }
    }
}

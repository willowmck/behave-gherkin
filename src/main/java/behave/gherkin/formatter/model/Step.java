package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Argument;
import behave.gherkin.formatter.Formatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Step extends BasicStatement {
    private static final long serialVersionUID = 1L;
    
    private final List<DataTableRow> rows;
    private final DocString doc_string;
    private final String uri;
    
    public Step(List<Comment> comments, String keyword, String name, Integer line, List<DataTableRow> rows, DocString docString, String uri) {
        super(comments, keyword, name, line);
        this.rows = rows;
        this.doc_string = docString;
        this.uri = uri;
    }

    @Override
    public void replay(Formatter formatter) {
        formatter.step(this);
    }

    public List<DataTableRow> getRows() {
        return rows;
    }

    @Override
    public Range getLineRange() {
        Range range = super.getLineRange();
        if (getRows() != null) {
            range = new Range(range.getFirst(), getRows().get(getRows().size() - 1).getLine());
        } else if (getDocString() != null) {
            range = new Range(range.getFirst(), getDocString().getLineRange().getLast());
        }
        return range;
    }

    public List<Argument> getOutlineArgs() {
        List<Argument> result = new ArrayList<>();
        Pattern p = Pattern.compile("<[^<]*>");
        Matcher matcher = p.matcher(getName());
        while (matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            result.add(new Argument(matchResult.start(), matchResult.group()));
        }
        return result;
    }

    public Match getOutlineMatch(String location) {
        return new Match(getOutlineArgs(), location);
    }

    public DocString getDocString() {
        return doc_string;
    }

    public StackTraceElement getStackTraceElement(String path) {
        return new StackTraceElement("✽", getKeyword() + getName(), path, getLine());
    }
}

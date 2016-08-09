package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Formatter;
import behave.gherkin.formatter.Mappable;
import java.util.List;

public abstract class BasicStatement extends Mappable {
    
    private final List<Comment> comments;
    private final String keyword;
    private final String name;
    private final Integer line;
    
    public BasicStatement(List<Comment> comments, String keyword, String name, Integer line) {
        this.comments = comments;
        this.keyword = keyword;
        this.name = name;
        this.line = line;
    }

    protected Integer getFirstNonCommentLine() {
        return line;
    }

    public Range getLineRange() {
        int first;
        if (getComments().size() > 0) {
            first = getComments().get(0).getLine();
        } else {
            first = getFirstNonCommentLine();
        }

        return new Range(first, getLine());
    }
    
    public abstract void replay(Formatter formatter);

    public String getKeyword() {
        return keyword;
    }

    public String getName() {
        return name;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Integer getLine() {
        return line;
    }
}

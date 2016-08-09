package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Formatter;
import java.util.List;

public class Scenario extends TagStatement {
    private static final long serialVersionUID = 1L;
    private String uri;
    
    public Scenario(List<Comment> comments, List<Tag> tags, String keyword, String name, String description, Integer line, String id, String uri) {
        super(comments, tags, keyword, name, description, line, id);
        this.uri = uri;
    }

    @Override
    public void replay(Formatter formatter) {
        formatter.scenario(this);
    }
}

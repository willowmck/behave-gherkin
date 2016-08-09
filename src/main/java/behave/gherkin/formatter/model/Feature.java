package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Formatter;
import java.util.List;

public class Feature extends TagStatement {
    private static final long serialVersionUID = 1L;
    
    private final String status;
    
    public Feature(List<Comment> comments, List<Tag> tags, String keyword, String name, String description, 
            Integer line, String id, String status) {
        super(comments, tags, keyword, name, description, line, id);
        this.status = status;
    }

    @Override
    public void replay(Formatter formatter) {
        formatter.feature(this);
    }
}

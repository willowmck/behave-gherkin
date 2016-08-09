package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Formatter;
import java.util.List;

public class Examples extends TagStatement {
    private static final long serialVersionUID = 1L;
    

    private List<ExamplesTableRow> rows;
    
    public Examples(List<Comment> comments, List<Tag> tags, String keyword, String name, String description, Integer line, String id, List<ExamplesTableRow> rows) {
        super(comments, tags, keyword, name, description, line, id);
        this.rows = rows;
    }

    @Override
    public void replay(Formatter formatter) {
        formatter.examples(this);
    }

    public List<ExamplesTableRow> getRows() {
        return rows;
    }

    public void setRows(List<ExamplesTableRow> rows) {
        this.rows = rows;
    }
}

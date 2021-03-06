package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Argument;
import behave.gherkin.formatter.Mappable;
import behave.gherkin.formatter.Reporter;
import java.util.Collections;
import java.util.List;

public class Match extends Mappable {
    private static final long serialVersionUID = 1L;
    
    private final List<Argument> arguments;
    private final String location;
    public static final Match UNDEFINED = new Match(Collections.<Argument>emptyList(), null);
    
    public Match(List<Argument> arguments, String location) {
        this.arguments = arguments;
        this.location = location;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void replay(Reporter reporter) {
        reporter.match(this);
    }

    public String getLocation() {
        return location;
    }
}

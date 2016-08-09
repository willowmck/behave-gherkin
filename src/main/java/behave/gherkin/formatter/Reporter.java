package behave.gherkin.formatter;

import behave.gherkin.formatter.model.Match;
import behave.gherkin.formatter.model.Result;

/**
 * Interface for reporting results. This is a different interface from Formatter,
 * which also knows how to print gherkin source. They are separate, because some
 * Reporter implementations (such as Behave's JUnitReporter) only cares about results,
 */
public interface Reporter {
    void before(Match match, Result result);
    
    void after(Match match, Result result);

    void match(Match match);
    
    void result(Result result);
    
    void embedding(String mimeType, byte[] data);
    
    void write(String text);
}

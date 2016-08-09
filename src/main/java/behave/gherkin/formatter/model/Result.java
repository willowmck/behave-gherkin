package behave.gherkin.formatter.model;

import behave.gherkin.formatter.Mappable;
import behave.gherkin.formatter.Reporter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Result extends Mappable {
    private static final long serialVersionUID = 1L;
    
    public static final String PASSED = "passed";
    public static final String FAILED = "failed";
    public static final Result SKIPPED = new Result("skipped", null, null);
    public static final Result UNDEFINED = new Result("undefined", null, null);
    
    private final String status;
    private final Long duration;
    private final List<String> error_message;
    private final Throwable error;

    /**
     * Used at runtime
     *
     * @param status
     * @param duration
     * @param error
     * @param dummy    only used to distinguish the constructor when used from JRuby (and null for error).
     */
    public Result(String status, Long duration, Throwable error, Object dummy) {
        this.status = status;
        this.duration = duration;
        this.error_message = new ArrayList<>();
        if (null != error) 
            error_message.add(getErrorMessage(error));
        this.error = error;
    }
    
    /**
     * Used when parsing JSON. TODO: constructing an Exception instance when parsing JSON might be better.
     *
     * @param status
     * @param duration
     * @param errorMessage
     */
    public Result(String status, Long duration, List errorMessage) {
        this.status = status;
        this.duration = duration;
        this.error_message = errorMessage;
        this.error = null;
    }

    public void replay(Reporter reporter) {
        reporter.result(this);
    }

    public Long getDuration() {
        return duration;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getErrorMessage() {
        return error_message;
    }

    private String getErrorMessage(Throwable error) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        error.printStackTrace(printWriter);
        return stringWriter.getBuffer().toString();
    }

    public Throwable getError() {
        return error;
    }
}

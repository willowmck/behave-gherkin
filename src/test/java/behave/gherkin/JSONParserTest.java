package behave.gherkin;

import behave.gherkin.formatter.JSONFormatter;
import gherkin.deps.com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class JSONParserTest {
    
    private void printKeys(Map m) {
        Set keySet = m.keySet();
        Iterator iter = keySet.iterator();
        while (iter.hasNext())
        {
            String key = (String) iter.next();
            System.out.println("Key=" + key + ", value=" + m.get(key));
        }
    }
    
    private void setupParser(StringBuilder stringBuilder, String report) {
        JSONFormatter f = new JSONFormatter(stringBuilder);
        JSONParser p = new JSONParser(f, f);
        p.parse(report.trim());
        f.done();
    }
    
    private List getResult(StringBuilder stringBuilder) {
        Gson gson = new Gson();
        return gson.fromJson(stringBuilder.toString(), List.class);
    }
    
    @Test
    public void testJsonTutorialForTopLevelInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        setupParser(stringBuilder, BehaveReports.SIMPLE_REPORT);
        List parserResult = getResult(stringBuilder);

        Map featureJson = (Map) parserResult.get(0);
        assertEquals("Feature", featureJson.get("keyword"));
        assertEquals("simple.feature", featureJson.get("uri"));
        assert(2 == ((Double)featureJson.get("line")).intValue());
        assertEquals("showing off behave", featureJson.get("name"));
        assertEquals("passed", featureJson.get("status"));
        
        List tags = (List) featureJson.get("tags");
        assertNull(tags);
    }
    
    @Test
    public void testJsonTutorialForScenario() {
        StringBuilder stringBuilder = new StringBuilder();
        setupParser(stringBuilder, BehaveReports.SIMPLE_REPORT);
        List parserResult = getResult(stringBuilder);

        Map featureJson = (Map) parserResult.get(0);
        List elements = (List) featureJson.get("elements");
        Map scenario = (Map) elements.get(0);
        
        assertEquals("Scenario", scenario.get("keyword"));
        assertEquals("simple.feature", scenario.get("uri"));
        assert(4 == ((Double)scenario.get("line")).intValue());
        assertEquals("run a simple test", scenario.get("name"));
        
        List tags = (List) scenario.get("tags");
        assertNull(tags);
    }
    
    @Test
    public void testJsonTutorialGiven() {
        StringBuilder stringBuilder = new StringBuilder();
        setupParser(stringBuilder, BehaveReports.SIMPLE_REPORT);
        List parserResult = getResult(stringBuilder);

        Map featureJson = (Map) parserResult.get(0);
        List elements = (List) featureJson.get("elements");
        Map scenario = (Map) elements.get(0);
        List steps = (List) scenario.get("steps");
        Map given = (Map) steps.get(0);
        
        assertEquals("Given", given.get("keyword"));
        assertEquals("simple.feature", given.get("uri"));
        assert(5 == ((Double)given.get("line")).intValue());
        assertEquals("we have behave installed", given.get("name"));
        
        Map match = (Map) given.get("match");
        List arguments = (List) match.get("arguments");
        assertNull(arguments);
        assertEquals("steps/simple.py:3", match.get("location"));
        
        Map result = (Map) given.get("result");
        assertEquals(1.98625802E8, result.get("duration"));
        assertEquals("passed", result.get("status"));
    }
    
    @Test
    public void testMultipleFeatures() {
        StringBuilder stringBuilder = new StringBuilder();
        setupParser(stringBuilder, BehaveReports.COMPLEX_REPORT);
        List parserResult = getResult(stringBuilder);

        Map featureJson = (Map) parserResult.get(0);
        assertEquals("Feature", featureJson.get("keyword"));
        assertEquals("test/features/env_start.feature", featureJson.get("uri"));
        assert(1 == ((Double)featureJson.get("line")).intValue());
        assertEquals("Start all services across an environment", featureJson.get("name"));
        assertEquals("passed", featureJson.get("status"));
        
        List tags = (List) featureJson.get("tags");
        assertNull(tags);
    }
    
    @Test
    public void testFailedSteps() {
        StringBuilder stringBuilder = new StringBuilder();
        setupParser(stringBuilder, BehaveReports.TEST_WITH_STDOUT_AND_ERRORS);
        List parserResult = getResult(stringBuilder);
        
        Map featureJson = (Map) parserResult.get(0);
        assertEquals("Feature", featureJson.get("keyword"));
        assertEquals("test/features/env_start.feature", featureJson.get("uri"));
        assert(1 == ((Double)featureJson.get("line")).intValue());
        assertEquals("Start all services across an environment", featureJson.get("name"));
        assertEquals("failed", featureJson.get("status"));
        
        List elements = (List) featureJson.get("elements");
        Map scenario = (Map) elements.get(1);
        
        assertEquals("Scenario", scenario.get("keyword"));
        assertEquals("test/features/env_start.feature", scenario.get("uri"));
        assert(10 == ((Double)scenario.get("line")).intValue());
        assertEquals("Start an environment with init script errors", scenario.get("name"));
        List steps = (List) scenario.get("steps");
        Map given = (Map) steps.get(0);
        
        assertEquals("Given", given.get("keyword"));
        assertEquals("test/features/env_start.feature", given.get("uri"));
        assert(11 == ((Double)given.get("line")).intValue());
        Map match = (Map) given.get("match");
        assertEquals("test/features/steps/env_start.py:50", match.get("location"));
        assertEquals("a stopped environment that will have init script errors on startup", given.get("name"));
        Map result = (Map) given.get("result");
        assertEquals(1.6141891E7, result.get("duration"));
        assertEquals("passed", result.get("status"));
        
        Map then = (Map) steps.get(2);
        assertEquals("Then", then.get("keyword"));
        assertEquals("I would expect a message saying that init scripts had errors", then.get("name"));
        result = (Map) then.get("result");
        assertEquals(4040956.0, result.get("duration"));
        List<String> errorMessages = (List<String>) result.get("error_message");
        assertEquals("Traceback (most recent call last):", errorMessages.get(0));
    }
}

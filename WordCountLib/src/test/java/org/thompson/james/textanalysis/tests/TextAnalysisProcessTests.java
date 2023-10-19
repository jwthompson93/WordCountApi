package org.thompson.james.textanalysis.tests;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.thompson.james.process.IProcess;
import org.thompson.james.process.TextAnalysisProcess;
import org.thompson.james.textanalysis.object.TextAnalysisResult;

/**
 *
 * @author James Thompson
 */
public class TextAnalysisProcessTests {
    
    private Gson gson;
    
    public TextAnalysisProcessTests() {
        gson = new Gson();
    }
    
    @ParameterizedTest
    @MethodSource("org.thompson.james.textanalysis.testcases.TextAnalysisTestCases#TestCases")
    void Test_ProcessString(TextAnalysisResult input) throws IOException {
        IProcess<String> textAnalysisProcess = new TextAnalysisProcess();
        String JsonResult = textAnalysisProcess.process(input.getSentence());
        System.out.println(JsonResult);
        
        assertEquals(JsonParser.parseString(JsonResult), JsonParser.parseString(gson.toJson(input)));
    }
}

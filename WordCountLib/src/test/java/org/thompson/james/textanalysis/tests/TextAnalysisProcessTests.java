/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thompson.james.textanalysis.tests;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.thompson.james.file.TextFileReader;
import org.thompson.james.process.IProcess;
import org.thompson.james.process.TextAnalysisProcess;
import org.thompson.james.textanalysis.object.TextAnalysisResult;

/**
 *
 * @author James Thompson
 */
public class TextAnalysisProcessTests {
    
    private Gson gson;
    private JsonParser jsonParser;
    
    public TextAnalysisProcessTests() {
        gson = new Gson();
        jsonParser = new JsonParser();
    }
    
    @ParameterizedTest
    @MethodSource("org.thompson.james.textanalysis.testcases.TextAnalysisTestCases#TestCases")
    void Test_ProcessString(TextAnalysisResult input) throws IOException {
        IProcess<String> textAnalysisProcess = new TextAnalysisProcess();
        String JsonResult = textAnalysisProcess.process(input.getSentence());
        
        assertEquals(jsonParser.parse(JsonResult), jsonParser.parse(gson.toJson(input)));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thompson.james.textanalysis.tests;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.thompson.james.file.TextFileReader;
import org.thompson.james.format.JsonFormat;
import org.thompson.james.process.IProcess;
import org.thompson.james.process.TextAnalysisProcess;

/**
 *
 * @author James Thompson
 */
public class TextAnalysisFileTest {
    
    @Test 
    void Test_ProcessTextFromFile() throws IOException {
        TextFileReader textFile = new TextFileReader();
        String txt = textFile.getTextFromFile(getClass().getClassLoader().getResource("bible_daily.txt").openStream());
        
        IProcess<String> textAnalysisProcess = new TextAnalysisProcess();
        String JsonResult = textAnalysisProcess.process(txt, "json");
        assertNotNull(JsonResult);
    }
}

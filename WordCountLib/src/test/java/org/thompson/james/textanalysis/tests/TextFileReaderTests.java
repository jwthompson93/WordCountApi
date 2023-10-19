/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thompson.james.textanalysis.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.thompson.james.file.TextFileReader;

/**
 *
 * @author James Thompson
 */
public class TextFileReaderTests {
    
    @Test
    void Test_GetTextFromFile() {
        TextFileReader textFile = new TextFileReader();
        Assertions.assertDoesNotThrow(() -> 
                textFile.getTextFromFile(getClass().getClassLoader().getResource("bible_daily.txt").getFile()));
    }
}

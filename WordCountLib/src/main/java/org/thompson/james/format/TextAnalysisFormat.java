/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thompson.james.format;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.thompson.james.textanalysis.object.TextAnalysisResult;

/**
 *
 * @author James Thompson
 */
public class TextAnalysisFormat implements IFormat<TextAnalysisResult> {

    @Override
    public String format(TextAnalysisResult input) {
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(String.format("Word count = %s \n", input.getWordAmount()));
        returnString.append(String.format("Average Word Length = %s \n", input.getAverageWordLength()));
        input.getNumberOfWordsOfLength().forEach((key, value) -> {
            returnString.append(String.format("Number of words of length %s is %s \n", key, value));
        });
        returnString.append(
                String.format("The most frequently occurring word length is %s, for word lengths of %s \n", 
                input.getHighestOccurringWordLength().values().toArray()[0],
                input.getHighestOccurringWordLength().keySet().stream().map(String::valueOf).collect(Collectors.joining(", "))));
        
        return returnString.toString();
    }
    
}

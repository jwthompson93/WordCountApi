package org.thompson.james.process;

import org.thompson.james.format.FormatFactory;
import org.thompson.james.string.Regex;
import org.thompson.james.textanalysis.TextAnalysis;
import org.thompson.james.textanalysis.object.TextAnalysisResult;

/**
 *
 * @author James Thompson
 */
public class TextAnalysisProcess implements IProcess<String> {

    private TextAnalysis textAnalysis;
    
    public TextAnalysisProcess() {
        this.textAnalysis = new TextAnalysis();
    }
    
    @Override
    public String process(String input, String format) {
        String clensedInput = input.trim().replaceAll(Regex.REMOVE_COMMAS_AND_DOTS, "").replaceAll(" +", " ");
        String[] splitCleansedInput = clensedInput.split(" ");
        
        var textAnalysisResult = performTextAnalysis(input, splitCleansedInput);
        
        return FormatFactory.Format(format).format(textAnalysisResult);
    }
    
    private TextAnalysisResult performTextAnalysis(String input, String[] splitInput) {
        var textAnalysisResult = new TextAnalysisResult(input);
        
        textAnalysisResult.setWordCount(textAnalysis.GetWordCount(splitInput));
        textAnalysisResult.setAverageWordLength(textAnalysis.GetAverageWordLength(splitInput));
        textAnalysisResult.setNumberOfWordsOfLength(textAnalysis.GetNumberOfWordsOfLengthMap(splitInput));
        textAnalysisResult.setHighestOccurringWordLength(
                textAnalysis.GetMostOccurringWordLength(textAnalysisResult.getNumberOfWordsOfLength()));
        
        return textAnalysisResult;
    }
    
}

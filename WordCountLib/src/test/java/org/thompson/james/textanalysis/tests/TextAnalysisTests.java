package org.thompson.james.textanalysis.tests;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.thompson.james.textanalysis.TextAnalysis;
import org.thompson.james.textanalysis.object.TextAnalysisResult;

public class TextAnalysisTests {
    
    private TextAnalysis textAnalysis;
    
    public TextAnalysisTests() {
        this.textAnalysis = new TextAnalysis();
    }

    @ParameterizedTest
    @MethodSource("org.thompson.james.textanalysis.testcases.TextAnalysisTestCases#TestCases")
    void Test_GetWordCount(TextAnalysisResult textAnalysisResult) {
        int wordCount = textAnalysis.GetWordCount(textAnalysisResult.getSplitSentence());
        Assertions.assertEquals(textAnalysisResult.getWordAmount(), wordCount);
    }

    @ParameterizedTest
    @MethodSource("org.thompson.james.textanalysis.testcases.TextAnalysisTestCases#TestCases")
    void Test_GetAverageWordLength(TextAnalysisResult textAnalysisResult) {
        double averageWordLength = textAnalysis.GetAverageWordLength(textAnalysisResult.getSplitSentence());
        Assertions.assertEquals(textAnalysisResult.getAverageWordLength(), Precision.round(averageWordLength, 5));
    }

    @ParameterizedTest
    @MethodSource("org.thompson.james.textanalysis.testcases.TextAnalysisTestCases#TestCases")
    void Test_GetNumberOfWordsOfLengthMap(TextAnalysisResult textAnalysisResult) {
        var numberOfWordsOfLengthMap = textAnalysis.GetNumberOfWordsOfLengthMap(textAnalysisResult.getSplitSentence());
        Assertions.assertTrue(numberOfWordsOfLengthMap.entrySet().containsAll(textAnalysisResult.getNumberOfWordsOfLength().entrySet()));
    }

    @ParameterizedTest
    @MethodSource("org.thompson.james.textanalysis.testcases.TextAnalysisTestCases#TestCases")
    void Test_GetMostOccurringWordLength(TextAnalysisResult textAnalysisResult) {
        var mostOccuringWordLength = textAnalysis.GetMostOccurringWordLength(textAnalysisResult.getNumberOfWordsOfLength());
        Assertions.assertTrue(mostOccuringWordLength.entrySet().containsAll(textAnalysisResult.getHighestOccurringWordLength().entrySet()));
    }
}

package textanalysis;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.thompson.james.textanalysis.TextAnalysis;

public class TextAnalysisTests {

    private TextAnalysis textAnalysis;
    public TextAnalysisTests() {
        this.textAnalysis = new TextAnalysis();
    }

    @Test
    void Test_GetWordCount() {
        for (var testCase : TextAnalysisTestCases.textAnalysisTestCases) {
            int wordCount = textAnalysis.GetWordCount(testCase.getSplitSentence());
            Assertions.assertEquals(testCase.getWordAmount(), wordCount);
        }
    }

    @Test
    void Test_GetAverageWordLength() {
        for (var testCase : TextAnalysisTestCases.textAnalysisTestCases) {
            double averageWordLength = textAnalysis.GetAverageWordLength(testCase.getSplitSentence());
            Assertions.assertEquals(testCase.getAverageWordLength(), Precision.round(averageWordLength, 5));
        }
    }

    @Test
    void Test_GetNumberOfWordsOfLengthMap() {
        for (var testCase : TextAnalysisTestCases.textAnalysisTestCases) {
            var numberOfWordsOfLengthMap = textAnalysis.GetNumberOfWordsOfLengthMap(testCase.getSplitSentence());
            Assertions.assertTrue(numberOfWordsOfLengthMap.entrySet().containsAll(testCase.getNumberOfWordsOfLength().entrySet()));
        }
    }

    @Test
    void Test_GetMostOccurringWordLength() {
        for (var testCase : TextAnalysisTestCases.textAnalysisTestCases) {
            var mostOccuringWordLength = textAnalysis.GetMostOccurringWordLength(testCase.getNumberOfWordsOfLength());
            Assertions.assertTrue(mostOccuringWordLength.equals(testCase.getHighestOccurringWordLength()));
        }
    }
}

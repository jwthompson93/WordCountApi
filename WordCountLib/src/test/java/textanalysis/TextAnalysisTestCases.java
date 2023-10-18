package textanalysis;

import org.thompson.james.textanalysis.TextAnalysisResult;

import java.util.*;

public class TextAnalysisTestCases {
    public static List<TextAnalysisResult> textAnalysisTestCases = Arrays.asList(
            new TextAnalysisResult("We can trust the varargs mechanism to handle the array creation With that we can write more concise and readable code",
                    "We can trust the varargs mechanism to handle the array creation With that we can write more concise and readable code".split(" "),
                    21,
                    4.61905,
                    Map.of(2, 3,
                            3, 5,
                            4, 4,
                            5, 3,
                            6, 1,
                            7, 2,
                            8, 2,
                            9, 1),
                    Map.entry(3,5))
    );
}

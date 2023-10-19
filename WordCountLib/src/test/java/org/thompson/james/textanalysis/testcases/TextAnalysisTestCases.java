package org.thompson.james.textanalysis.testcases;

import org.thompson.james.textanalysis.object.TextAnalysisResult;

import java.util.*;
import org.thompson.james.string.Regex;

public class TextAnalysisTestCases {
    private TextAnalysisTestCases() {}
    
    public static TextAnalysisResult[] TestCases() {
        return new TextAnalysisResult[] {
            new TextAnalysisResult(
                "We can trust the varargs mechanism to handle the array creation. With that, we can write more concise and readable code",
                "We can trust the varargs mechanism to handle the array creation With that we can write more concise and readable code".replaceAll(Regex.REMOVE_COMMAS_AND_DOTS, "").split(" "),
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
                Map.of(3,5)
            ),
            new TextAnalysisResult(
                "Hello world & good morning. The date is 18/05/2016",
                "Hello world & good morning. The date is 18/05/2016".replaceAll(Regex.REMOVE_COMMAS_AND_DOTS, "").split(" "),
                9,
                4.55556,
                Map.of(1, 1,
                        2, 1,
                        3, 1,
                        4, 2,
                        5, 2,
                        7, 1,
                        10, 1),
                Map.of(5, 2, 
                       4, 2)
            )
        };
    }
}

package org.thompson.james;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {
    private String[] processedSentence;

    public TextAnalysis(String[] processedSentence) {
        this.processedSentence = processedSentence;
    }

    public Integer GetWordCount() {
        return processedSentence.length;
    }

    public Integer GetAverageWordLength() {
        return Arrays.stream(processedSentence).mapToInt(String::length).sum() / processedSentence.length;
    }

    public Map<Integer, Integer> GetNumberOfWordsOfLengthMap() {
        return new HashMap<>();
    }

    public Integer[] GetMostOccurringWordLength() {
        return new Integer[1];
    }
}

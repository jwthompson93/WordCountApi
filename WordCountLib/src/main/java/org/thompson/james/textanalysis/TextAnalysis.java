package org.thompson.james.textanalysis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TextAnalysis {
    public Integer GetWordCount(String[] processedSentence) {
        return processedSentence.length;
    }

    public Integer GetAverageWordLength(String[] processedSentence) {
        return Arrays
                .stream(processedSentence)
                .mapToInt(String::length).sum() / processedSentence.length;
    }

    public Map<Integer, Integer> GetNumberOfWordsOfLengthMap(String[] processedSentence) {
        return Arrays
                .stream(processedSentence)
                .collect(Collectors.toMap(String::length, i -> 1, Integer::sum));
    }

    public Map.Entry<Integer, Integer> GetMostOccurringWordLength(Map<Integer, Integer> processedSentenceMap) {
        return processedSentenceMap.entrySet().stream().max();
    }
}

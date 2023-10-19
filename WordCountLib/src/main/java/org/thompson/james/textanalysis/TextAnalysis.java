package org.thompson.james.textanalysis;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TextAnalysis {
    public Integer GetWordCount(String[] processedSentence) {
        return processedSentence.length;
    }

    public Double GetAverageWordLength(String[] processedSentence) {
        return Arrays
                .stream(processedSentence)
                .mapToDouble(String::length).sum() / processedSentence.length;
    }

    public Map<Integer, Integer> GetNumberOfWordsOfLengthMap(String[] processedSentence) {
        return Arrays
                .stream(processedSentence)
                .collect(Collectors.toMap(String::length, i -> 1, Integer::sum));
    }

    public Map<Integer, Integer> GetMostOccurringWordLength(Map<Integer, Integer> processedSentenceMap) {
        Integer maxValue = Collections.max(processedSentenceMap.entrySet(), Map.Entry.comparingByValue()).getValue();
        return processedSentenceMap.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), maxValue))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
    }
}

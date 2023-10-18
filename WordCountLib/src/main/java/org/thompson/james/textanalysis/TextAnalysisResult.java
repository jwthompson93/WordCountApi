package org.thompson.james.textanalysis;

import java.util.Map;
import java.util.SortedMap;

public class TextAnalysisResult {
    private String sentence;
    private Integer wordAmount;
    private Double averageWordLength;
    private SortedMap<Integer, Integer> numberOfWordsOfLength;
    private Map.Entry<Integer, Integer> highestOccurringWordLength;

    public TextAnalysisResult(String sentence) {
        this.sentence = sentence;
    }

    public TextAnalysisResult(String sentence, Integer wordAmount, Double averageWordLength,
                              SortedMap<Integer, Integer> numberOfWordsOfLength,
                              Map.Entry<Integer, Integer> highestOccurringWordLength) {
        this.sentence = sentence;
        this.wordAmount = wordAmount;
        this.averageWordLength = averageWordLength;
        this.numberOfWordsOfLength = numberOfWordsOfLength;
        this.highestOccurringWordLength = highestOccurringWordLength;
    }

    public Integer getWordAmount() {
        return wordAmount;
    }

    public void setWordAmount(Integer wordAmount) {
        this.wordAmount = wordAmount;
    }

    public Double getAverageWordLength() {
        return averageWordLength;
    }

    public void setAverageWordLength(Double averageWordLength) {
        this.averageWordLength = averageWordLength;
    }

    public SortedMap<Integer, Integer> getNumberOfWordsOfLength() {
        return numberOfWordsOfLength;
    }

    public void setNumberOfWordsOfLength(SortedMap<Integer, Integer> numberOfWordsOfLength) {
        this.numberOfWordsOfLength = numberOfWordsOfLength;
    }

    public Map.Entry<Integer, Integer> getHighestOccurringWordLength() {
        return highestOccurringWordLength;
    }

    public void setHighestOccurringWordLength(Map.Entry<Integer, Integer> highestOccurringWordLength) {
        this.highestOccurringWordLength = highestOccurringWordLength;
    }
}

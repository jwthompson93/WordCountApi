package org.thompson.james.textanalysis.object;

import com.google.gson.annotations.JsonAdapter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TextAnalysisResult implements Serializable {
    private transient String sentence;
    private transient String[] splitSentence;
    
    private Integer wordAmount;
    private Double averageWordLength;
    private Map<Integer, Integer> numberOfWordsOfLength;
    private Map<Integer, Integer> highestOccurringWordLength;

    public TextAnalysisResult(String sentence) {
        this.sentence = sentence;
    }

    public TextAnalysisResult(String sentence, String[] splitSentence,
                              Integer wordAmount, Double averageWordLength,
                              Map<Integer, Integer> numberOfWordsOfLength,
                              Map<Integer, Integer> highestOccurringWordLength) {
        this.sentence = sentence;
        this.splitSentence = splitSentence;
        this.wordAmount = wordAmount;
        this.averageWordLength = averageWordLength;
        this.numberOfWordsOfLength = numberOfWordsOfLength;
        this.highestOccurringWordLength = highestOccurringWordLength;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String[] getSplitSentence() {
        return splitSentence;
    }

    public void setSplitSentence(String[] splitSentence) {
        this.splitSentence = splitSentence;
    }

    public Integer getWordAmount() {
        return wordAmount;
    }

    public void setWordCount(Integer wordAmount) {
        this.wordAmount = wordAmount;
    }

    public Double getAverageWordLength() {
        return averageWordLength;
    }

    public void setAverageWordLength(Double averageWordLength) {
        this.averageWordLength = averageWordLength;
    }

    public Map<Integer, Integer> getNumberOfWordsOfLength() {
        return numberOfWordsOfLength;
    }

    public void setNumberOfWordsOfLength(Map<Integer, Integer> numberOfWordsOfLength) {
        this.numberOfWordsOfLength = numberOfWordsOfLength;
    }

    public Map<Integer, Integer> getHighestOccurringWordLength() {
        return highestOccurringWordLength;
    }

    public void setHighestOccurringWordLength(Map<Integer, Integer> highestOccurringWordLength) {
        this.highestOccurringWordLength = highestOccurringWordLength;
    }
}

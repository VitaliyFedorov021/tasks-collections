package ua.com.alevel.tasks.task2;

import java.util.List;
import java.util.Map;

public interface FrequencyOfWords {
    List<Map<String, Integer>> getFrequentWord(List<String> words, Integer limit);
}

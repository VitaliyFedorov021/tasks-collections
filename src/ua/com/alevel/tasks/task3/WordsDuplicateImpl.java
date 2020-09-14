package ua.com.alevel.tasks.task3;

import java.util.*;

public class WordsDuplicateImpl implements WordsDuplicate {

    @Override
    public List<String> getDuplicates(List<String> words, int limit) {
        List<String> duplicate = new ArrayList<>();
        Set<String> wordsSet = toSet(words);
        for (String currentWord:
             wordsSet) {
            int count = 0;
            if (isHaveDuplicate(words, currentWord)) {
                duplicate.add(currentWord);
            }
        }
        duplicate.sort(new CompareForSort());
        int i = limit;
        while (limit < duplicate.size()) {
            duplicate.remove(duplicate.get(i));
        }

        return duplicate;
    }

    private Set<String> toSet(List<String> words) {
        Set<String> wordsSet = new HashSet<>();
        wordsSet.addAll(words);
        return wordsSet;
    }

    private boolean isHaveDuplicate(List<String> words, String word) {
        int count = 0;
        for (String currentWord:
             words) {
            if (currentWord.equalsIgnoreCase(word)) {
                count++;
            }
        }
        boolean res = count > 1 ? true : false;
        return res;
    }

}

package ua.com.alevel.tasks.task3;

import java.util.*;

public class WordsDuplicateImpl implements WordsDuplicate {

    @Override
    public Set<String> getDuplicates(List<String> words, int limit) {
        NavigableSet<String> duplicate = new TreeSet<>(new CompareForSort());
        Set<String> wordsSet = toSet(words);
        for (String currentWord:
             wordsSet) {
            int count = 0;
            if (isHaveDuplicate(words, currentWord)) {
                duplicate.add(currentWord.toLowerCase());
            }
        }
        List<String> tmp = new ArrayList<>();
        tmp.addAll(duplicate);
        if (limit == 0) {
            throw new RuntimeException("Incorrect limit");
        }
        String temp = tmp.get(limit - 1);

        return duplicate.headSet(temp, true);
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

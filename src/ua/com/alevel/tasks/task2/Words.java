package ua.com.alevel.tasks.task2;

import java.util.*;

public class Words implements FrequencyOfWords {
    private static final List<String> words = new ArrayList<>();

    static {
        words.add("Java");
        words.add("Java");
        words.add("Hello");
        words.add("You");
        words.add("You");
        words.add("You");
        words.add("Java");
        words.add("Hello");
        words.add("Java");
        words.add("Cake");
        words.add("Cake");
        words.add("Vlad");
        words.add("Vlad");
        words.add("Hi");
        words.add("Vlad");
        words.add("Vlad");


    }

    @Override
    public List<Map<String, Integer>> getFrequentWord(List<String> words, Integer limit) {
        List<Map<String, Integer>> result = new ArrayList<>();
        Set<String> wordsForCheck = toSet(words);
        int count = 0;
        for (String currentWord :
                wordsForCheck) {
            Map<String, Integer> forList = new HashMap<>();
            forList.put(currentWord, frequency(words, currentWord));
            result.add(forList);
        }
        result.sort(new Compare());
        if (limit > result.size()) {
            throw new RuntimeException("Incorrect limit");
        } else {
            for (int i = limit; i < result.size(); ++i) {
                for (Map.Entry<String, Integer> currentEntry :
                        result.get(i).entrySet()) {
                    result.get(i).remove(currentEntry.getKey());
                }
            }
            return result;
        }
    }

    private Set<String> toSet(List<String> words) {
        Set<String> setOfWords = new HashSet<>();
        for (String currentWord :
                words) {
            setOfWords.add(currentWord);
        }
        return setOfWords;
    }

    private int frequency(List<String> words, String word) {
        int count = 0;
        Set<String> wordsSet = new HashSet<>();
        for (String currentWord :
                words) {
            if (currentWord.equals(word) && wordsSet.add(currentWord)) {
                count = 1;
            } else if (currentWord.equals(word) && !wordsSet.add(currentWord)) {
                count++;
            }
        }
        return count;
    }

    public void action() {
        List<Map<String, Integer>> frequentWords = getFrequentWord(words, 5);
        for (int i = 0; i < frequentWords.size(); ++i) {
            for (Map.Entry<String, Integer> currentEntry :
                    frequentWords.get(i).entrySet()) {
                System.out.println(currentEntry.getKey());
            }
        }
    }

}

package ua.com.alevel.tasks.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Hello");
        words.add("Avd");
        words.add("Avd");
        words.add("al");
        words.add("al");
        words.add("aa");
        words.add("java");
        words.add("Hello");
        words.add("Hi");
        words.add("Vlad");
        words.add("Vlad");
        words.add("Vlad");
        words.add("Cake");
        List<String> result = new WordsDuplicateImpl().getDuplicates(words, 6);
        for (String word:
             result) {
            System.out.println(word);
        }
    }
}

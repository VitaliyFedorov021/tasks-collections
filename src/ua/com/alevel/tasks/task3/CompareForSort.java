package ua.com.alevel.tasks.task3;

import java.util.Comparator;

public class CompareForSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int length = o1.length() - o2.length();
        if (length == 0) {
            return o1.compareTo(o2);
        } else {
            return length;
        }
    }
}

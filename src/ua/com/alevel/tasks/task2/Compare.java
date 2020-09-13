package ua.com.alevel.tasks.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;


public class Compare implements Comparator<Map<String, Integer>> {
    @Override
    public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
        List<Integer> valuesOfFirstMap = new ArrayList<>(o1.values());
        List<Integer> valuesOfSecondMap = new ArrayList<>(o2.values());
        return valuesOfSecondMap.get(0) - valuesOfFirstMap.get(0);
    }
}

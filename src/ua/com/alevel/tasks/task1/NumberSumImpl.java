package ua.com.alevel.tasks.task1;

import java.util.LinkedList;
import java.util.List;

public class NumberSumImpl<T extends Number> implements NumberSum<T> {

    @Override
    public T sum(List<T> numbers) {
        Double sum = 0.0;
        for (T number:
             numbers) {
            String str = String.valueOf(number);
            sum += Double.valueOf(str);
        }
        return (T)sum;
    }
}

package ua.com.alevel.tasks.task1;

import java.util.List;

public interface NumberSum<T extends Number> {
    T sum(List<T> numbers);
}

package ua.com.alevel.tasks.task1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberSumImpl<Integer> numberSum = new NumberSumImpl<>();
        List<Integer> ints = new ArrayList<>();
        NumberSumImpl<Double> numberSum1 = new NumberSumImpl<>();
        List<Double> doubles = new ArrayList<>();
        NumberSumImpl<Short> numberSum2 = new NumberSumImpl<>();
        List<Short> shorts = new ArrayList<>();
        NumberSumImpl<BigInteger> numberSum3 = new NumberSumImpl<>();
        List<BigInteger> listInts = new ArrayList<>();
        listInts.add(new BigInteger("441"));
        listInts.add(new BigInteger("1"));
        listInts.add(new BigInteger("12"));
        listInts.add(new BigInteger("15"));
        ints.add(53);
        ints.add(5);
        ints.add(3);
        ints.add(11);
        ints.add(10);
        ints.add(15);
        ints.add(6);
        doubles.add(5.32);
        doubles.add(10.0);
        doubles.add(10.3);
        doubles.add(23.7);
        doubles.add(8.68);
        shorts.add((short) 1);
        shorts.add((short) 2);
        shorts.add((short) 6);
        shorts.add((short) 10);
        shorts.add((short) 40);
        System.out.format(numberSum.sum(ints) + " " +  numberSum1.sum(doubles) + " " +  numberSum2.sum(shorts) + " " + numberSum3.sum(listInts));
    }
}

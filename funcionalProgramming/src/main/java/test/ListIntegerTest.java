package test;

import java.util.*;
import java.util.stream.Collectors;

public class ListIntegerTest {


    public static void main(String[] args) {
        List<Integer> myLists = Arrays.asList(1, 676,23,11,65,3,4,8,7,56);


        System.out.println("order integer list");
        List<Integer> listSorted = myLists.stream().sorted().toList();
        System.out.println(listSorted);

        System.out.println("#######################");

        System.out.println("order integer list");
        int suma = myLists.stream().filter(n -> n>0).mapToInt(Integer::intValue).sum();
        System.out.println(suma);

        System.out.println("#######################");

        System.out.println("order integer list reversed");
        List<Integer> listSortedReversed = myLists.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(listSortedReversed);

        System.out.println("#######################");

        System.out.println("filter integer pairs in order");
        List<Integer> listPairs = myLists.stream().filter(n -> n%2 == 0).sorted().toList();
        System.out.println(listPairs);

        System.out.println("#######################");

        System.out.println("find the max value");
        int max = myLists.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(max);

        System.out.println("#######################");


        System.out.println("find the statistics of the list");
        IntSummaryStatistics collect = myLists.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Average " +collect.getAverage());
        System.out.println("Count " +collect.getCount());
        System.out.println("Min " +collect.getMin());
        System.out.println("Sum " +collect.getSum());

        System.out.println("#######################");





    }

}

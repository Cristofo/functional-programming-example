package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacesExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        Predicate<String> predicate = s -> s.isEmpty();
        List<String> newList = filterList(list, predicate);

        Predicate<String> filter = s -> s.contains("Basics");
        List<String> filterList = filterList(list, filter);

        List<Integer> intList = List.of(1,4,6,7,8);
        Predicate<Integer> integerFilter = e -> e % 2 == 0;

        List<Integer> integers = filterList(intList, integerFilter);

        System.out.println(integers);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> listNew = new ArrayList<>();
        for (T string: list) {
            if(predicate.test(string)) listNew.add(string);
        }


        return listNew;
    }
}

package test;

import java.util.*;

public class ListStringTest {

    public static void main(String[] args) {


        List<String> myStringList = Arrays.asList("why", "adjs", "level", "bike", "balls", "basketball", "oso");

        System.out.println("#########");
        System.out.println("Sorted List");
        List<String> sorteList = myStringList.stream().sorted().toList();
        System.out.println(sorteList);

        System.out.println("#########");
        System.out.println("find the shortest word");
        String minWord = myStringList.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(minWord);


        System.out.println("#########");
        System.out.println("reverse all the words in the list");
         List<StringBuilder> listWordsReversed = myStringList.stream().map(w -> new StringBuilder(w).reverse()).toList();
        System.out.println(listWordsReversed);

        System.out.println("#########");
        System.out.println("return all the palyndrome words");
        List<String> myPalyndromeList = myStringList.stream().filter(w -> new StringBuilder(w).reverse().toString().equals(w)).toList();
        System.out.println(myPalyndromeList);


    }
}

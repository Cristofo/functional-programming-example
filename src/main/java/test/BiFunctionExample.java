package test;

import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<String, String, Integer> biFunction = (a, b) -> (a + b).length();

        System.out.println(biFunction.apply("hello", "world"));


    }
}

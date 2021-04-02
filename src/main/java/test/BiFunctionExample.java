package test;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction = A_Class :: staticMethod;

        System.out.println(biFunction.apply("hello", "world"));


    }
}

    class A_Class {

        static String staticMethod(String a, String b){
            return a + b ;
        }

    }


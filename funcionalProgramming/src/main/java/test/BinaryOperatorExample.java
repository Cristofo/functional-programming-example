package test;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (a, b) -> a+"."+b ;

        System.out.println(binaryOperator.apply("hello", "world"));
    }
}

package test;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExamples {

    public static void main(String[] args) {
        List<Integer> list = List.of(23,67,8,23,67,89,90);

        Consumer<Integer> consumer = e -> System.out.println(e);
        //consumer.accept(56);

        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {

        for(T t: list){
            consumer.accept(t);
        }

    }
}

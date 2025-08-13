package test;

import java.util.Objects;
import java.util.function.Function;

public class Chaining {

    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = System.out::println;

       // c1.accept("Hello");
       // c2.accept("Hello");

        Consumer<String> c3 = s ->
        {
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("Hello");

        Consumer<String> c4 = c1.thenAccept(c2);

       //c4.accept("c4 call");

        Function<Integer, Integer> f1 = s -> s+2;
        Function<Integer, Integer> f2 = s -> s*2;

        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }


    @FunctionalInterface
    interface Consumer<T> {
        void accept(T t);

       default Consumer<T> thenAccept(Consumer<T> next) {

           Objects.requireNonNull(next);
           return (T t) -> {
               this.accept(t);
               next.accept(t);
           };
       }
    }
}

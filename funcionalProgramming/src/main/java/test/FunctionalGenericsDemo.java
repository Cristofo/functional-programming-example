package test;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> func = s -> s.substring(1,5);
        System.out.println(func.execute("holaaasasasas"));

        FunctionalGenerics<String, Integer> funcInt = s -> s.length();
        System.out.println(funcInt.execute("testsilloo"));
    }

    @FunctionalInterface
    interface FunctionalGenerics<T,R> {
        R execute(T t);
    }
}

package test;

public class TailCallOptimizationExample {
    public static void main(String[] args) {

        System.out.println(reFact(4));
    }

    public static long reFact(int n) {
        if(n <= 1) return 1;
        return n* reFact(n-1);
    }

    // better for preventing stackoverflow
    public static long tailReFact(int n, int a) {

        if(n <= 1) return a;

        return tailReFact(n -1, n * a);
    }
}

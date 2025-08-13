package test;

public class ReferentialTransparencyExample {

    public static void main(String[] args) {

        int result = add(2, multiply(2, multiply(2,2)));
        //int result = add(2, multiply(2,4));
        //int result = add(2, 8);
        System.out.println(result);

    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

}

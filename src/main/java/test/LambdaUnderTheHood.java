package test;

public class LambdaUnderTheHood {

    public static void main(String[] args) {
    /*    MyFuncInterface fun = new MyFuncInterface() {
            @Override
            public void method() {
                System.out.println("Implementation 1");
            }
        };

        MyFuncInterface fun2 = new MyFuncInterface() {
            @Override
            public void method() {
                System.out.println("Implementation 2");
            }
        };*/
        MyFuncInterface fun = () -> System.out.println("I am Light weight");
    }
}

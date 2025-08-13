package test;

public class Test {
    public static void main(String [] args) {
       // MyFuncInterface test =  () -> System.out.println("hola");
       // test.method();

       // Integer x = 100;

       onTheFly(() -> System.out.println("Hello"));
    }

    public static void onTheFly(MyFuncInterface fun){
        fun.method();
    }
}

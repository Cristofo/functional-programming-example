package test;

public class JavClosureExample {

    public static void main(String[] args) {

        int val = 111;
        Task lambda = () -> {
            System.out.println(val);
            System.out.println("task completed");
        };

        printValue(lambda);
    }

    private static void printValue(Task lambda) {
        lambda.doTask();
    }

    @FunctionalInterface
    interface Task {
        void doTask();
    }
}

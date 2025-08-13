package test;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {
        // imperative

        int sumOfEvens = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                sumOfEvens = sumOfEvens + i
;            }
        }
        System.out.println(sumOfEvens);

        //Declarative or Functional

        sumOfEvens = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .reduce((x,y) -> x+y)
                .getAsInt();

        System.out.println(sumOfEvens);

       /* BiIntConsumer intBinary = (a, b) -> System.out.println(a+b);
        intBinary.method(19,1);

        //BiIntConsumer multiply = (a, b) -> System.out.println(a*b);

        multiply.method(10, 90);*/

        LengthOfString function = s ->  {
            int l = s.length();
            System.out.println("The  lenght of the given string is: "+ l);

            return l;
        };
        System.out.println(function.length("holaaasa"));

    }

    interface BiIntConsumer{
        void method(int a, int b);
    }


    interface LengthOfString{
        int length(String a);
    }


}

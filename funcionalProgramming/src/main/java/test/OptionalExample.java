package test;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {

    String val = "A String";
    Optional<String> optional = Optional.of(val);

    //empty
    Optional<Integer> empty = Optional.empty();

    //nullable
    Optional<String> nullable = Optional.ofNullable( val);
    Optional<String> emptyOptional = Optional.ofNullable( null);

    public static void main(String[] args) {
        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);
        Integer integerVal = optional.get();
        System.out.println(integerVal);

        Optional<Integer> emptyOptional = Optional.empty();
        //SemptyOptional.get();
        System.out.println(emptyOptional.isPresent() ? emptyOptional.get() : 0);

        //is Present
        System.out.println(optional.isPresent() ? optional.get() : 0);

        //orElse, OrElseGet

        //orElse
        Integer orElse = emptyOptional.orElse(0);
        System.out.println(orElse);
        //orElseGet

        Integer orElseGet = emptyOptional.orElseGet(() -> 0);
        System.out.println(orElseGet);

        //orElseThrow

        Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
        System.out.println(orElseThrow);

        //orElseThrow() = get()--it's better to use orElseThrow than get()
    }
}

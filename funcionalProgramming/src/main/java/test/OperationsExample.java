package test;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class OperationsExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");

        //map

        String orElse = optional.map(val -> "Replaced").orElse("Empty");
        System.out.println(orElse);

        //filter()
        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
        System.out.println(filter.get());

        //flatMap()
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced By FlatMap"));
        System.out.println(flatMap.get());


        //IfPresent
        Optional<String> optionalIf = Optional.of("Value");
        optionalIf.ifPresent(System.out :: println);

        //ifPresentOrElse
        Optional.empty().ifPresentOrElse(System.out :: println, () -> System.out.println("Value is absent"));

        //Stream
        Stream<String> stream = optional.stream();
        Optional.empty().stream().forEach(System.out :: println);
        optionalIf.stream().forEach(System.out :: println);

        //or
        optionalIf.or(() -> Optional.of("New Value")).ifPresent(System.out :: println);
        Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out :: println);

        //equals

        //optional
        //either botah are empty
        //or if the values in optionals are equal to each other via equals method
        System.out.println(optionalIf.equals(Optional.of("Value")));

        //hashCode
        System.out.println(optionalIf.hashCode());

    }
}

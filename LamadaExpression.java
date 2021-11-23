/*
* Lamada Expression
* Stream API
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LamadaExpression {
    public static void main(String[] args) {

        /*
        * Consumer ->  A Consumer is a functional interface that accepts a single input
          and returns no output
        * Predicate -> A Predicate interface represents a boolean-valued-function of an argument.
          This is mainly used to filter data from a Java Stream.
        * Supplier -> A Supplier is a simple interface which indicates that this implementation
          is a supplier of results, One of the primary usage of this interface to enable deferred execution.
          This means delaying the execution until it is needed. For example,
          Optional class has a method named orElseGet.
        * Function -> A Function interface is more of a generic one that takes one
          argument and produces a result.This has a Single Abstract Method (SAM) apply
          which accepts an argument of a type T and produces a result of type R.
          One of the common use cases of this interface is Stream.map method
        */


        List<String> userList = Arrays.asList("Inzamamul", "Rifat", "Zihad", "Fahad", "Inzamam");


        /*
        Predicate
        */
        List<String> findUser = userList.stream()
                .filter( f -> f.startsWith("I")).collect(Collectors.toList());
        System.out.println(findUser);

        /*
        * Consumer
        */
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(System.out::println);


        /*
        * Function
        */

        List<Integer> nameLength = userList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLength);


        /*
         * Supplier
         */

        Supplier<Double> doubleSupplier = Math::random;
        Optional<Double> optionalDouble = Optional.empty();
        System.out.println(optionalDouble.orElseGet(doubleSupplier));


    }
}

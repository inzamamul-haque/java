import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/*
 *Uses Differernt function of Stream API
 */

public class StreamApi {

    public static void main(String[] args) {
        /*
         * Peek
         *
         * This method exists mainly to support debugging,
         * where you want to see the elements as they flow past a certain point in a pipeline
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> newList = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(newList);



        /*
         *  Comparator
         */

        List<String> userList = Arrays.asList("Inzamamul", "Rifat", "Zihad", "Fahad", "Inzamam");
        List<String> users = userList.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(users);


        /*
         * AnyMatch
         */

        Boolean usersmatch = userList.stream()
                .anyMatch(a -> a.startsWith("I"));
        System.out.println(usersmatch);


        /*
         * Find First
         */

        Optional<String> first = userList.stream()
                .findFirst();
        System.out.println(first.get());



        /*
         * Find Any
         *
         * Using Stream findAny().
           Executing the source code multiple times may not return the same result.
           Every time you may get a different
         */

        Optional<String> findAny = userList.stream()
                .findAny();
        System.out.println(findAny.get());



        /*
        * Reduce
        *
         Many times, we need to perform operations where a stream reduces to single resultant value,
         for example, maximum, minimum, sum, product, etc.
        Reducing is the repeated process of combining all elements.
        */


        String[] array = {"Inzamamul", "Haque", "Rifat"};
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined String
        String_combine.ifPresent(System.out::println);


        /*
         *  FlatMap
         *
         * In very layman terms,
         * flattening is referred to as merging multiple collections/arrays into one.
         *
         * Before flattening   : [[1, 2, 3], [4, 5], [6, 7, 8]]
         * After flattening    : [1, 2, 3, 4, 5, 6, 7, 8]
         *
         */

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfLists);
        System.out.println(listOfAllIntegers);


    }
}

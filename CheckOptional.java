import java.util.Optional;

public class CheckOptional {
    public static void main(String[] args) {
        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Inzamamul Haque";

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value.orElse("hello"));

        // It returns value if available, otherwise returns specified value.
        Optional<String> emptyValue = Optional.empty();
        System.out.println(emptyValue.orElse("hello"));

    }
}

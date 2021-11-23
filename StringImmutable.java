/*
* In Java String is Immutable This means, once we create a string, we cannot change that string.
*/
public class StringImmutable {
    public static void main(String []args) {
       String value = "Hello";

       value.concat(" World!");

       // Yes, value still refers to "Hello"
       System.out.println(value);
    }
}

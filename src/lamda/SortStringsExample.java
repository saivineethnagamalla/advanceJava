package lamda;
import java.util.Arrays;
import java.util.List;

public class SortStringsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", 
        		"Alice", "Bob", "Dave");

        // Sort the list using a lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));

        // Print the sorted list
        System.out.println(names); //[Alice, Bob, Charlie, Dave]
    }
}
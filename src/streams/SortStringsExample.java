package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Dave");

        // Sort the list using a stream and a lambda expression
        List<String> sortedNames = names.stream()
                                        .sorted((s1, s2) -> s1.compareTo(s2))
                                        .collect(Collectors.toList());

        // Print the sorted list
        System.out.println(sortedNames); //[Alice, Bob, Charlie, Dave]
    }
}
package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 1, 6, 4, 7, 2, 5, 9, 0);

        List<Integer> evenSortedNumbers = numbers.stream()  // Create a stream from the list
                .filter(n -> n % 2 == 0)                    // Filter to keep only even numbers
                .sorted()                                   // Sort the filtered numbers
                .collect(Collectors.toList());              // Collect the result into a list

        System.out.println(evenSortedNumbers);              // [0, 2, 4, 6, 8]
    }
}
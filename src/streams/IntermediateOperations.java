package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
		Stream<String> filteredStream = names.stream().filter(name -> name.length() > 3);

		System.out.println(filteredStream.count());
		
//		filter(Predicate<? super T> predicate): Filters elements based on a predicate.
//		map(Function<? super T, ? extends R> mapper): Transforms elements to another form.
//		sorted(): Sorts elements in their natural order.
//		distinct(): Removes duplicate elements.
//		limit(long maxSize): Truncates the stream to a specified number of elements.
	}

}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BothOperations {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

		// Intermediate operations: filter and map
		Stream<String> filteredAndMappedStream = names.stream()
				.filter(name -> name.length() > 3)
				.map(name -> name.toUpperCase());

		// Terminal operation: collect
		List<String> result = filteredAndMappedStream
				.collect(Collectors.toList());

		System.out.println(result); // [ALICE, CHARLIE, DAVE]
		
		
//		List<String> filteredAndMappedStream = names.stream()
//				.filter(name -> name.length() > 3)
//				.map(name -> name.toUpperCase())
//				.collect(Collectors.toList());

	}

}

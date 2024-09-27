package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
		List<String> longNames = names.stream()
				.filter(name -> name.length() > 3)
				.collect(Collectors.toList()); // Terminal operation
	      System.out.println(longNames);
	}
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStreams {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Peter", "Paul", "Mary");
		List<String> filteredNames = names.stream()
				.filter(name -> name.startsWith("P"))
				.collect(Collectors.toList());
		System.out.println(filteredNames);

	}

}

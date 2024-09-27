package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionVsStream {

	public static void main(String[] args) {
		// Using a Collection
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
		List<String> longNames = new ArrayList<>();
		for (String name : names) {
			if (name.length() > 3) {
				longNames.add(name);
			}
		}
		System.out.println(longNames); // [Alice, Charlie, Dave]

		// Using a Stream
		List<String> name1 = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
		List<String> longName1 = name1.stream().filter(name -> name.length() > 3).collect(Collectors.toList());
		System.out.println(longName1); // [Alice, Charlie, Dave]
	}

}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {

		List<String> testValues = 
				Arrays.asList("123", "456", "786");

		List<String> finalValue = testValues.stream()
				.filter(test -> test.endsWith("6"))
				.collect(Collectors.toList());
		System.out.println(finalValue);
		
		List<String> testnames = Arrays.asList("test14","test2","test3","test4","test5");
		
		List<String> testing = testnames
				.stream()
				.filter(name -> name.length() > 5)
				.collect(Collectors.toList());
		System.out.println(testing);

	}

}

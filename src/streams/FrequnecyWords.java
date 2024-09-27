package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequnecyWords {

	public static void main(String[] args) {
		
		List<String> obj = Arrays
				.asList("one","two","three",
						"one","two","three",
						"one","two","four");
		
		Map<String, Long> freqMap = obj.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		freqMap.forEach((n1,n2)-> System.out.println(n1 +" " +n2));
	}

}

package streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequecnyChar {

	public static void main(String[] args) {

		String name = "saivineeth";
		Map<Character, Long> countMap = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(countMap);

		countMap.forEach((a, b) -> System.out.println(a + ":" + b));
	}

}

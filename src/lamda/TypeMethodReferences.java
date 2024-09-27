package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TypeMethodReferences {

	public static void main(String[] args) {
		// ClassName::staticMethodName
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(System.out::println); // 1 2 3 4 5
		// instance::instanceMethodName
		String str = "Hello, World!";
		Supplier<Integer> lengthSupplier = str::length; // Refers to str.length()
		System.out.println(lengthSupplier.get());
		// ClassName::instanceMethodName
		List<String> words = Arrays.asList("dog", "apple", "banana", "cherry");
		words.sort(String::compareToIgnoreCase); // Refers to String.compareToIgnoreCase
		System.out.println(words);

//		Example (Static Method)
//		Lambda Expression: s -> Math.abs(s)
//		Method Reference: Math::abs
//
//		Example (Instance Method)
//		Lambda Expression: s -> s.toUpperCase()
//		Method Reference: String::toUpperCase
//
//		Example (Constructor)
//		Lambda Expression: () -> new ArrayList<>()
//		Method Reference: ArrayList::new

	}

}

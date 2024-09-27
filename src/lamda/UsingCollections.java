package lamda;

import java.util.Arrays;
import java.util.List;

public class UsingCollections {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three");
		list.forEach(item -> System.out.println(item));
	}

}

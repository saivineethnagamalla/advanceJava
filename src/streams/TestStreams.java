package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStreams {

	public static void main(String[] args) {

		List<String> testnames = Arrays.asList("test14", "test2", "test3", "test4", "test5", "test5");
		List<String> finalNames = new ArrayList<>();

		for (String name : testnames) {
			if (name.endsWith("5")) {
				finalNames.add(name);
			}
		}

		System.out.println(finalNames);

	}

}

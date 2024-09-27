package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

public class MapMinMaxExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alice", 30), 
				new Person("Bob", 25), 
				new Person("Charlie", 35));
		
		List<Person> peoples = new ArrayList<>();
		Person p1 = new Person("manu",20);
		peoples.add(p1);

		// Using map() to transform each Person to their name
		List<String> names = people.stream()
				.map(Person::getName)
				.collect(Collectors.toList());

		System.out.println("Names: " + names); // Output: Names: [Alice, Bob, Charlie]

		List<Integer> ages = people.stream().
				map(Person::getAge).
				collect(Collectors.toList());

		System.out.println("Ages : " + ages);

		// Finding the oldest person
		Optional<Person> oldestPerson = people.stream()
				.max(Comparator.comparing(Person::getAge));

		// Finding the youngest person
		Optional<Person> youngestPerson = people.
				stream().min(Comparator.comparing(Person::getAge));

		oldestPerson.ifPresent(oldest -> System.out.println("Oldest: " + oldest)); // Output: Oldest: Charlie (35)
		youngestPerson.ifPresent(youngest -> System.out.println("Youngest: " + youngest));
	
	
	}
}

package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllStreams {

	public static void main(String[] args) {
       List<String> testnames = Arrays.asList("test14","test2",
		"test3","test4","test5","test5");
		
		boolean testing = testnames
				.stream()
				.allMatch(n -> n.startsWith("t"));
		System.out.println("the first " +testing);
		
		boolean testingAny = testnames
				.stream()
				.anyMatch(n -> n.contains("14"));
		System.out.println(testingAny);
		
		long count = testnames.stream().count();
		System.out.println(count);
		
		long countWithoutStreams = testnames.size();
		System.out.println(countWithoutStreams);
		
		List<String> distinctNames = testnames
				                    .stream()
				                    .distinct()
				                    .collect(Collectors.toList());
		System.out.println(distinctNames);
		
		Stream<String> check =  Stream.empty();
		
		System.out.println(check.count());
				
		Optional<String> findAny = testnames.stream()
				.findAny();
		
		findAny.ifPresent(n -> System.out.println(n));
		
		Optional<String> findFirst = testnames.stream()
				.findFirst();
		
		findFirst.ifPresent(n -> System.out.println(n));
		
		testnames.stream().forEach(n -> System.out.println(n));
		
		testnames.stream().forEach(System.out::println);
		
		testnames.stream().forEachOrdered(n -> System.out.println(n));
		
		List<String> nameOfSec = Arrays.asList(
				"The words",
				"let's how",
				"it works");
				
        // Flatten the stream of sentences into a stream of words
		List<String> flatmaps = nameOfSec.stream()
				.flatMap(n -> Arrays.stream(n.split(" ")))
				.collect(Collectors.toList());
		System.out.println(flatmaps);
		
		List<List<String>> nameOfSecs = Arrays.asList(
				Arrays.asList("one","two"),
				Arrays.asList("three","four"),
				Arrays.asList("five","six")
				);
				
		// Flatten the list of lists into a single list
		List<String> flatmap = nameOfSecs.stream()
				.flatMap(n-> n.stream())// (List::stream)
				.collect(Collectors.toList());
		System.out.println(flatmap);
		
		
		List<Integer> intStream =  Arrays.asList(10,15,20,35);
	    int sum =	intStream.stream().reduce(0,(n1,n2) -> n1+n2);
	    System.out.println(sum);
	    
	    String reduceString = nameOfSec.stream()
				.reduce("",(n1,n2) -> n1+ " "+n2); //(String::concat)
		System.out.println(reduceString);
		
		List<Integer> mapNameLeng = testnames
                .stream()
                .map(n->n.length())
                .collect(Collectors.toList());
        System.out.println(mapNameLeng);
        
        Optional<Integer> maxNum = intStream
                .stream()
                .max(Comparator.naturalOrder());
          maxNum.ifPresent(n -> System.out.println(n));
		
          Optional<Integer> minNum = intStream
                  .stream()
                  .min(Comparator.naturalOrder());
          minNum.ifPresent(n -> System.out.println(n));
  		 
          String[] arr = testnames.stream().toArray(String[]::new);
	      
          System.out.println(Arrays.toString(arr));
	

  		List<String> mapSkip = testnames
                  .stream()
                  .skip(2)
                  .collect(Collectors.toList());
          System.out.println(mapSkip);
          
          List<Integer> intSort = Arrays.asList(10,29,89,9);
          
          List<Integer> sorted = intSort
                  .stream()
                  .sorted()
                  .collect(Collectors.toList());
          System.out.println(sorted);  
          
          List<String> peek = testnames
                  .stream()
                  .filter(n ->n.length() > 2)
                  .peek(System.out::println)
                  .map(String::toUpperCase)
                  .peek(m-> System.out.println(m))
                  .collect(Collectors.toList());
          System.out.println(peek);  
	
	
	}

}

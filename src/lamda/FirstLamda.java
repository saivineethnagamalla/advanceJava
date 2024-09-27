package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLamda {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Peter", 
//				"Paul", "Mary");
		//names.forEach(name -> System.out.println(name));
		
		
		ArrayList<String> testNames = new ArrayList<>();
		testNames.add("sai");
		testNames.add("vineeth");
		
		testNames.forEach(name -> System.out.println(name+"test"));
		
		 
		
	}

}

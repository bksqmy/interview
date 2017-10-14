package java8;

import java.util.Arrays;
import java.util.List;

public class ListTest {
	
	
	public static void main(String[] args) {
		//±éÀú
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(str -> System.out.println(str));
		
	}

}

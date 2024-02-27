package arrays;

import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		
		String[] names ={"john"," krish"," shiva"};
		
	// approach 1 -> using for loop
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
   // approach 2 ->using for each loop
		
		for(String name : names) {
			System.out.println(name);
			
	}
		// approach 3 -> using streams
		
		Stream.of(names).forEach(name -> System.out.println(name));
	}

}

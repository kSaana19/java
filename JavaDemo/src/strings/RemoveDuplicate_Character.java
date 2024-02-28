package strings;

public class RemoveDuplicate_Character {

	public static void main(String[] args) {
		// remove duplicate characters in strings
		
		//approach1-> using java8
		
		String str = "programming";
		
		StringBuilder sb1 = new StringBuilder(); 
        str.chars().distinct().forEach(c-> sb1.append((char)c));
        System.out.println(sb1);

	}

}

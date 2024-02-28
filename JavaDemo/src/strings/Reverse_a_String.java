package strings;

public class Reverse_a_String {

	public static void main(String[] args) {
		
	//approach1
//		String str = "krishna reddy";
//		
//		for(int i =str.length()-1; i>0; i--)
//		{
//			System.out.println(str.charAt(i));
//		}
//		
//		   System.out.println(" ");
	//approach 2 
		 String str = "venkata";
		 char[] chArr = str.toCharArray();
		 
		 for(int i = chArr.length-1;i>=0;i--)
		 {
			 System.out.println(chArr[i]);
		 }
	}
	

}

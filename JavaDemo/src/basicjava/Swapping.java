package basicjava;

public class Swapping {

	public static void main(String[] args) {
		
		//swapping of two numbers without using third number
              
		
		int a = 20;
		int b = 40; 
		
		System.out.println("before swapping of two numbers" +a+ " "+b);
		
		
		
//		 a = a*b;
//		 a = a/b;
//		 b = a/b;
		
		
         int c = a;
         a = b;
         b = c;
	 System.out.println("after swapping of two numbers" +a+ " " +b);
		
	}

}

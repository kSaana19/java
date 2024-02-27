package arrays;

public class Sumof_Array {

	public static void main(String[] args) {
		// Calculate the Sum of an Array
        
		
		 int [] arr = new int [] {2, 4, 3, 6, 9};  
	        int sum = 0;  
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	}

}

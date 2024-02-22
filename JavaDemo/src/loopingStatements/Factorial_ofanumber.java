package loopingStatements;

import java.util.Scanner;

public class Factorial_ofanumber {

	public static void main(String[] args) {
		// Write Java program to Find Factorial of a Number
		
		int num;
		long fact;
 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Integer Number : ");
		num = input.nextInt();
 
		//find factorial
		fact = 1;
		for (int i = num; i >= 1; i--)
		{
			fact *= i;
		}
 
		System.out.println(num+" Factorial is : " + fact);
	}

}

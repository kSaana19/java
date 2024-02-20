package controlStatements;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// even or odd
		Scanner Sc = new Scanner(System.in);
		System.out.println(" enter a number : ");
		
		int input  = Sc.nextInt();
		
		if (input %2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}

	}

}

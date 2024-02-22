package loopingStatements;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// . write a program to Check Whether a Given Number is Prime or Not
//		  A prime number is a natural number greater than 1 which has only two factors, 1 & the number itself.
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(" enter a number");
		int num = Sc.nextInt();
		int i,count=0;
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("This is a Prime Number.");
		else
			System.out.println("This is not a Prime Number.");

	}

}

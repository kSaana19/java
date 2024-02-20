package controlStatements;

import java.util.Scanner;

public class ReverseOr_Not {

	public static void main(String[] args) {
		// Reverse Five Digits Number Check Equal or Not in Java
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num = Sc.nextInt();
		int rem ,sum=0,a = num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(a==sum)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}

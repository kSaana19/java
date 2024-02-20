package controlStatements;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// Display the multiplication table of a given integer
		
		int i,j;
		System.out.println("multiplication table");
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("input no of terms : ");
		     j = Sc.nextInt();
		     
		     for(i=1; i<=j; i++)
		     {
		    	 System.out.println(j+ "X"  +i+ "="  +j*i);
		     }
	}

}

package controlStatements;

import java.util.Scanner;

public class StarProgram {

	public static void main(String[] args) {
		// Write a Java program to display the pattern like a right angle triangle with a number.
		
		int i,j,n;
		System.out.println(" input no of rows : ");
		Scanner Sc = new Scanner(System.in);
		      n = Sc.nextInt();
		      
		      for(i=1;i<=n;i++)
		      {
		   	for(j=1;j<=i;j++)
		   	  System.out.print(j);

		       System.out.println(" ");
		       }
	}

}

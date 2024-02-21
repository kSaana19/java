package controlStatements;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		// Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
//		The pattern is as follows :
//
//			1
//			22
//			333
//			4444
		
		int i,j,n;
		System.out.println(" input no of rows : ");
		Scanner Sc = new Scanner(System.in);
		      n = Sc.nextInt();
		      
		      for(i=1;i<=n;i++)
		      {
		    	  for(j=1;j<=i;j++)
		    		  System.out.print(i);
		    	      System.out.println("");
		      }
		      
		     

	}

}

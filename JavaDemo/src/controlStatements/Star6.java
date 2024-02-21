package controlStatements;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {
//input A
//		A B
//		A B C
//		A B C D
//		A B C D E
        
		int alpha = 65;
		int i,j,n;
		System.out.println(" no of rows : ");
		
		Scanner Sc = new Scanner(System.in);
		n = Sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				
				 System.out.print((char)(alpha + j -1) + " ");
			
			System.out.println(" ");
				
		}

	}

}

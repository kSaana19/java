package controlStatements;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		5 5 5 5 5
		
		int i,j,n;
		System.out.println(" no of rows ");
		
		Scanner Sc = new Scanner(System.in);
		n = Sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(i);
			
			System.out.println(" ");
				
		}

	}

}

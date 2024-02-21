package controlStatements;

import java.util.Scanner;

public class Star7 {

	public static void main(String[] args) {
		// 
           int i,j,n;
		 int   alpha = 65;
		System.out.println(" no of rows : ");
		Scanner Sc = new Scanner(System.in);
		n=Sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
				System.out.print((char)(alpha +j - 1)+ " ");
			System.out.println(" ");
				
		}

	}

}

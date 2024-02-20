package controlStatements;

import java.util.Scanner;

public class AlphabetandSpecialCharacter {

	public static void main(String[] args) {
		// Write a program to input any character and check whether it is alphabet, digit or special characte
          
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the values ");
		char ch = Sc.next().charAt(0);
		
		if (ch>'a' && ch <'z' || ch >'A' && ch < 'Z' )
		{
			System.out.println("this is alphabet");
		}
		else if(ch>0 && ch > 9)
		{
			System.out.println(" this is a number");
		}
		else
		{
			System.out.println("this is special character");
		}
	}

}

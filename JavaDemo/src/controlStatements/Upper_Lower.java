package controlStatements;

import java.util.Scanner;

public class Upper_Lower {

	public static void main(String[] args) {
		// Write a program to check whether a character is uppercase or lowercase alphabet

		Scanner Sc = new Scanner(System.in);
		System.out.println(" enter the character");
		char ch = Sc.next().charAt(0);
		
		if(ch>'a' && ch<'z')
		{
			System.out.println(" this is Lowercase");
			
		}
		else
		{
			System.out.println(" this is Uppercase");
		}

	}

}

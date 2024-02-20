package controlStatements;

import java.util.Scanner;

public class CharacterORnot {

	public static void main(String[] args) {
		// Write a program to check whether a character is alphabet or not
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a character : ");
		char ch = Sc.next().charAt(0);
		
		if(ch >'a' && ch<'z'  || ch >'A' && ch<'Z')
		{
			System.out.println("this is alphabet");
		}
		else
		{
			System.out.println("this is alphabet");
		}
	}

	

}

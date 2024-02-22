package loopingStatements;

import java.util.Scanner;

public class Characters_string {

	public static void main(String[] args) {
		// Write Java program to print used different characters (letters) in a string ;
		
		 String text ;
		int count = 0;
		char ch;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(" enter the string");
		text = Sc.nextLine();
		text = text.toUpperCase();
		
		count = 0;
		System.out.println("Following characters are used in the input Text :");
		for(ch= 'A' ;ch<='z';ch++)
		{
			int i;
		    for (int i1=1;i1<text.length();i1++) {
		    	if(ch==text.charAt(i1))
		    		
		    	{
		    		System.out.print( ch + " ");
		    		count++;
		    		break;
		    		
		    	}
		    }
		    	
		    }

	}

}

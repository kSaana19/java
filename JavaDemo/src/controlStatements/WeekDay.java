package controlStatements;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// Write a program to input week number and print week day
         Scanner Sc = new Scanner(System.in);
         System.out.println(" enter a week number(1-7)");
         int num =Sc.nextInt();
         
         if(num == 1)
         {
        	 System.out.println("This is sunday");
         }
         else if(num==2)
         {
             System.out.println("this is monday");        	 
         }
         else if(num==3)
         {
             System.out.println("this is tuesday");        	 
         }
         else if(num==4)
         {
             System.out.println("this is wednesday");        	 
         }
         else if(num==5)
         {
             System.out.println("this is thursday");        	 
         }
         else if(num==6)
         {
             System.out.println("this is friday");        	 
         }
         else
         {
        	 System.out.println("this is satuarday");
         }
         

	}

}

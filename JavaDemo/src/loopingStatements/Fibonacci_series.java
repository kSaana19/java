package loopingStatements;

public class Fibonacci_series {

	public static void main(String[] args) {
		// Write a program to print fibonacci series upto n terms
//		The Fibonacci sequence is a type series where each number is the sum of the two that precede it.
		
		int n1=0,n2=1,sum=0;
		
		System.out.println(n1+ " " +n2);
		for(int i=1;i<=20;i++)
		{
			sum=n1+n2;
			System.out.println(" " +sum);
			n1=n2;
			n2=sum;
			
		}

	}

}

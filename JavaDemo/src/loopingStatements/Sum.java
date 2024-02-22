package loopingStatements;

public class Sum {

	public static void main(String[] args) {
		// Write a program to find sum of all natural numbers between 1 to n
		
		int num = 20,i=1,sum=0;
		
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);
	}

}

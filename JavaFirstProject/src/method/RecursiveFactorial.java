package method;

import java.util.Scanner;

public class RecursiveFactorial {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int fact = factorial(num);
		int add = sum(num);
		System.out.println("The Factorial of "+num+" is "+fact+"." );
		System.out.println("The Sum of "+num+" is "+add+"." );
		

	}
	public static int factorial(int num) {
		if(num <= 1)
			return 1 ;
		
		else 
			return num * factorial(num-1);
	}
	public static int sum(int n) {
		if(n == 1)
			return 1 ;
		
		else 
			return n + sum(n-1);
	}

}

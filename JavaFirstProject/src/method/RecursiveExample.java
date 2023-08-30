package method;

import java.util.Scanner;

public class RecursiveExample {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter First number: ");
		int a = scan.nextInt();
		System.out.print("Enter Second number: ");
		int b = scan.nextInt();
		sum(a,b);
		

	}
	private static void sum(int a, int b) {
		int c = a+b;
		System.out.println("C = "+ c);
		if(c<=100)
		{
			System.out.print("Enter another first number: ");
			int n1 = scan.nextInt();
			System.out.print("Enter another second number: ");
			int n2 = scan.nextInt();
			sum(n1,n2);
		}
		
	}

}

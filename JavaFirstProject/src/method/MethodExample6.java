package method;

import java.util.Scanner;

public class MethodExample6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: " );
		int a = scan.nextInt();
		System.out.print("Enter second number: " );
		int b = scan.nextInt();
		System.out.println("Before Swaping");
		System.out.println("A= "+a +" B= "+b );
		
		swap(a,b);

	}

	private static void swap(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.println("After Swaping " );
		System.out.print("C = "+c+" D = "+d );
	}

}

package method;

import java.util.Scanner;

public class MethodExample9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int length = scan.nextInt();
		System.out.print("Enter Width: ");
		int width = scan.nextInt();
		System.out.println("Area : "+area(length,width));
		System.out.println("Parameter : "+parameter(length,width));
	
		

	}

	private static int parameter(int length, int width) {
		return 2*(length+width);
	}

	private static int area(int length, int width) {
	
		return length*width;
	}
	

}

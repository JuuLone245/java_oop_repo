package SimpleProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base=scan.nextInt();
		System.out.print("Enter height: ");
		int height=scan.nextInt();
		double area = 0.5*(base*height);
		System.out.println("Area of Triangle: "+area);

	}

}

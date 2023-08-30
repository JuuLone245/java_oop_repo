package SimpleProgram;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int length=scan.nextInt();
		System.out.print("Enter Width: ");
		int width=scan.nextInt();
		int area = width*length;
		System.out.println("Rectangle Area: " + area);
	}

}

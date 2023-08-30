package SimpleProgram;
import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		int radius=scan.nextInt();
		final double PI=3.142;
	    double area = PI*radius*radius;
		System.out.println("Area of Circle is " + area);
			
	}

}

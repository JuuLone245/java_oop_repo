package SimpleProgram;
import java.util.Arrays;
import java.util.Scanner;

public class RightTriangleArea {
	static int sides[]=new int [3];
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first side ");
		sides[0]=scan.nextInt();
		System.out.print("Enter second side ");
		sides[1]=scan.nextInt();
		System.out.print("Enter third side ");
		sides[2]=scan.nextInt();
		right();
		
	}
	public static void right()
	{
		Arrays.sort(sides);
		int left = ((sides[0]*sides[0])+(sides[1]*sides[1]));
		int right = sides[2]*sides[2];
		if(left==right)
		{
			System.out.println("This is right triangle");
		}
		else{
			System.out.println("This is not right triangle");
		}
		
	}

}

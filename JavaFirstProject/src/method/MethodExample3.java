package method;

import java.util.Scanner;

public class MethodExample3 {
	static Scanner scan = new Scanner(System.in);
	static float inches;
	static int ft;
	public static void main(String[] args) {
		float ft1=inputData();
		float ft2=inputData();
		float resultfeet=add(ft1,ft2);
		display(resultfeet);
		
	}
	public static void display(float resultfeet) {
		System.out.print("Result : "+resultfeet+" ft.");

	}
	public static float add(float f1,float f2)
	{
		return f1+f2;
	}

	public static float inputData()
	{
		System.out.print("Enter feet: ");
		ft=scan.nextInt();
		System.out.print("Enter inches: ");
		inches=scan.nextFloat();
		if(inches >=12)
		{
			ft++;
			inches-=12;
		}
		float feet=convertFeet();
		return feet;
	}
	public static float convertFeet()
	{
		return ft+(inches/12);
	}
	

}

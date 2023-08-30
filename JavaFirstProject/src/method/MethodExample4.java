package method;

import java.util.Scanner;

public class MethodExample4 {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		multiplication(num);

	}
	public static void multiplication(int num)
	{
		for(int i=1;i<=12;i++)
		{
			System.out.println(num+" * "+i+" : "+(num*i));

		}
	}
}

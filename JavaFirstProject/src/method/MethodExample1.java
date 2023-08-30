package method;

import java.util.Scanner;

public class MethodExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		
		System.out.print("Enter first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter second number: ");
		int num2=scan.nextInt();
		max(num1,num2);  //actual parameter   pass by value
		System.out.print("End program");

	}
	public static void max (int n1,int n2) //formal parameter 
	{
		if(n1>n2)
		{
			System.out.println("Maximum Value: "+n1);
		}
		else
			System.out.println("Maximum Value: "+n2);
	}

}

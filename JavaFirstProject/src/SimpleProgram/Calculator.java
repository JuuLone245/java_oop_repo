package SimpleProgram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=10,num2=30,sum,sub,multi,div;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		char again='y';
		do {
			System.out.print("Enter Operator: (+,-,*,/) : ");
			String operator = scan.next();
			scan.nextLine();
			
			switch(operator)
			{
			case "+" : sum=num1+num2;
						System.out.println("The result is: "+sum);
						break;
			case "-" : sub=num1-num2;
						System.out.println("The result is: "+sub);
						break;

			case "*" : multi=num1*num2;
						System.out.println("The result is: "+multi);
						break;

			case "/" : div=num1/num2;
						System.out.println("The result is: "+div);
						break;
			default: System.out.println("Wrong Input");
			}
			System.out.print("Do you want to calculate again:(y/n) ");
						again = scan.next().charAt(0);
		}while(again=='y');
		System.out.println("System end.");
	}

}

package SimpleProgram;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result=0;
         String again;
         boolean calculate=false;
		// Do-while loop
        do {
        	System.out.print("Enter first number: ");
        	int num1=scan.nextInt();
        	System.out.print("Enter second number: ");
        	int num2=scan.nextInt();
        	System.out.print("Enter operator(+,-,*,/): ");
        	String operator=scan.next();
        	scan.nextLine();
        	switch(operator)
        	{
	        	case "+" : result = num1 + num2; break;
	        	case "-" : result = num1 - num2; break;
	        	case "*" : result = num1 * num2; break;
	        	case "/" : result = num1 / num2; break;
	        	default : System.out.println("Enter Wrong Operator!");
        	}
        	
        	System.out.println("The result of num1 "+operator+" num2 is : "+ result);
        	System.out.print("Do you want to another calculate (y/n): ");
        	again=scan.nextLine();
        	
        	if(again.equals("y")||again.equals("yes")||again.equals("Y"))
        	{
        		calculate=true;
        	}
        	else if(again.equals("n")||again.equals("no")||again.equals("N"))
        	{
        		calculate=false; 
        		System.out.println("The System is ended. Thanks !");
        	}
        }
 
        while (calculate==true);
}
}

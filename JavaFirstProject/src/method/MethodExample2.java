package method;

import java.util.Scanner;

public class MethodExample2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			System.out.print("Enter first num: ");
			int fnum=scan.nextInt();
			System.out.print("Enter second num ");
			int snum=scan.nextInt();
			System.out.print("Enter operator: ");
			char oper=scan.next().charAt(0);
			int result=0;
			
			switch(oper)
			{
				case '+' : result=sum(fnum,snum) ; break;
				case '-' : result=sub(fnum,snum) ; break;
				case '*' : result=multi(fnum,snum) ; break;
				case '/' : result=div(fnum,snum) ; break;
				default : System.out.print("Wrong Input");
			}
			System.out.println("Result "+result);
		}while(repeat());

	}
	public static int sum(int n1,int n2)
	{
		return n1+n2;
	}
	public static int sub(int n1,int n2)
	{
		return n1-n2;
	}
	public static int multi(int n1,int n2)
	{
		return n1*n2;
	}
	public static int div(int n1,int n2)
	{
		return n1/n2;
	}
	public static boolean repeat()
	{
		System.out.print("Do another yes/no: ");
		String status = scan.next();
		if(status.equalsIgnoreCase("yes"))
			return true;
		else 
			return false;
	}
}

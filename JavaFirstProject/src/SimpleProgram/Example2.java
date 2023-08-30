package SimpleProgram;

import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String firstName = scan.next();
		scan.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = scan.nextLine();
		System.out.println("FirstName: "+firstName);
		System.out.println("LastName: "+lastName);
		

	}

}

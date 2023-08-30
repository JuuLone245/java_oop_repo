package SimpleProgram;

import java.util.Scanner;

public class Dolla {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Myanmar Kyats: ");
		int mmk=scan.nextInt();
		double dolla = mmk/1519;
		System.out.println("The relevant amount of Us Dollars:"+dolla);
	}

}

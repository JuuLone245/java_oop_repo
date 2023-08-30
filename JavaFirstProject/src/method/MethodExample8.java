package method;

import java.util.Scanner;

public class MethodExample8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = scan.next().charAt(0);
		System.out.print("Enter the numbers of columns: ");
		int col = scan.nextInt();
		System.out.println("Enter the numbers of line: ");
		int line = scan.nextInt();
		display(ch,col,line);

	}

	public static void display(char ch, int col, int line) {
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
	}

}

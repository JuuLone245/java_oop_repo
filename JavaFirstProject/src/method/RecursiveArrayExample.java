package method;

import java.util.Scanner;

public class RecursiveArrayExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array room: ");
		int room = scan.nextInt();
		int A[]= new int [room];
		for(int i = 0; i < room; i++)
		{
			System.out.print("Enter the value for Room-["+i+"] : ");
			A[i]=scan.nextInt();
		}
		int totalSum = sum(A,A.length-1);
		System.out.println("The result of the sum is: "+ totalSum);
		
	}

	public static int sum(int A[],int b) {
		
		if(b==0)
		{
			return A[0];
		}
		else
			return A[b]+sum(A,b-1);
	}

}

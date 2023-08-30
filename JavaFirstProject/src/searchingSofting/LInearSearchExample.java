package searchingSofting;

import java.util.Scanner;

public class LInearSearchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("The number of element: ");
		int n = scan.nextInt();
		
		int[] A = new int[n];
		for(int i=0;i<A.length;i++)
		{
			System.out.print("Enter a value: ");
			A[i]=scan.nextInt();
		}
		System.out.print("Enter search key: ");
		int key = scan.nextInt();
		linearSearch(A,key);		
		

	}

	private static void linearSearch(int[] A, int key) {
		int i;
		for(i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println(key+" is found at index "+i);
				break;
			}
			
		}
		if(i==A.length)
		{
			System.out.println(key+ "is not found");
		}
		
	}

}

package pratice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the numbers of Alphabet: ");
		int n = scan.nextInt();
		char [] A = new char [n];
		for(int i=0;i<A.length;i++)
		{
			System.out.print("Enter Alphabet: ");
			 A[i] = scan.next().charAt(0);
			
		}
		System.out.print("Enter search alphabet: ");
		char key = scan.next().charAt(0);
		linearSearch(A,key);
		
		

	}

	private static void linearSearch(char[] A, char key) {
		int i;
		for(i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println(key+" is found at index "+i);
				break;
			}
			
		}
		if(i==A.length) {
			System.out.println(key+" is not found");
		}
		
	}

}

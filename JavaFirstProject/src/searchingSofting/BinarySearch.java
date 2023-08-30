package searchingSofting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] A = new int[5];
		for(int i=0;i<A.length;i++)
		{
			System.out.print("Enter data: ");
			A[i]=scan.nextInt();
		}
		System.out.print("Enter search key value: ");
		int key = scan.nextInt();
		int f = 0;
		int l = A.length-1;
		
		while(f<=l)
		{
			int mid = (f+l)/2;
			if(key == A[mid])
			{
				System.out.println(key + " is found at index "+ mid+".");
				break;
			}
			else if(key>A[mid])
				f = mid+1;
			else if(key<A[mid])
				l = mid-1;
		}
		if(f>l)
			System.out.println(key + " is not found.");
		

	}

}

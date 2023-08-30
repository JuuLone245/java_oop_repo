package Array;

import java.util.Scanner;

public class ArrayExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of row: ");
		int row = scan.nextInt();
		System.out.print("Enter number of column: ");
		int col = scan.nextInt();
		int [][] arr = new int [row][col];
		
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Enter a value: ");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Display data array: ");
		for(int i = 0;i<arr.length;i++)		//arr.length=the number of row
		{
			for(int j=0;j<arr[i].length;j++) //arr[i].length=the number of column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

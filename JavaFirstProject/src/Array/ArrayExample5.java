package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day,totalsum=0,below=0,above=0,d;
		System.out.print("Enter Days: ");
		day = scan.nextInt();
		int temp[]=new int[day];
		
		for(int i=0;i<temp.length;i++)
		{
			d=i+1;
			System.out.print("Enter Day " +d+" temperature: " );
			temp[i]=scan.nextInt();
			totalsum+=temp[i];
		}
		System.out.println("Total Temperature : "+totalsum);
		int average =totalsum/day;
		System.out.println("Average temperature : "+average);
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]<average)
			{
				below++;
			}
			else if(temp[i]>average)
			{
				above++;
			}
			
		}
		System.out.println(above+" days were above average temperature");
		System.out.println(below+" days were below average temperature");
		Arrays.sort(temp);
		System.out.println("Sorted Array: "+Arrays.toString(temp));
		System.out.println("Two Coldest day "+temp[0]+","+temp[1]);
		System.out.println("Two Hotest day "+temp[temp.length-2]+","+temp[temp.length-1]);
		int temp2[]=Arrays.copyOf(temp,temp.length);
		boolean equal = Arrays.equals(temp2,temp);
		if(equal)
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not equal");
		Arrays.fill(temp2,34);
		System.out.println("Temp2 array value: "+Arrays.toString(temp2));
	
		
		

	}

}

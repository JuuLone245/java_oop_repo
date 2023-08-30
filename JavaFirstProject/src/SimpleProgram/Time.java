package SimpleProgram;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Hour: ");
		double hr=scan.nextDouble();
		System.out.print("Enter Minute: ");
		double min=scan.nextDouble();
		System.out.print("Enter Second: ");
		double sec=scan.nextDouble();
		double hrtomin=hr*60;
		double sectohr=sec/60;
		double totalTime= hrtomin+min+sectohr;
		System.out.println("The total Minus of given time: "+totalTime);
		
		
		
	
		

	}

}

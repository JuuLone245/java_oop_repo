package method;

import java.util.Scanner;

public class MethodHw1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hr,min,sec;
		boolean condition = true;
		do {
			System.out.print("Enter hour: ");
			hr = scan.nextInt();
			System.out.print("Enter minute: ");
			min = scan.nextInt();
			System.out.print("Enter second: ");
			sec = scan.nextInt();
			
			if((hr<=12)&&(min<=59)&&(sec<=59))
			{
				condition = false;	
			}
			else 
			System.out.println("Please Enter (Format 12:59:59)!!!");
			
		}while(condition);
		
		
		long totaltime = hms_to_secs(hr,min,sec);
		
		System.out.println("Total seconds is: " + totaltime + " seconds");
	}
	
	public static long hms_to_secs(int hr, int min, int sec) {
		int hrtosec = hr*3600;
		int mintosec = min*60;
		long totalsecs = hrtosec + mintosec + sec;
		return totalsecs;
	}

}

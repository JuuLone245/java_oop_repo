package javaoop;

import java.util.Scanner;

public class Exercise {
	String name;
	int age;
	public Exercise()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name: ");
		this.name=scan.nextLine();
		System.out.print("Enter Age: ");
		this.age=scan.nextInt();
	}
	public static void main(String[] args) {
	
		Exercise ex1=new Exercise();
		System.out.println(ex1.name+" "+ex1.age);

	}

}

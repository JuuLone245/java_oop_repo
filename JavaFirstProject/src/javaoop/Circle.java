package javaoop;

import java.util.Scanner;

public class Circle {
	private float radious;
	public Circle()
	{
		radious=1;
	}
	public void setRadious()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Circle Radious: ");
		this.radious=scan.nextFloat();
		
	}
	public double getRadious()
	{
		return radious;
	}
	public void computeDiameter()
	{
		double diameter=2*radious;
		System.out.println("The Circle Diameter is: "+diameter);
	}
	public void computeArea()
	{
		final float PI=(float)3.142;
		float area=(float) (2*PI*radious);
		System.out.println("The Circle Area is: "+area);
	}
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadious();
		circle1.computeDiameter();
		circle1.computeArea();

	}

}

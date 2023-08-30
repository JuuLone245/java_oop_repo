package javaoop;

public class Animals {
	String color="White";
	Animals()
	{
		System.out.println("Animal is created");
	}
	public void display()
	{
		System.out.println("Display method of animal class");
	}

}
class Dog extends Animals{
	String color="black";
	Dog()
	{
		super();
		System.out.println("Dog is created");
	}
	public void display()
	{
		System.out.println("Display the method of dog class");
	}
	public void printColor()
	{
		System.out.println("Color: "+color);
		System.out.println("Color: "+super.color);
		display();
		super.display();
	}
	
}
class TestSuper{
	public static void main(String args[])
	{
		Dog dog = new Dog();
		dog.display();
		dog.printColor();
	
	}
}

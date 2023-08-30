package javaoop;

public class Person {
	
	String name;
	int age;
	
	public Person()
	{
		name="Aung Aung";
		age=30;
	}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	

	public static void main(String[] args) {
		
		Person person1 = new Person();
		System.out.println(person1.name+" "+person1.age);
		Person person2= new Person("Mg Mg",20);
		System.out.println(person2.name+" "+person2.age);
	}

}

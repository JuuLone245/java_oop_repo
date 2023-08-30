package javaoop;

public class Student1 {
	int id;
	String name;
	public Student1()
	{
		id=0;
		name="";
	}
	public Student1(int id,String name)
	{
		this.id=id;
		this.name=name;
				
	}
	public void display()
	{
		System.out.println("Student Information");
		System.out.println("Student Id: "+id+"\nStudent Name: "+name);
	}
	public static void main(String[] args) {
		Student1 st1=new Student1();
		Student1 st2=new Student1(2,"Juu Lone");
		st1.id=1;
		st1.name="Jhone Doe";
		st1.display();
		st2.display();
		
		
	}

}

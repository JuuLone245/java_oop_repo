package javaoop;

public class Student {
	public Student(){
		System.out.println("Student Constructor");
		int age;
	}
	public Student(String name)
	{
		System.out.println("Student Name is "+ name);
	}

	public static void main(String[] args) {
		
		Student st = new Student();
		Student st1 = new Student("Mg Mg");
		
	}

}

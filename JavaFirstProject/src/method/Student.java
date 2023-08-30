package method;

public class Student {
	String name;
	int age;
	static String module = "Unit1 Programming";
	
	public void createStudent()
	{
		System.out.println("Create Student Object "+name+" "+age);
	}
	public static void display()
	{
		System.out.println(module);
	}
	public static void main(String[] args) {
		
		Student ex1 = new Student();
		ex1.name="Su Myat";
		ex1.age=20;
		ex1.createStudent();
		
		Student ex2 = new Student();
		ex2.name="Kyal Sin";
		ex2.age=19;
		ex2.createStudent();
		
		System.out.println(module);
		Student.display();
		
	}

}

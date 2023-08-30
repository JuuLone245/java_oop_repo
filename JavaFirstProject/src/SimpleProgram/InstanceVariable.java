package SimpleProgram;

public class InstanceVariable {
	//Instance Variables
	String name;
	int age;
	//Constructors
	public InstanceVariable(String name,int age){
		this.name=name;
		this.age=age;
	}
	//Methods
	public void introduce()
	{
		System.out.println("Hello My name is "+name+" and my age is "+age+".");
	}
	
	public static void main(String[] args) {
		//Create Objects
		InstanceVariable person1 = new InstanceVariable("Alice",23);
		InstanceVariable person2 = new InstanceVariable("Jhon Doe",31);
		InstanceVariable person3 = new InstanceVariable("Juu Lone",21);
		//Access and modify instance variables
		person1.introduce();
		person3.introduce();
		System.out.println(person2.age);
		
		
	}

}

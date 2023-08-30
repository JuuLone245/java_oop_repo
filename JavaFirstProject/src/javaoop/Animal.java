package javaoop;

public class Animal {
	private String name;
	private int height;
	private String gender;
	
	public void setAnimal()
	{
		name="Bo Bo";
		height=4;
	}
	public String getGender(String gender)
	{
		this.gender=gender;
		return gender;
	}
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.setAnimal();
		System.out.println(dog.name);
		System.out.println(dog.height);
		dog.getGender("Male");
		System.out.println(dog.gender);
		

	}

}

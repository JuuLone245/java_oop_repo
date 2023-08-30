package javaoop;

public class Puppy {
	private int puppyAge;
	public Puppy(String name)
	{
		System.out.println("Name chosen is:"+ name);
	}
	public void setAge(int age)
	{
		puppyAge=age;
	}
	public int getAge()
	{
		return puppyAge;
	}
	public static void main(String[] args) {
		
		Puppy puppy1 = new Puppy("Bo Bo");
		puppy1.setAge(12);
		
		System.out.println("Puppy age is: "+puppy1.getAge());
	}

}

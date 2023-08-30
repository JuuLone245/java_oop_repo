package abstraction;

public class Salary extends Employee{
	double salary;
	
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		this.salary = salary;
	}
	public void setSalary(double salary)
	{
		if(salary >= 0.0)
		{
			this.salary = salary;
		}
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	@Override
	public double computePay() {
		System.out.println("Employee name: "+getName());
		System.out.println("Employee address: "+getAddress());
		System.out.println("Employee number: "+getNumber());
		double result = salary/52;
		return result;
		
	}

}

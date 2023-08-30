package pratice;

public class Salary extends Employee{
	double salary;
	public Salary(String name, String address, int number) {
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
	public double coumputePay() {
		System.out.println("Employee name: "+getName());
		double result = salary/52;
		return result;
	}
	
}

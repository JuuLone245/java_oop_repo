package pratice;

public class Account {
	String name;
	private double amount;
	protected double withdraw;
	
	protected Account()
	{
		System.out.println("Constructor Without Param");
	}
	
	protected Account(String name)
	{
		this.name = name;
		System.out.println("Constructor with Param");
	}
	
	protected void setAmount(double amount)
	{
		if(amount > 0.0)
			this.amount = amount;
	}
	protected double getAmount()
	{
		return this.amount;
	}
	
	
}

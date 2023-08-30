package oopInheritance;

public class SpecialAccount extends Account {

	public SpecialAccount(String name,double withdraw)
	{
		super(name);
		this.withdraw = withdraw;
	}
	public void getResult()
	{
		System.out.println("Username: "+this.name);
		System.out.println("Total Amount: "+getAmount());
		System.out.println("Withdraw Amount: "+this.withdraw);
		System.out.println("Remaining Amount: "+(getAmount()-this.withdraw));
	}
	
	public static void main(String[] args) {
		SpecialAccount sa = new SpecialAccount("Ju Lone",300);
		sa.setAmount(1000);
		sa.getResult();

	}

}

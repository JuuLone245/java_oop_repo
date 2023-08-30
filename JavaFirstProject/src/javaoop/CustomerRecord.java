package javaoop;


public class CustomerRecord {
	private int number;
	private String name,address;
	public void setNumber(int number)
	{
		this.number=number;
	}
	
	public int getNumber()
	{
		return number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getAddress()
	{
		return address;
	}
	public static void main(String[] args) {
		CustomerRecord customer = new CustomerRecord();
		customer.setNumber(1);
		System.out.println("The Customer Number is: "+customer.getNumber());
		customer.setName("Juu Lone");
		System.out.println("The Customer Name is: "+customer.getName());
		customer.setAddress("Insein 8th Street");
		System.out.println("The Customer Address is: "+customer.getAddress());

	}

}

package pratice;

import java.util.Scanner;

public class ElectronicSystem {
	static Scanner scan = new Scanner(System.in);
	static Item[] I;
	static boolean condition=true;
	public ElectronicSystem()
	{
		I = new Item[5];
		I[0]=new Item("TV",700000.00,20);
		I[1]=new Item("Phone",900000.00,10);
		I[2]=new Item("Iron",100000.00,30);
		I[3]=new Item("Oven",400000.00,15);
		I[4]=new Item("Laptop",2700000.00,10);
		
	}
	public void welcomePage()
	{
		do {
			System.out.println("Welcome Electronic System");
			System.out.println("1) View Selling Item List");
			System.out.println("2) Search Item List By Item Name");
			System.out.print("Choose Option: ");
			int option = scan.nextInt();
			switch(option)
			{
			case 1: viewSellingItem();break;
			case 2: searchItem();break;
			default: {
				System.out.println("Wrong Input");
				welcomePage();
			}
			}
			again();
		}while(condition);
	
		
		
	}
	public void searchItem() {
		scan.nextLine();
		System.out.print("Enter Search Item Name: ");
		String sIname = scan.nextLine();
		int i;
		for(i=0;i<I.length;i++)
		{
			if(sIname.equalsIgnoreCase(I[i].getItemName()))
			{
				System.out.println(I[i].getItemName()+" "+I[i].getPrice()+" "+I[i].getQty());
				break;
			}
		}
		if(i==I.length)
		{
			System.out.println(sIname+" is not found");
		}
	}
	
	public void viewSellingItem() {
		for( Item i:I)
		{
			System.out.println(i.getItemName()+" "+i.getPrice()+" "+i.getQty());
		}
		scan.nextLine();
		
	}
	public void again()
	{
		System.out.print("Do you want again(y/n): ");
		String again =scan.nextLine();
		if(again.equalsIgnoreCase("y")||again.equalsIgnoreCase("yes")) {
			condition=true;
		}
		else 
		{
			condition=false;
		}
		
	}

}

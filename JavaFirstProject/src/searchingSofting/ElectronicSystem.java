package searchingSofting;

import java.util.Scanner;

public class ElectronicSystem {
	static Scanner scan = new Scanner(System.in);
	static Item[] I;
	public ElectronicSystem()
	{
		
		I = new Item[5];
		Item i1 = new Item("TV",700000.00,20);
		Item i2 = new Item("Phone",500000.00,10);
		Item i3 = new Item("Microwave",200000.00,7);
		Item i4 = new Item("Iron",100000.00,12);
		Item i5 = new Item("Oven",300000.00,8);
		
		I[0]=i1;
		I[1]=i2;
		I[2]=i3;
		I[3]=i4;
		I[4]=i5;
		
	}
	public void welcomePage() {
		System.out.println("Welcome Electronic System");
		System.out.println("1. View Sell item List");
		System.out.println("2. Search item list by item name: ");
		System.out.print("Choose Option: ");
		int option = scan.nextInt();
		switch (option)
		{
		case 1: ViewSellingItem();break;
		case 2: SearchItem();break;
		default: {
			System.out.println("Wrong Input");
			welcomePage();
			
		}
		}
	}
	
	public void SearchItem() {
		scan.nextLine();
		System.out.println("Enter search Item name: ");
		String sIname=scan.nextLine();
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
			System.out.println(sIname+"is not found");
		}
		
	}
	public void ViewSellingItem() {
		for(Item i : I)
		{
			System.out.println(i.getItemName()+" "+i.getPrice()+" "+i.getQty());
		}
		
	}
}

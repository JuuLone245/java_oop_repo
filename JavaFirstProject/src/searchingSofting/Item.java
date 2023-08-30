package searchingSofting;

public class Item {
	String itemName;
	double price;
	int qty;
	
	public Item(String itemName, double price, int qty) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	


}

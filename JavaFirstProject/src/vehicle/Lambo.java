package vehicle;

public class Lambo extends Car {

	public static void main(String[] args) {
		Lambo lam = new Lambo();
		lam.ViewgetName();

	}

	public void ViewgetName() {
		super.getName("Aung Aung",20);
		
	}

}

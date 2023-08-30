package abstraction;

public class MainClass {

	public static void main(String[] args) {
		Salary sa = new Salary("Mg Mg","Lan Ma taw",3,10000);
		Employee em = new Salary("Ma Ma","Tayoke Tan",5,200000);
		System.out.println(sa.computePay());
		System.out.println(em.computePay());
	}

}

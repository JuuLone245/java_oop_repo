package pratice;

import abstraction.Employee;
import abstraction.Salary;

public class MainClassEmSalary  {

	public static void main(String[] args) {
		Salary sa = new Salary("Juu Lone","Hladen",4,2000);
		Employee em = new Salary("Ma Ma","Tayoke Tan",5,200000);
		System.out.println(sa.computePay());
		System.out.println("-----------------------------------------------");
		System.out.println(em.computePay());
		

	}

}

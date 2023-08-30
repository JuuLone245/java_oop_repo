package interfaceoop;

public class Triangle implements Shape{
	public double a,b,c;
	public Triangle(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public double area() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
}

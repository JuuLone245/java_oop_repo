package pratice;

public class Rectangle implements Shape{
	private double width,height;
	public Rectangle(double width,double height)
	{
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return width*height;
	}

	@Override
	public double parameter() {
		return 2*(width+height);
	}

}

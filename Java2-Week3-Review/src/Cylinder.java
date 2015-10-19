/*
	Cylinder

*/

public class Cylinder extends Circle
{
	double length;

	public Cylinder() { }

	public Cylinder(int x, int y, double r, double l)
	{
		super(x,y,r);
		setLength(l);
	}

	public void setLength(double l)
	{
		length = (l < 0.0) ? 0.0 : l;
	}

	public double getArea()
	{
		return 2.0 * super.getArea() + super.getCircumference() * length;
	}
	public double getVolume()
	{
		return super.getArea() * length;
	}

	public String getName()
	{
		return "Cylinder";
	}
}
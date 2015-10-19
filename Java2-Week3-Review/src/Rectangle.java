/*
	Rectangle

*/

public class Rectangle extends Point
{
	double length, width;

	public Rectangle() { }

	public Rectangle( int x, int y, double l, double w)
	{
		super(x,y);
		setLength(l);
		setWidth(w);
	}
	public void setLength(double l)
	{
		length = (l < 0.0) ? 0.0 : l;
	}
	public void setWidth(double w)
	{
		width = (w < 0.0) ? 0.0 : w;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getPerimeter()
	{
		return 2.0 * (length + width);
	}
	public double getArea()
	{
		return length * width;
	}

	public double getVolume() { return 0.0; }

	public String getName()
	{
		return "Rectangle";
	}
	public String toString()
	{
		return "Location = " + super.toString() + "; length = " + getLength() + ", width = " + getWidth();
	}

}
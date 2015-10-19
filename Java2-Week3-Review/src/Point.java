/*
	Point

 */

public abstract class Point extends Object implements Shape
{
	private int x;
	private int y;

	public Point()
	{

	}

	public Point( int xValue, int yValue)
	{
		x = xValue;
		y = yValue;
	}

	public void setX( int xValue)
	{
		x = xValue;
	}

	public void setY( int yValue)
	{
		y = yValue;
	}

	public int getX() { return x; }

	public int getY() { return y; }


	public String getName()
	{
		return "Point";
	}

	public String toString()
	{
		return "[" + getX() + ", " + getY() + "]";
	}

}
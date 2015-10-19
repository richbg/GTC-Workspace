/*
	Cirlce class

*/

public class Circle extends Point
{
	private final double radius;

	public Circle() { radius = 0.0; }

	public Circle( int x, int y, double radius)
	{
		super(x,y);
		this.radius = (radius < 0.0) ? 0.0 : radius;
	}
/*
	public void setRadius( double r )
	{
		radius = (r < 0.0) ? 0.0 : r;
	}
*/
	public double getRadius()
	{
		return radius;
	}

	public String getName()
	{
		return "Circle";
	}

	public double getDiameter()
	{
		return 2.0 * radius;
	}

	public double getCircumference()
	{
		return Math.PI * getDiameter();
	}

	public double getArea()
	{
		return Math.PI * getRadius() * getRadius();
	}

	public double getVolume() { return 0.0; }

	public String toString()
	{
		return"Center = " + super.toString() + "; Radius = " + getRadius();
	}
}


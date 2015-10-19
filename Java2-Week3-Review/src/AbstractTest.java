/*
	Program to test abstract

*/

import java.text.DecimalFormat;

public class AbstractTest
{
	public static void main( String [ ] args )
	{
		DecimalFormat threeDigits = new DecimalFormat( "0.000");
//		Point point = new Point(7,11);

//		System.out.println("\nFor Sandra, a  " + point.getName() + point);
//		System.out.println(" area of " + point.getName() + " " + point.getArea());
		Cylinder cylinder = new Cylinder(2,7,5.5,8.0);

		Circle circle = new Circle(8,10,45.1);

		System.out.println("\nFor Sandra, a  " + circle.getName() + " " + circle);
		System.out.println(" area of " + circle.getName() + " " + threeDigits.format(circle.getArea()));

		Rectangle rectangle = new Rectangle(9,8,6.5,5.6);

		System.out.println("\nFor Sandra, a  " + rectangle.getName() + " " + rectangle);
		System.out.println(" area of " + rectangle.getName() + " " + threeDigits.format(rectangle.getArea()));


		Shape arrayOfShapes [ ] = new Shape[3];

		arrayOfShapes[0] = cylinder;
		arrayOfShapes[1] = circle;
		arrayOfShapes[2] = rectangle;

		System.out.println("\nUsing an array of shapes:\n");

		for (int i = 0; i < arrayOfShapes.length; i++)
		{
			System.out.println("\nFor Sandra, a  " + arrayOfShapes[i].getName() + " " + arrayOfShapes[i]);
			System.out.println(" area of " + arrayOfShapes[i].getName() + " " + threeDigits.format(arrayOfShapes[i].getArea()));
		}
	}
}
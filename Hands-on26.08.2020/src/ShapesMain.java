import java.util.*;
class Shape
{
	String shapeName;
	Shape()
	{
		
	}
	double calculateArea()
	{
		return 0;
	}
}
class Square extends Shape
{
	private int side;
	Square(int side)
	{
		this.side = side;
		shapeName = "Square";
	}
	double CalculateArea()
	{
		return side*side;
	}
}
class Rectangle extends Shape
{
	private int length;
	private int breadth;
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		shapeName = "Rectangle";
	}
	double CalculateArea()
	{
		return length*breadth;
	}
}
class Circle extends Shape
{
	private int radius;
	Circle(int radius)
	{
		this.radius= radius;
		shapeName = "Circle";
	}
	double CalculateArea()
	{
		return 3.14*radius*radius;
	}
}
class ShapesMain{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Rectangle");
		System.out.println("2 Square");
		System.out.println("3 Circle");
		System.out.println("\tArea Calculator --- Choose a Shape");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			   int l,b;
			   System.out.println("Enter Length and Breadth: ");
			   l = sc.nextInt();
			   b = sc.nextInt();
			   Rectangle rect = new Rectangle(l,b);
			   System.out.println("Area of Rectangle: "+ rect.CalculateArea());
			   break;
			case 2:
			  int s;
			   System.out.println("Enter Side: ");
			   s = sc.nextInt();
			   Square sq = new Square(s);
			   System.out.println("Area of Square: "+ sq.CalculateArea());
			   break;
			case 3:
			   int r;
			   System.out.println("Enter radius: ");
			   r = sc.nextInt();
			   Circle cl = new Circle(r);
			   System.out.println("Area of Circle: "+ cl.CalculateArea());
			   break;
			default:
			   System.out.println("Invalid entry");
			   break;
			
			  
		}
			
	}	
}
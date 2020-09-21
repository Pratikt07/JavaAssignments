import java.util.*;
class circle{
	private float radius;
	private float area;
	void init(float r)
	{
		radius = r;
	}
	void calculateArea()
	{
		area = (float)3.14 * (radius*radius); 
	}
	void display()
	{
		System.out.println("radius = "+radius);
		System.out.println("Area of Circle = "+area);
	}
}

class circleDemo{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		circle c = new circle();
		System.out.println("Enter radius : ");
		float var = sc.nextFloat();
		c.init(var);
		c.calculateArea();
		c.display();
	}
}
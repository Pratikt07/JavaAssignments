import java.util.*;
class MathOperation{
	
	static float add(float a,float b)
	{
		return (float)(a+b);
	}
	static float subtract(float a,float b)
	{
		return (float)(a-b);
	}
	static float multiply(float a,float b)
	{
		return (float)(a*b);
	}
	static float power(float a,float b)
	{
		return (float)Math.pow(a,b);
	}
}

class mathDemo{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		MathOperation c = new MathOperation();
		System.out.println("Enter two numbers : ");
		float var1 = sc.nextFloat();
		float var2 = sc.nextFloat();
		System.out.println("Addition of "+var1+" and "+var2+" is "+c.add(var1,var2));
		System.out.println("Subtraction of "+var1+" and "+var2+" is "+c.subtract(var1,var2));
		System.out.println("Multiplication of "+var1+" and "+var2+" is "+c.multiply(var1,var2));
		System.out.println("power of "+var1+" raised to "+var2+" is "+c.power(var1,var2));
	}
}
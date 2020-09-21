import java.util.*;
class MathOperation{
	
	 float multiply(int a,int b)
	{
		return (float)(a*b);
	}
	 float multiply(float a,float b,float c)
	{
		return (float)(a*b*c);
	}
	 float multiply(double a,int b)
	{
		return (float)(a*(double)b);
	}
	 float multiply(float a[])
	{
		float mul=1;
		for(int i=0;i<a.length;i++)
		{
			mul *= a[i];
		}
		return (float)mul;
	}
	
}

class mathDemo{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		MathOperation c = new MathOperation();
		System.out.println("Enter two int numbers : ");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		System.out.println("multiplication of two int is "+c.multiply(var1,var2));
		System.out.println("Enter three float numbers : ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float cd = sc.nextFloat();
		System.out.println("Multiplication of three floats is "+c.multiply(a,b,cd));
		System.out.println("Enter double number : ");
		double d = sc.nextDouble();
		System.out.println("Enter integer number : ");
		int i = sc.nextInt();
		System.out.println("Multiplication of double and int is "+c.multiply(d,i));
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		float arr[] = new float [size];
		for(int j=0;j<size;j++){
			System.out.println("Enter array element : ");
			arr[j] = sc.nextFloat();
		}
		System.out.println("Multiplication of array elements is "+c.multiply(arr));
	}
}
















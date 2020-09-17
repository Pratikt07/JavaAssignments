class Q3{
	public static void main(String arg[]){

	int x = 2;
	int y = (x*x)+(3*x)-7;
	System.out.println("Expression 1: y = "+y);
	y = x++ + ++x ;
	System.out.println("y = "+y+" and x = "+x);
	int z = x++ - --y - --x  +  x++;
	System.out.println("y = "+y+" and x = "+x+" and z = "+z);
	boolean a = true;
	boolean b = false; 
	boolean c = a && b || !(a || b);
	System.out.println("c = "+c);
 }
}
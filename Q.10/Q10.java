import java.util.*;
class Q10{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		float f = Float.parseFloat(inp1);
		float c = 5*(f-32)/9;
		System.out.println("Fahrenheit = "+f+" and celcius = "+c);
 }
}
import java.util.*;
class Q17{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one Number : ");
		String n = sc.next();
		StringBuffer sbr = new StringBuffer (n);
		System.out.println("String before swap : "+n);
		  sbr.reverse();
		System.out.println("String after swap : "+sbr);		
 }
}
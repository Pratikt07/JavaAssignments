import java.util.*;
class Q9{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		int day = Integer.parseInt(inp1);
		int m = (day%365)%7;
		int year = day/365;
		int week = (day%365)/7;
		int month = (day%365) /30;
		System.out.println("Years = "+year+" Months = "+month+" week = "+week+" Days ="+m); 
 }
}
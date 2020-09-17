import java.util.*;
class Q8{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.next();
		String inp2 = sc.next();
		String inp3 = sc.next();
		float PA = Float.parseFloat(inp1);
		float ROI = Float.parseFloat(inp2);
		float time = Float.parseFloat(inp3);
		float SI = (float)(PA*(1 + ROI*time));
		System.out.println("Simple Interest = "+SI);
 }
}
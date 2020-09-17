import java.util.*;
class Q7{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		String m1 = sc.next();
		String m2 = sc.next();
		String m3 = sc.next();
		String m4 = sc.next();
		String m5 = sc.next();
		float s1 = Float.parseFloat(m1);
		float s2 = Float.parseFloat(m2);
		float s3 = Float.parseFloat(m3);
		float s4 = Float.parseFloat(m4);
		float s5 = Float.parseFloat(m5);
		float sum = s1+s2+s3+s4+s5;
		float per = (float)(sum/(float)5);
		System.out.println("Percentage = "+per+"%");
 }
}
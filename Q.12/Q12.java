import java.util.*;
class Q12{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		float basic = sc.nextFloat();
		float HRA;
		float DA;
		float GS = 0;
		if(basic<10000){
			HRA = (basic*(float)0.1);
			DA = (basic*(float)0.9);
			GS = basic+HRA+DA;
		}
		else if(basic>10000){
			HRA = 2000;
			DA = (basic*(float)0.98);
			GS = basic+HRA+DA; 
		}
		System.out.println("Gross Salary = "+GS);
		
 }
}
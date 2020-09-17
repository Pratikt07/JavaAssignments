import java.util.*;
class Q14{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		
		if( (yr%4==0 && yr%100!=0) || yr%400==0 ){
			System.out.println(yr+" is leap year.");
		}
		else{
			System.out.println(yr+" is not leap year.");
		}
		
	String output = (yr%4==0) ? ( (yr%100==0) ? ( (yr%400==0) ? yr+" is leap year." : yr+" is not leap year." ) : yr+" is leap year.") : ( (yr%400==0) ? yr+" is leap year." : yr+" is not leap year." );
		System.out.println(output);
		
		
 }
}
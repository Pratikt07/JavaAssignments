import java.util.*;
class Q13{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println(a+" is Greatest.");
		}
		else if(b>a && b>c){
			System.out.println(b+" is Greatest.");
		}
		else if(c>a && c>b){
			System.out.println(c+" is Greatest.");
		}
		
		String output = (a>b) ? ( (a>c) ? a+" is greatest." : c+" is Greatest." ) : ( (b>c) ? b+" is Greatest." : c+" is Greatest." );
		System.out.println(output);
		
		
 }
}
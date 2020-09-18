import java.util.*;
class Q16{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = 1;
		for(int i=1;i<=10;i++){
			value = n*i;
			System.out.println(n+" x "+i+" = "+value);
		}		
 }
}
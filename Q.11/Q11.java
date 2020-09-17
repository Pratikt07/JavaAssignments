import java.util.*;
class Q11{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("Numbers Before Swap :");
		System.out.println("i = "+i+" and j = "+j);
		i = i+j;
		j = i-j;
		i = i-j;
		System.out.println("Numbers After Swap :");
		System.out.println("i = "+i+" and j = "+j);
 }
}
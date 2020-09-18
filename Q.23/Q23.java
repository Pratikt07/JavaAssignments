import java.util.*;
class Q23{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int b[] = new int[5];
		for(int i =0,j=a.length-1;i<a.length;i++,j--)
		{
			 a[i] = sc.nextInt();
			 b[j] = a[i];
		}
		System.out.println("Input Array : ");
		for(int t : a){
		System.out.print(t+" ");
		}
		System.out.println(" ");
		System.out.println("Reversed Array :  ");
		for(int p : b){
		System.out.print(p+" ");
		}
		System.out.println(" ");
 	}
}
import java.util.*;
class Q23{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int b[] = new int[5];
		int n = a.length-1;
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
		for(int k=0;k<=n/2;k++){
			int temp = a[n-k];
			a[n-k] = a[k];
			a[k] = temp;
			 	
		}
		System.out.println("Reversed Array :  ");
		for(int q : a){
		System.out.print(q+" ");
		}
 	}
}
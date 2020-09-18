import java.util.*;
class Q21{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		float avg = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			sum += a[i];
		}
		avg = sum / (float)a.length;
		System.out.println("Average = "+avg);
		
 	}
}

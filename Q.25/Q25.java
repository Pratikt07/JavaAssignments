import java.util.*;
class Q25{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		int esum = 0;
		int osum = 0;
		for(int i =0;i<a.length;i++)
		{
			 a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
			if(i%2==0){
				osum += a[i];
			}
			else{
				esum += a[i];
			}
		}
		System.out.println("Sum of even elements : "+esum);
		System.out.println("Sum of odd elements : "+osum);
 	}
}
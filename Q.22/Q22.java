import java.util.*;
class Q22{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		for(int i =0;i<a.length;i++)
		{
			 a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++){
				if(a[i]>a[j])
				{
					int tem = a[j];
					a[j] = a[i];
					a[i] = tem; 
				}
			}
		}
		for(int t : a ){
		System.out.println(t);
		}
 	}
}
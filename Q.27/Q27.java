import java.util.*;
class Q27{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [6];
		for(int i =0;i<a.length;i++)
		{
			 a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++){

			 	if(max< a[j]){
					max = a[j];
				}
				if(min>a[j]){
					min = a[j];
				}
			}
		}
		System.out.println("Smallest no : "+min);
		System.out.println("Greatest no : "+max);
 	}
}
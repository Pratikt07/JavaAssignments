import java.util.*;
class Q26{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[][] = new int [5][5];
		int sum =0;
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			 	a[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++){
				sum += a[i][j];
			}
		}
		System.out.println("Sum of all element : "+sum);
 	}
}
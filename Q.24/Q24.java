import java.util.*;
class Q24{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		boolean flag = false;
		for(int i =0;i<a.length;i++)
		{
			 a[i] = sc.nextInt();
		}
		System.out.println("Enter number to search : ");
		int num = sc.nextInt();
		for(int i =0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println(num+" is at index "+(i+1));
				flag = true;
			}
		}
		if(flag==false)
		{
			System.out.println(num+" is not present in array.");
		}
 	}
}
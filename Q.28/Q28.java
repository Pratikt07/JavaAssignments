import java.util.*;
class Q28{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		char a[] = new char [6];
		for(int i =0;i<a.length;i++)
		{
			a[i] = sc.next().charAt(0);
		}
		for(char c : a){
			System.out.println(c);
		}
 	}
}
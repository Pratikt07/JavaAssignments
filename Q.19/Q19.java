import java.util.*;
class Q19{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int sum = 0;
		int ser = 0;
		for(int i=12,j=0;j<n;){
			sum += i ;
			ser += sum; 
			System.out.print(sum);
			if(j==n-1)
				System.out.print(" = "+ser);
			else
				System.out.print(" + ");
			j++;
			i=10;
		}			
 	}
}
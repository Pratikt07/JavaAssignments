import java.util.*;
class Q20{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = a,i=0;
		boolean flag = true;
		while(n<b){	
			for(i=2;i<n;i++){
				if(n%i==0)
				{
					flag = false;	
				}
			}
			if(flag)
			{
				if(n==b-1)
					System.out.println(n);
				else
					System.out.print(n+" , ");		
			}
			n++;
			flag = true;
		}			
 	}
}
import java.util.*;
class Q18{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i= 2;
		boolean flag = true;
		outer:
		while(flag && i!=0){
			for( i=2;i<n;i++){
				if(n%i==0){
					flag=false;
					break outer;
				}
				
			}
			i=0;
		}
		if(flag==true){
			System.out.println(n+" is a Prime Number.");	
		}
		else{
			System.out.println(n+" is not a Prime Number.");	
		}		
 }
}
import java.util.*;
class Q29{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no fo rows : ");
		int r = sc.nextInt();
		System.out.println("Enter no fo columns : ");
		int c = sc.nextInt();
		int arr[][] = new int [r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<r;i++){
			System.out.println("row = "+i);
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
		
}
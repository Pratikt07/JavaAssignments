import java.util.Scanner;
class Q6{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		float area = (float)(3.14*(r*r));
		float parm = (float)(2*3.14*r);
		System.out.println("Area of circle ="+area);
		System.out.println("Parameter of circle = "+parm);

	}
}
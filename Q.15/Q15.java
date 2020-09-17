import java.util.*;
class Q15{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		char gen = sc.next().charAt(0);
		int age = sc.nextInt();
		System.out.println("Enter Gender (male or female) and age :");
		if((gen == 'M'|| gen == 'm')){
			if(age>=21 ){
				System.out.println("He is Eligible for marriage.");
			}
			else{
				System.out.println("He is not Eligible for marriage.");
			}
		}
		else if((gen == 'f'|| gen == 'F')){
			if(age>=18 ){
				System.out.println("She is Eligible for marriage.");
			}
			else{
				System.out.println("She is not Eligible for marriage.");
			}
		}
		else{
			System.out.println("Insert Wrong Gender");	
		}

String output = (gen == 'M'|| gen == 'm') ? ( (age>=21 ) ? "He is Eligible for marriage." : "He is not Eligible for marriage.") : ( (gen == 'f'|| gen == 'F') ? ( (age>=18 ) ? "She is Eligible for marriage." : "She is not Eligible for marriage." ) : "Insert Wrong Gender");
	System.out.println(output);
		
		
 }
}
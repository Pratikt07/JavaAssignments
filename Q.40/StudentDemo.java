import java.util.*;
class Student{
	String name;
	int roll_no;
	int age;
	float Score;
	Student(String n, int r,int ag , float sc){
		name = n;
		roll_no = r;
		age = ag;
		Score = sc;
	}	
}
class StudentDemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Student p[] = {new Student("Pratik",5,22,75),new Student("adinath",1,23,85),new Student("hrishi",2,23,80),new Student("Laukik",3,23,96),new Student("ram",4,22,60),new Student("virat",6,24,45),new Student("rohit",7,22,50),new Student("mayank",8,23,65),new Student("raj",9,22,88),new Student("sunny",10,22,92)};
		
		System.out.println("Stduents having score between 0 and 50 :");
		for(Student st1 : p){
			if(st1.Score<= (float)50){
				System.out.println(st1.name);
			}
		}
		
		System.out.println("Stduents having score between 50 and 65 :");
		for(Student st1 : p){
			if(st1.Score> (float)50 && st1.Score< (float)65){
				System.out.println(st1.name);
			}
		}
		
		System.out.println("Stduents having score between 65 and 80 :");
		for(Student st1 : p){
			if(st1.Score> (float)65 && st1.Score< (float)80){
				System.out.println(st1.name);
			}
		}
		
		System.out.println("Stduents having score between 80 and 100 :");
		for(Student st1 : p){
			if(st1.Score> (float)80 && st1.Score< (float)100){
				System.out.println(st1.name);
			}
		}
	}
}
	
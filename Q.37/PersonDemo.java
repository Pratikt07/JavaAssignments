import java.util.*;
class Person{
	
	String name;
	int age;
	Person(){
		age = 18;
	}
	Person(int a,String n){
		name = n;
		age = a;
	}	
	void display(){
		System.out.println("name = "+name+" age = "+age);
	}
}

class PersonDemo{
	public static void main(String [] args)
	{
		Person person_1 = new Person();
		Person person_2 = new Person(22,"Pratik");
		person_1.display();
		person_2.display();
	}
}
















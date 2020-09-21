import java.util.*;
class Employee{
	
 	static int empno = 1;
	static float total_salary;
	float sal ;
	static int count;
	Employee(float sal){
		this.empno = empno++;
		this.sal = sal;
		total_salary += sal;
		count++;
	}	
	void display(){
		System.out.println("No of employees are : "+count+" Total salaries of those employees is : "+total_salary);
	}
}

class EmployeeDemo{
	public static void main(String [] args)
	{	
		Employee e1 = new Employee(10000);
		Employee e2 = new Employee(5000);
		Employee e3 = new Employee(15000);
		Employee e4 = new Employee(2000);
		e4.display();
		//e3.display();
		//e2.display();
		//e1.display();
	}
}
















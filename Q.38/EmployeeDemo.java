import java.util.*;
class Employee{
	
	static int count=0;
	static int sum =0;
	int empno;
	float total_salary;
	Employee(float sal){
		this.empno = count++;
		this.sal = sal;
		sum += sal;
		
	}	
	void display(){
		total_salary = sum;
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
















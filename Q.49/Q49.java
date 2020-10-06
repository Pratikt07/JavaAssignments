interface Taxable{
	float salesTax = 0.07f;
	float incomeTax = 0.105f;
	abstract void calcTax();
}


class Employee implements Taxable{
	int empId;
	String name;
	float salary;
	Employee(int id,String n,float s){
		empId = id;
		name = n;
		salary = s;	
	}	
	public void calcTax(){
	float income_tax = (salary * (float)12) *  incomeTax;
	System.out.println("Income tax of yearly salary : "+income_tax);
	}
}
class Product implements Taxable{
	
	int pid;
	float price;
	int quantity;
	Product(int id,float p,int q){
		pid = id;
		price = p;
		quantity = q;	
	}	
	public void calcTax(){
		float sales_tax = (price/(float)quantity) * salesTax;
		System.out.println("Sales tax of unit price of product :  "+sales_tax);
		
	}
}
class Q49{
	public static void main(String [] args){
		Taxable e = new Employee(1,"Pratik",2000);
		Taxable p = new Product(101,500,5);
		e.calcTax();
		p.calcTax();
	}
}
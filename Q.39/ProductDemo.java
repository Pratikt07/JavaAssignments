import java.util.*;
class Product{
	int pid;
	int price;
	int quantity;
	Product(){}
	Product(int id,int p, int q){
		pid = id;
		price = p;
		quantity = q;
	}
	static int SpentAmount(Product a [])
	{
		int sum = 0;
		for(Product ab : a){	
			sum += (ab.price*ab.quantity);
		}
		return sum;
	} 	
}
class ProductDemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Product p [] = new Product[5];
		int max = 0;
		int index = 0; 
		for(int i=0;i<p.length;i++){
			System.out.println("Enter Pid , Price and Quantity :");
			int id =  sc.nextInt();
			int price = sc.nextInt();
			int q = sc.nextInt();
			if(price>max){
				max = price;
				index = i;
			}
			p[i] = new Product(id,price,q);
		}
		Product p1 = new Product();
		System.out.println("Pid havng Highest Price : "+p[index].pid);
		int AmountSpent = p1.SpentAmount(p);
		System.out.println("Total amount spent on products : "+AmountSpent);	
		
	}
}
	
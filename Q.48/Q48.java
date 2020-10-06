abstract class Processor{
	float data;
	void showData(){
		System.out.println(data);

	}
	abstract void process();
	 
}
class factorial extends Processor{
	void process(){
		int n=3;
		int sum =0;
		for(int i=0,j=n-1;i<n;i++,j--)
		{
			sum += (n*j) ;	
		}
		data = sum;
		
	}
}
class circle extends Processor{
	
	void process(){
		float r = 2;
		float area = (float)3.14 * r*r;
		data  = area;
	}
}
class Q48{
	public static void main(String [] args){
		Processor p = new factorial();
		Processor p1 = new circle();
		p.process();
		p1.process();
		p.showData();
		p1.showData();
	}
}
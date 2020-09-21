class Student{
	private int rno;
	private String name;
	private static count;
	Student()
	{
		count++;
	}
	void setData(int r,String n)
	{
		rno = r;
		name = n;	
	}	
	void showData()
	{
		System.out.println(rno+" "+name);
	}
	void getCount()
	{
		System.out.println("No of objects created : "+count);
	}
} 

class SystemDemo{
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.setData(1,"Pratik");
		s1.showData();
		Student s2 = new Student();
		s2.setData(2,"Laukik");
		
	}
}
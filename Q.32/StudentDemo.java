class Student{
	private int rno;
	private String name;
	private static int count;
	Student()
	{
		count++;
	}
	void setData(int rno,String name)
	{
		this.rno = rno;
		this.name = name;	
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

class StudentDemo{
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.setData(1,"Pratik");
		s1.showData();
		Student s2 = new Student();
		s2.setData(2,"Laukik");
		Student s3 = new Student();
		s3.setData(3,"Adinath");
		Student s4 = new Student();
		s4.setData(4,"Hrishi");
		Student s5 = new Student();
		s5.setData(5,"Rahul");		
		s2.getCount();
		
	}
}
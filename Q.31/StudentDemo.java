class Student{
	private int rno;
	private String name;
	void setData(int r,String n)
	{
		rno = r;
		name = n;	
	}	
	void showData()
	{
		System.out.println(rno+" "+name);
	}
} 

class StudentDemo{
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.setData(1,"Pratik");
		s1.showData();
	}
}

public class Student {
	private int rollNo;
	private String name;
	
	public Student()
	{
		this(4240, "Suraj");
		System.out.println("Default constructor called");
	}
	
	public Student(int rollNo,String name)
	{
		System.out.println("pARAMETERISED CONSTRUCTOR called");
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String toString()
	{
		return "Student = [ Roll NO="+rollNo+" Name="+name+"]";
	}
	
	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println(s1);
		
		Student s2=new Student(4220,"Bhushan");
		System.out.println(s2);
	}

}

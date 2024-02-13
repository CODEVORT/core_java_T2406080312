package session_03;

public class Employee {

	private   int empNo;
	private float empSalary;
	private static float totalSalary;
	private static int count;
	
	public Employee(float empSalary)
	{
		count++;
		this.empNo=count;
		this.empSalary=empSalary;
		totalSalary=empSalary+totalSalary;
	}
	
	public static void display()
	{
		System.out.println("Total Employees = "+count+" Total Salary = "+totalSalary);
		
	}
	
	
	public static void main(String args[])
	{
		Employee e1=new Employee(64845.26f);
		Employee e2=new Employee(54845.26f);
		System.out.println(e2.empNo);
		Employee.display();
		
		
	}
	
	
	
	
}

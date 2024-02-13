

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	private static int count;
	
	public Employee()
	{
		//default constructpr
		
	}
	public Employee(int empId, String empName,float empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Employee [empId = "+empId+" ," +"empName = "+empName+" ,"+ "empSalary = "+empSalary+"]";
		
	}
	
	/*static
	{
		System.out.println("Static block called");
		count=60;
	}
	*/
	
	public static void main(String args[])
	{
		System.out.println("Main method is called");
		Employee emp1=new Employee(11,"Rahul",68486.12f);
		System.out.println(emp1);
		Employee emp2=new Employee(12,"Aishwarya",49451.42f);
		System.out.println(emp2);
		Employee emp3=new Employee(13,"Abhishek",56651.46f);
		System.out.println(emp3);
		
		System.out.println("Employee 1 count = "+Employee.getCount());
		System.out.println("Employee 2 count = "+Employee.getCount());
		System.out.println("Employee 3 count = "+Employee.getCount());
	}

}


public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
		System.out.println("Default constructor called");
		empId=111;
		empName="Rahul";
		empSalary=549861d;
	}
	
	public Employee(int id,String name,double salary)
	{
		System.out.println("Parameterised constructor called");
		empId=id;
		empName=name;
		empSalary=salary;
	}
	
	public String toString()
	//string representation of an object
	{
		return "Employee = "+empId+" "+empName+" "+empSalary;
	}
	
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		System.out.println(emp1);
		
		Employee emp2=new Employee(222,"Bhushan",948954.84d);
		System.out.println(emp2);
		
	}
	
	
	

}


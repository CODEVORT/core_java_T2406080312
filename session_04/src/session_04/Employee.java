package session_04;

public class Employee {
	private int empId;
	private String empName;
	private Date date_of_join;
	
	public Employee(int empId,String empName,Date date_of_join)
	{
		this.empId=empId;
		this.empName=empName;
		this.date_of_join=date_of_join;
	}
	
	public String toString()
	{
		return "Employee [empId=" + empId + "," + " empName=" + empName + ", Date_of_join=" + date_of_join + "  ]";
		
	}
	
	public static void main(String args[]) {
		Employee e=new Employee(111,"Rahul", new Date(13,02,2024));
		System.out.println(e);
	}

}

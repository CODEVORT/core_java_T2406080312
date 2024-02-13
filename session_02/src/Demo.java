
public class Demo {
	
	private int day,month,year;
	
	public  int getDay()
	{
		return day;
	}
	public void setDay(int d)
	{
		day=d;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int m)
	{
		month=m;
	}
	
	public int getYear()
	{
		return year;
	}
	public void setYear(int y)
	{
		year=y;
	}
	
	
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.setDay(7);
		d.setMonth(2);
		d.setYear(2024);
		
		System.out.println("Day = "+d.getDay());
		System.out.println("Month = "+d.getMonth());
		System.out.println("Year = "+d.getYear());
	}
	
}



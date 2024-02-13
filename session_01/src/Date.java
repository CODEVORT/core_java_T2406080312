
public class Date {
	private int dd,mm,yy;  //instance variable
	
	public void initDate()
	{
		dd=mm=yy=1;
	}
	
	public void setDate(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void displayDate()
	{
		System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	
	public static void main(String args[])
	{
		//date d;  //reference variable
		//d=new Date;
		
		Date d=new Date();
		
		System.out.println(d.dd);
		d.initDate();
		d.displayDate();
		d.setDate(7, 2, 2024);
		d.displayDate();
	}
	

}

package session_04;

public class Date {
	private int dd,mm,yy;
	private final float PI=3.14f;
//	
//	public Date()
//	{
//		PI=3.14f;
//	}
	
	public Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString()
	{
		return "["+mm+"/"+dd+"/"+yy+"]";
	}
	
	public static void main(String args[])
	{
		Date mydate=new Date(4,02,2022);
		mydate=new Date(13,02,2024);
		System.out.println(mydate);
	}
}

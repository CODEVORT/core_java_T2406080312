package session_07;

public class Test {
	public static void main(String args[])
	{
		try {
			int c=0;
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("c = "+c);
		}
		catch(NumberFormatException  e)
		//Exception e = new ArithmaticException;
		{
			System.out.println("enter only integer values");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter at least 2 values");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured!!!");
		}
	}
}


public class Addition {
	
	
	//Writing methods manually
	/*
	public void add(int a,int b)
	{
		System.out.println("Add = "+(a+b));
	}
	
	public float add(float a, float b)
	{
		float c=a+b;
		return c;
	}
	
	public int add(int a, int b, int c)
	{
		return (a+b+c);
	}
	*/
	
	
	//using for loop   and variable arguments
	/*
	public int add(int...a)
	{
		int len,sum=0;
		len=a.length;
		for(int i=0;i<len;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	*/
	public int add(int...a)
	{
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	
	
	
	
	public static void main(String args[])
	{
		Addition a=new Addition();
		
		
		/*
		a.add(10, 20);
		System.out.println("Add = "+a.add(45.25f, 48.15f));
		System.out.println("Add = "+a.add(25, 12, 9));
		*/
		
		
//		System.out.println("Add = "+a.add(1,2,3,4,5,6,7));
		
		System.out.println("Addition = "+a.add(4,5,6,7,8,9,10));
		
	}
	

}

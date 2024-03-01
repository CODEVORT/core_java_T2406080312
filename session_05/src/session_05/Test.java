package session_05;

public class Test {
	public static void main(String args[])
	{
		//data_type[] arr_name = new data_type[size];
		
		int [] arr = new int [5];
		System.out.println(arr[0]);
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=i+1;
		}
		
		System.out.println("Array Elements are :- ");
		
		for(int a:arr)
		{
			System.out.print(a +"\t");
		}
		
	}
}

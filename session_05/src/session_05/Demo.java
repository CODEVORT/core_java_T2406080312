package session_05;

public class Demo {
	public static void main(String args[])
	{
		int sum=0;
		int [][] arr=new int[2][3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=i+j+1;
			}
		}
		
		System.out.println("Array Elements :-");
		int k=1;
		for(int []i:arr)
		{
			
			
			for(int j:i)
			{
				sum+=j;
			}
			System.out.println("Row "+k+"[ sum = "+sum+"]");
			k++;
			sum=0;
		}
		
	}
}

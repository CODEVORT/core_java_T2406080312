package session_07;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos = null;
		
		try
		{
			fos = new FileOutputStream("d://mn0.txt",true);
			//fos.write(65);
			String str = "JSPM Batch 02";
			byte [] b= str.getBytes();
			fos.write(b);
			System.out.println("Success");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

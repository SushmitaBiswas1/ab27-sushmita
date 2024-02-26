package exceptional_handling;

import java.util.Scanner;

public class ThrowException 
{

	public static void main(String[] args)
	{
			Scanner S1=new Scanner(System.in);
			int age=S1.nextInt();
			if(age>18) 
			{
				System.out.println("Allowed to access google.com");
			}
			else
			{
				throw new ArithmeticException("Not allowed to access google.com");
			}
		
	}
	

}

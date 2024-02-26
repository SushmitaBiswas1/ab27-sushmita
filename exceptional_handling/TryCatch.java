package exceptional_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner S1=new Scanner(System.in);
			int c=1/0;
			int a=S1.nextInt();
			
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Input mismatch exception");
		}
		finally
		{
			System.out.println("No matter what, I will always get executed");
		}
		

	}

}

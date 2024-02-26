package loops;

import java.util.Scanner;

public class Power 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=s1.nextInt();
		System.out.println("Enter the second number:");
		int b=s1.nextInt();
		int c=1;
		for(int i=1;i<=b;i++)
		{
			c=c*a;
		}
		System.out.println(c);

	}

}

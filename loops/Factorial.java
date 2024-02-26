package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		int fact=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number whose factorial you want to know:");
		int a=s1.nextInt();
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);



	}

}

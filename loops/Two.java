package loops;

import java.util.Scanner;

public class Two 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a possitive integer");
		int a=s1.nextInt();
		System.out.println("The multiplication table of " +a+" is:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}

	}

}

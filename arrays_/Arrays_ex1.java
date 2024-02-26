package arrays_;

import java.util.Scanner;

public class Arrays_ex1 
{ 	
	public static void main(String[] args) 
	{
		int rollno[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the Index Numbers " +i);
			rollno[i]=s1.nextInt();
		}
	} 
}



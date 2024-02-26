package string_function;

import java.util.Scanner;

public class Assignment10 
{
	public static void main(String[] args)
	{
	/*	int number[]=new int[4];
		number[0]=78;
		number[1]=89;
		number[2]=100;
		number[3]=4;
	*/
	//syntax of creating an array
		int listofnumber[]= {78,89,100,41};
	  int rollnotocheck=41;
		
		
		for(int i=0;i<=3;i++)
		{
			if(rollnotocheck==listofnumber[i])
			{
				System.out.println("Number to be check is present in a given array:"+listofnumber[i]);
			}
			
		}
		
	}

}

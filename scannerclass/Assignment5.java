package scannerclass;

import java.util.Scanner;

//Ask user to input age using scanner class and by using if and else statement print the message accordingly. 
public class Assignment5 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=s1.nextInt();
		if(age>=18)
		{
			System.out.println("I am an adult");
		}
		else
		{
			System.out.println("I am still young");
		}
		

	}

}

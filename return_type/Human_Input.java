package return_type;

import java.util.Scanner;

public class Human_Input
{
	String insta(String id)
	{
		return id; 
		
	}

	public static void main(String[] args) 
	{
		Human_Input h1=new Human_Input();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the email id: ");
		h1.insta(s1.next());
		

	}

}

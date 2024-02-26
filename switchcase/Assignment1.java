package switchcase;

import java.util.Scanner;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Which case you want to choose:");
		int a=s1.nextInt();
		switch(a)
		{
		case 1: System.out.println("Enter the value of a1:");
				int a1=s1.nextInt();
				System.out.println("Enter the value of a2:");
				int a2=s1.nextInt();
				int add=a1+a2;
				System.out.println("Addition of the a1 and a2 is:" +add);
		case 2: System.out.println("Enter the value of a3:");
				int a3=s1.nextInt();
				System.out.println("Enter the value of a4:");
				int a4=s1.nextInt();
				int sub=a3-a4;
				System.out.println("Subtraction of the a3 and a4 is:" +sub);
		case 3: System.out.println("Enter the value of a5:");
				int a5=s1.nextInt();
				System.out.println("Enter the value of a6:");
				int a6=s1.nextInt();
				int multiply=a5*a6;
				System.out.println("Multiplication of the a5 and a6 is:" +multiply);
		case 4: System.out.println("Enter the value of a7:");
				int a7=s1.nextInt();
				System.out.println("Enter the value of a8:");
				int a8=s1.nextInt();
				int div=a7/a8;
				System.out.println("Division of the a7 and a8 is:" +div);
		default: System.out.println("I am default");
		
		}

	}

}

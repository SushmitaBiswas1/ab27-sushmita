package scannerclass;

import java.util.Scanner;


public class Assignment3 
{
	static int a;
	static int b;
	static Scanner s1=new Scanner(System.in);
	
	static void add()
	{			
		System.out.println("Enter value of a");
		a=s1.nextInt();
		System.out.println("Enter value of b");
		b=s1.nextInt();
		int sum=a+b;
		System.out.println("The Addition of a and b is:" +sum);	
	}
	static void subtract()
	{		
		System.out.println("Enter value of a");
		a=s1.nextInt();
		System.out.println("Enter value of b");
		b=s1.nextInt();
		int sub=a-b;
		System.out.println("The Subtraction of a and b is:" +sub);		
	}
	static void multiply()
	{		
		System.out.println("Enter value of a");
		a=s1.nextInt();
		System.out.println("Enter value of b");
		b=s1.nextInt();
		int mult=a*b;
		System.out.println("The Multiplication of a and b is:" +mult);		
	}
	static void divide()
	{		
		System.out.println("Enter value of a");
		a=s1.nextInt();
		System.out.println("Enter value of b");
		b=s1.nextInt();
		int div=a/b;
		System.out.println("The Division of a and b is:" +div);		
	}
		
	public static void main(String[] args) 
	{
		add();		
		subtract();
		multiply();
		divide();
				
	}

}

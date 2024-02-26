package scannerclass;

import java.util.Scanner;

public class Assignment2 
{
	static void add()
	{		
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("The Addition of a and b is:" +sum);
	}
	static void subtract()
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println("The Subtraction of a and b is:" +sub);
	}
	static void multiply()
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int mult=a*b;
		System.out.println("The Multiplication of a and b is:" +mult);
	}
	static void divide()
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
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

package inheritence_multiple;
interface Addition
{
	void Add();
}
interface Subtraction
{
	void Subtract();
}
interface Multiplication
{
	void Multiply();
}
interface Division
{
	void Divide();
}
public class Assignment1 implements Addition,Subtraction,Multiplication,Division
{

	public static void main(String[] args)
	{
		Assignment1 A1=new Assignment1();
		A1.Add();
		A1.Divide();
		A1.Multiply();
		A1.Subtract();

	}

	public void Divide()
	{
		System.out.println("1");
	}

	
	public void Multiply() 
	{
		System.out.println("2");

	}

	
	public void Subtract() 
	{
		System.out.println("3");

	}

	public void Add() 
	{
		System.out.println("4");

	}

}

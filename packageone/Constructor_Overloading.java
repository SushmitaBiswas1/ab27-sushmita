package packageone;

public class Constructor_Overloading 
{
	Constructor_Overloading()
	{
		System.out.println("non-parameterized constructor");		
	}
	Constructor_Overloading(int a)
	{
		System.out.println("parameterized constructor");
	}
	Constructor_Overloading(String b)
	{
		System.out.println("parameterized constructor2");
	}

	public static void main(String[] args)
	{
		Constructor_Overloading c1=new Constructor_Overloading(); //calling non-parameterized constructor
		new Constructor_Overloading(10101);//calling //parameterized constructor
		new Constructor_Overloading(100); //calling constructor with int parameter
		new Constructor_Overloading("Hellow, how are you doing"); //calling constructor with String parameter
		

	}

}

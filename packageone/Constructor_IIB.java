package packageone;

public class Constructor_IIB 
{
	Constructor_IIB()
	{
		System.out.println("non-para constructor");
	}
	Constructor_IIB(int a)
	{
		System.out.println("para constructor 1");
	}
	Constructor_IIB(char b)
	{
		System.out.println("para constructor 2");
	}
	Constructor_IIB(boolean c)
	{
		System.out.println("para constructor 3");
	}
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args) 
	{
		new Constructor_IIB();
		new Constructor_IIB(100);
		new Constructor_IIB('R');
		new Constructor_IIB(true);
		
	}

}

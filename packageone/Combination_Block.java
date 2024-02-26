package packageone;

public class Combination_Block 
{
	Combination_Block()
	{
		System.out.println("I am Constructor1");
	}
	Combination_Block(int a)
	{
		System.out.println("I am Constructor2");
	}
	{
		System.out.println("I am IIB");
	}
	{
		System.out.println("I am IIB");
	}
	static
	{
		System.out.println("I am SIB");
	}
	public static void main(String[] args) 
	{
		new Combination_Block(100);
		System.out.println("I am main method");
		new Combination_Block();		
	}

}

package packageone;

public class SIB_Block 
{
	static //Static block gets executed first, even before main method
	{
		System.out.println("I am SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("I am main method");

	}

}

package packageone;

public class Assignment6 
{
	void One()
	{
		System.out.println("Calling 1st Non-Static Method");
	}
	void Two()
	{
		System.out.println("Calling 2nd Non-Static Method");
	}
	void Three()
	{
		System.out.println("Calling 3rd Non-Static Method");
	}

	public static void main(String[] args) 
	{
		Assignment6 a1=new Assignment6();
		a1.One();
		a1.Two();
		a1.Three();

	}

}

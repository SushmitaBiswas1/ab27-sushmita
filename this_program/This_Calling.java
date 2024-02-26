package this_program;

public class This_Calling
{
	This_Calling()
	{
		this("sushmita");
		System.out.println("1");
	}
	This_Calling(String a)
	{
		this(true);
		System.out.println("2");

	}
	This_Calling(int age,double salary)
	{
		this('R');
		System.out.println("3");

	}
	This_Calling(char c)
	{
		//this();
		System.out.println("4");

	}
	This_Calling(boolean b)
	{
		this(10,15.98787);
		System.out.println("5");

	}

	public static void main(String[] args) 
	{
		This_Calling t1=new This_Calling();

	}

}

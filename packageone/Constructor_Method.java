package packageone;

public class Constructor_Method 
{
	Constructor_Method() //Constructor method
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("Starting");
		new Constructor_Method(); //creating new object to call Constructor
		Constructor_Method c1=new Constructor_Method();//another way of creating new object to call Constructor
		System.out.println("Ending");

	}

}

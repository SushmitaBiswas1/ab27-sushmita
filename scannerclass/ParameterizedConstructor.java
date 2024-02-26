package scannerclass;

class Constructor
{
	Constructor(String s)
	{
		System.out.println(s);
	}
}

public class ParameterizedConstructor 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Calling Main Method");
		new Constructor("Calling Constructor"); 

	}

}

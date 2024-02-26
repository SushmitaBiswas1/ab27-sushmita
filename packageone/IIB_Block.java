package packageone;

public class IIB_Block 
{
	{ //IIB won't get called unless we create an object
		System.out.println("I am IIB");	
	}
	{ //IIB won't get called unless we create an object
		System.out.println("I am IIB");	
	}
	{ //IIB won't get called unless we create an object
		System.out.println("I am IIB");	
	}
	{ //IIB won't get called unless we create an object
		System.out.println("I am IIB");	
	}
	IIB_Block()
	{
		System.out.println("I am Contstructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am main method");
		new IIB_Block(); //calling IIB and Constructor by creating Object
	}

}

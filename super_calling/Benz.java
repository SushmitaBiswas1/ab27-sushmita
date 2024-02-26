package super_calling;
class Automobiles
{
	Automobiles()
	{
		System.out.println("Super Class Constructor 2"); 
	}
}
class Cars extends Automobiles 
{
	Cars(String a)
	{
		//As the Automobiles constructor is non-parameterized, we need not use the super calling statement explicitly.
		//They'll be called automatically by the default super calling constructor.
		System.out.println("Super Class Constructor 1");
	}
}

public class Benz extends Cars
{
	Benz()
	{
		super("call cars constructor");		
		//As the super class (Cars) constructor is parameterized, we need to use the super calling statement explicitly.
		System.out.println("Sub class Constructor");
	}

	public static void main(String[] args) 
	{
		new Benz();

	}

}

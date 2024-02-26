package abstract_intrerface;

//assignment 54

interface Money
{
	abstract void Professor();
}
interface Hiest
{
	abstract void Rio();

}
abstract class Denver implements Money,Hiest
{
	abstract void Berlin();
}

public class Smart extends Denver
{
	public static void main(String[] args) 
	{
		Smart s1=new Smart();
		s1.Berlin();
		s1.Professor();
		s1.Rio();
	}

	
	public void Professor() 
	{
		System.out.println("Money Hiest 1");
	}

	
	public void Rio() 
	{
		System.out.println("Money Hiest 2");
	}

	
	void Berlin() 
	{
		System.out.println("Money Hiest 3");
	}

}

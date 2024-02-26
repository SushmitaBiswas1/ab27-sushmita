package abstract_intrerface;

//assignment 55
interface Merry
{
	abstract void cherish();
}
interface Christmas
{
	abstract void joy();
}
abstract class abs implements Merry,Christmas
{
	abstract void celebrate();
}

public class Myntra extends abs
{
	public static void main(String[] args)
	{
		Myntra m1=new Myntra();
		m1.celebrate();
		m1.cherish();
		m1.joy();
	}

	
	public void cherish()
	{
		System.out.println("Cherish");
	}

	
	public void joy() 
	{
		System.out.println("Joy");

	}

	
	void celebrate() 
	{
		System.out.println("Celebrate");

	}

}

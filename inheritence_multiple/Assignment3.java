package inheritence_multiple;

interface I1
{
	void add();
}
interface I2 extends I1
{
	void sub();
}
abstract class Abs1 implements I1
{
	abstract void div();
}
public class Assignment3 extends Abs1
{

	public static void main(String[] args)
	{
		Assignment3 A3=new Assignment3();
		A3.add();
		A3.div();
	

	}

	
	public void add() 
	{
		System.out.println("1");
	}

	void div()
	{
		System.out.println("2");

	}

}

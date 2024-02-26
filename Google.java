package abstract_intrerface;
//assignment 50

interface I1
{
	abstract void add();
}
interface I2 extends I1
{
	abstract void multiply();
}
public class Google implements I2
{
	public static void main(String[] args) 
	{
		Google g1=new Google();
		g1.add();
		g1.multiply();
	}

	public void add() 
	{
		System.out.println("Addition");
	}

	public void multiply()
	{
		System.out.println("Multiplication");

	}

}

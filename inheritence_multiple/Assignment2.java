package inheritence_multiple;
interface State
{
	void add();
}
interface City
{
	void subtract();
}
abstract class Country implements City,State
{
	abstract void multiply();
}
public class Assignment2 extends Country
{

	public static void main(String[] args) 
	{
		Assignment2 A2=new Assignment2();
		A2.add();
		A2.multiply();
		A2.subtract();

	}

	
	public void subtract() 
	{
		System.out.println("1");
	}

	
	public void add()
	{
		System.out.println("2");

	}

	
	void multiply()
	{
		System.out.println("3");

	}

}

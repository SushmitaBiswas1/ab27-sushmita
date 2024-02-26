package inheritence_multiple;
interface America
{
	void add();
}
interface Africa
{
	void div();
}
interface India
{
	void mult();
}
public class Assignment4 implements India
{
	public static void main(String[] args)
	{
		Assignment4 A4=new Assignment4();
		A4.mult();
	}

	
	public void mult() 
	{
		System.out.println("11111");
	}

}

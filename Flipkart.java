package abstract_intrerface;
//assignment 51

interface I4
{
	abstract void add();

}
abstract class A1 implements I4
{
	abstract void sub();
	void mul()
	{
		System.out.println("Concrete Method");
	}
    
}
public class Flipkart extends A1
{
	
	public static void main(String[] args) 
	{
		Flipkart f1=new Flipkart();
		f1.add();
		f1.mul();
		f1.sub();
	}
	
	

	public void add() 
	{
		System.out.println("Addition");

	}

	
	void sub() 
	{
		System.out.println("Subtract");
	}

}

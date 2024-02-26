package abstract_intrerface;
//assignment 56
interface Android
{
	abstract void Nokia();
}
interface Mac
{
	abstract void iPhone();
	
}
interface Keypad
{
	abstract void blackberry();
}


public class Mobile implements Keypad,Mac,Android
{

	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		m1.blackberry();
		m1.Nokia();
		m1.iPhone();

	}

	
	public void Nokia() 
	{
		System.out.println("Android");
	}

	
	public void iPhone() 
	{
		System.out.println("MAC");

	}

	
	public void blackberry() 
	{
		System.out.println("Keypad");

	}

}

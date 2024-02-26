package type_casting;
class India
{
	void Method1()
	{
		System.out.println("1");
	}
}
class Telengana extends India
{
	void Method2()
	{
		System.out.println("2");
	}
	
}
public class Hyderabad extends Telengana
{
	void Method3()
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		Telengana T1=new Hyderabad();
		T1.Method2();
		T1.Method1();

	}

}

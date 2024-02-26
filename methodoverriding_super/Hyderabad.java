package methodoverriding_super;
class Telengana
{
	void ITHUB(int a)
	{
		System.out.println("I am the State");		
	}
}

public class Hyderabad extends Telengana
{
	void ITHUB(int a)
	{
		System.out.println("I am the City");
		super.ITHUB(12);
	}

	public static void main(String[] args) 
	{
		Hyderabad H1=new Hyderabad();
		H1.ITHUB(10);

	}

}

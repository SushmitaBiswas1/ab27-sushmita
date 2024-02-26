package access_specifier;

class Subjects 
{
	public void Science()
	{
		System.out.println("Public Access Specifier");
	}

	private static void Maths()
	{
		System.out.println("Private Access Specifier");

	}

	protected void English()
	{
		System.out.println("Protected Access Specifier");

	}

	 void Hindi() 
	{
		System.out.println("Package/Default Access Specifier");
	}
}

public class AssignmentB {

	public static void main(String[] args)
	{
		Subjects s1=new Subjects();
		s1.English();
		s1.Science();
		Maths();
		s1.Hindi(); 
		
		

	}

}

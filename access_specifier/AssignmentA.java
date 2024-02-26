package access_specifier;

public class AssignmentA 
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
	static void Hindi()
	{
		System.out.println("Package/Default Access Specifier");

	}

	public static void main(String[] args) 
	{
		AssignmentA a1=new AssignmentA();
		a1.English();
		a1.Science();
		Maths();
		Hindi();
		

	}

}

package inheritence_hierarchical;

class Parent
{
	static void M1()
	{
		System.out.println("Parent");
	}
}
class Son extends Parent
{
	static void M2()
	{
		System.out.println("Son");
	}
}
public class Daughter extends Parent
{ 
	static void M3()
	{
		System.out.println("Daughter");
	}

	public static void main(String[] args) 
	{
		M3();
		M1();
	
	}

}

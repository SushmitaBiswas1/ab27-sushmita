package inheritance_hierarchical;


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
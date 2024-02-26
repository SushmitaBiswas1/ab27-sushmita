package type_casting;

class New1
{
	void One()
	{
		System.out.println("1");
	}
}
class New2 extends New1
{
	void Two()
	{
		System.out.println("2");
	}
	
}
class New3 extends New2
{
	void Three()
	{
		System.out.println("3");
	}
	
}

public class Assignment5 extends New3
{
	void Four()
	{
		System.out.println("4");
	}

	public static void main(String[] args)
	{
		New2 n1=		new New3();
		n1.One();
		n1.Two();
		New3 n2   =new Assignment5();//upcasting from assignment 5 to new3
		Assignment5 a1=		(Assignment5)			n2;//downcasting from new3 to assign5
		a1.Four();
		
	}

}

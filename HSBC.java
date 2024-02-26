package abstract_intrerface;
//assignment 53


interface ii1
{
	abstract void aa1();
}
interface ii2
{
	abstract void aa2();
}
interface ii3
{
	abstract void aa3();
}
interface ii4
{
	abstract void aa4();
}

public class HSBC implements ii1,ii2,ii3,ii4
{
	public static void main(String[] args) 
	{
		HSBC h1=new HSBC();
		h1.aa1();
		h1.aa2();
		h1.aa3();
		h1.aa4();
	}

	
	public void aa1()
	{
		System.out.println("1");
	}


	
	public void aa4() 
	{
		System.out.println("4");

	}


	public void aa3() 
	{
		System.out.println("3");

	}


	public void aa2()
	{
		System.out.println("2");

	}

}

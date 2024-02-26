package abstract_intrerface;

//assignment 52

interface logs
{
	abstract void logging();
}
interface packs
{
	abstract void logging_out();
}
public class AWS implements logs,packs
{
	public static void main(String[] args)
	{
		AWS a1=new AWS();
		a1.logging();
		a1.logging_out();
	}

	
	public void logging_out() 
	{
		System.out.println("logout");
		
	}

	
	public void logging() 
	{
		System.out.println("login");

	}

}

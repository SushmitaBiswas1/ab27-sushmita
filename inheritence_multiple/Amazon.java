package inheritence_multiple;

interface code4 //interface
{
	void login(); //abstract method
}

abstract class code3 implements code1 //abstract class
{
	abstract void logout(); //abstract method
}

public class Amazon extends code3
{
	public static void main(String[] args)
	{
		Amazon a1=new Amazon();
		a1.login();
		a1.logout();
	}

	
	public void login() 
	{
		System.out.println("code1");
	}

	
	void logout() 
	{
		System.out.println("code2");

	}


	@Override
	public void auth() {
		// TODO Auto-generated method stub
		
	}

}

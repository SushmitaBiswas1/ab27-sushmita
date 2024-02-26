package abstract_intrerface;

interface Amazon
{
	void login();  //abstract method
	void logout();	
}

public class Customer implements Amazon
{

	public static void main(String[] args) 
	{
		Customer C1=new Customer();
		C1.login();
		C1.logout();

	}

	public void login() 
	{
		System.out.println("Logic of Login");  //logic of Abstract method
	}

	public void logout() 
	{
		System.out.println("Logic of Logout"); //logic of Abstract method

	}

}

package inheritence_multiple;
//Multiple Level Inheritance 
interface code1 //interface
{
	void login(); //abstract metho
	void auth();
}
interface code2 extends code1
{
	void logout();
}
public class Telecom implements code2
{

	public static void main(String[] args) 
	{
		Telecom t1=new Telecom();
		t1.login();
		t1.auth();
		t1.logout();

	}

	public void login() 
	{
		System.out.println("Logic of Login");
	}

	public void auth() 
	{
		System.out.println("Logic of auth");

	}

	public void logout()
	{
		System.out.println("Logic of Logout");

	}

}

package inheritence_multiple;
//multiple level inheritance can be achieved using interface
interface district
{
	void login();
}
interface council
{
	void logout();
}
public class Multiple implements council,district
{

	public static void main(String[] args)
	{
		Multiple m1=new Multiple();
		m1.login();
		m1.logout();

	}

	public void login()
	{
		System.out.println("state");
	}

	
	public void logout()
	{
		System.out.println("city");

	}

}

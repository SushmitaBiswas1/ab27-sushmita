package getter_setter;
class Google
{
	private String Username="GrotechMinds@gmail.com";
	public String getUsername()
	{
		return Username;
	}
	public void settUsername(String Username)
	{
		this.Username=Username;
		 
	}
}

public class GetterSetter 
{

	public static void main(String[] args) 
	{
		Google g1=new Google();
		g1.settUsername("sushmita@gmail.com");
		System.out.println(g1.getUsername());

	}

}

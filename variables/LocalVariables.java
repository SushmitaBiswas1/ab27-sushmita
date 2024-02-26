package variables;

public class LocalVariables 
{
	static void add(int a, double b) // a and b are Local Variables
	{
		System.out.println(a+b); 
		//the variables that are declared inside any method are local variables
	}

	public static void main(String[] args) 
	{
		add(100,100.1);
		
	}

}

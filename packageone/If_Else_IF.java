package packageone;

public class If_Else_IF {

	public static void main(String[] args)
	{
		int a=18;
		if(a>18)
		{
			System.out.println("1");
		}
		else if(a<18) 
		{
			System.out.println("2");
		}
		else if(a!=18) 
		{
			System.out.println("3");
		}
		else if(a!=100) //Condition is true > first
		{
			System.out.println("4"); 
		}
		else if(a>=18) //Condition is true > second
		{
			System.out.println("5");
		}
		else
		{
			System.out.println("6");
		}
						

	}

}

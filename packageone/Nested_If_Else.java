package packageone;

public class Nested_If_Else {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		if(a<15) //true
		{
			if(b==20) //true
			{
				if(a!=10) //false
				{
					System.out.println("1");
				}
				else //this will get executed
				{
					System.out.println("hello");
				}
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			System.out.println("3");
		}

	}

}

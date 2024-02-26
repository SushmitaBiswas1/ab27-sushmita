package variables;

public class GlobalStatic
{
	static int a;
	static int b;
	static void add()
	{
		a=20;
		b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		a=45;
		b=20;
		int sub=a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		add();
		subtract();
	}	

}

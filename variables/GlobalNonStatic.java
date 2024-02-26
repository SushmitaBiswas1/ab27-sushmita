package variables;

public class GlobalNonStatic 
{
	int a=45;
	int b=5;
		
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		int sub=a-b;
		System.out.println(sub);
	} 

	public static void main(String[] args) 
	{
			add();
			subtract(); 
	}

}

package packageone;

public class Method_Overloading1
{
	static void over(int a) //static method
	{
		System.out.println(a);
	}
	static void over(double a) //static method
	{
		System.out.println(a);
	}
	void over(char a) //non-static method
	{
		System.out.println(a);
	}
	void over(boolean a) //non-static method
	{
		System.out.println(a);
	}
	void over(String a) //non-static method
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
			over(101); //calling static method which has integer argument
			over(101.1); //calling static method which has double argument
			Method_Overloading1 m1=new Method_Overloading1(); //creating object with reference variable to call non-static method
			m1.over('R'); //calling non-static method with reference variable which has char argument
			m1.over(true);//calling non-static method with reference variable which has boolean argument
			m1.over("Hello World");//calling non-static method with reference variable which has string argument

	}

}

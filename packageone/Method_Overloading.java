package packageone;

public class Method_Overloading 
{
	static void add(int a) //static method
	{
		System.out.println(a);
	}
	void add(int a, int b) //non-static method
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		add(100); //calling static method
		Method_Overloading m1=new Method_Overloading(); //creating an object with reference variable
		m1.add(101,202); //calling non-static method using reference variable
	
		
	}
			
}

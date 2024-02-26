/*Create many static method and call in inside a main method*/
package packageone;

public class StaticMethod {
	static void add()
	{
		System.out.println("biswas");
	}

	public static void main(String[] args) //main method
	{
		add(); // calling a static method inside a main method
		System.out.println("sushmita");
		sub(); // calling a static method inside a main method	
		multiply();
	}
	static void sub()
	{
		System.out.println("subract");
	}
	static void multiply()
	{
		System.out.println("multiply");
	}
}
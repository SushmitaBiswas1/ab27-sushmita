/*Sushmita Biswas AB_37 Assignment 2
WAP to create a Class with 2 static and 2 non static methods, perform add and sub in
first two. Multiply and divide in last two and call in main method*/

package packageone;

public class Non_Static_Method {

	static void addion() //static method
	{
		int a1=100;
		int a2=200;
		int add=a1+a2;
		System.out.println(add);
				
	}
	static void subtraction() //static method
	{
		int a1=100;
		int a2=200;
		int subtract=a1-a2;
		System.out.println(subtract);
	}
	void multiplication() //non-static method
	{
		int a1=100;
		int a2=200;
		int multiply=a1*a2;
		System.out.println(multiply);
	}
	void division() //non-static method
	{
		int a1=100;
		int a2=200;
		int divide=a2/a1;
		System.out.println(divide);
	}
	public static void main(String[] args) 
	{
		addion(); //calling static method
		Non_Static_Method n1=new Non_Static_Method(); //creating a new object
		n1.multiplication(); //calling non-static method using new object reference variable
		subtraction(); //calling static method
		n1.division(); //calling non-static method using new object reference variable

	}

}

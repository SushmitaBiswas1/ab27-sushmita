package abstract_class;

class Teacher
{
	static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is:" +c);
		
	}
	void subtract()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("Subtraction is:" +c);
		
	}
	
}
abstract class Mentor extends Teacher
{
	abstract void multiply();
	abstract void divison();
}
public class Student extends Mentor
{
	static void area()
	{
		final double pi=3.14;
		double r = 20;
		double area=pi*r*r;
		System.out.println("Area of circle is:" +area);	
				
	}
	void circumference()
	{
		final double pi=3.14;
		double r = 20;
		double circum=2*pi*r;
		System.out.println("Circumference of circle is:" +circum);
				
	}

	public static void main(String[] args) 
	{
		System.out.println("I am Main Method");
		Student s1=new Student();
		add();
		s1.subtract();
		s1.multiply();
		s1.divison();
		area();
		s1.circumference();

	}
	
	void multiply() 
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Multiplication is:" +c);
		
	}
	
	void divison() 
	{
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println("division is:" +c);
		
	}

}

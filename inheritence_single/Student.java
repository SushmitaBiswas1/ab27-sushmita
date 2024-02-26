package inheritence_single;

class Teacher
{
	void selenium() 
	{
		System.out.println("Selenium");
		
	}
	void java()
	{
		System.out.println("Java");
	}
	
	
}
public class Student extends Teacher
{
	static void gk()
	{
		System.out.println("General Knowledge");
		
	}

	public static void main(String[] args) 
	{
		Student s1=new Student();
		gk();
		s1.selenium();
		s1.java(); 
		
	}

}

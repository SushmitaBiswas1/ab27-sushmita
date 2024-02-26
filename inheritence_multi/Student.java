package inheritence_multi;

class Teacher
{
	void selenium()
	{
		System.out.println("Super Class 2");
	}
	
}
class Mentor extends Teacher
{
	 void Java()
	{
		System.out.println("Super Class 1");
	}
}
public class Student extends Mentor
{
	void GK()
	{
		System.out.println("Sub Class");
	}

	public static void main(String[] args) 
	{
		Student S1=new Student();
		S1.GK();
		S1.selenium();
		S1.Java(); 
		

	}

}

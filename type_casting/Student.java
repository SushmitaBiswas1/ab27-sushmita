package type_casting;
class Teacher
{
	void case1()
	{
		System.out.println("1");
	}
	
}
class Mentor extends Teacher
{
	void case2()
	{
		System.out.println("2");
	}
	
}
public class Student extends Mentor
{
	void case3()
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		Teacher t1=new Student();
		t1.case1();
		

	}

}

package this_program;

public class This_Keyword 
{
	int age;
	double salary;
	void details(int age,double salary)
	{
		System.out.println("This keyword");
		this.age=age;
		this.salary=salary;
	}
	
	public static void main(String[] args)
	{
		
		This_Keyword t1=new This_Keyword();
		t1.details(10,58000);
		System.out.println("Global age:"+t1.age);
		System.out.println("Global salary:"+t1.salary);
		
	}

}

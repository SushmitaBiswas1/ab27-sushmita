package type_casting;

class ExcelSheet
{
	void DataFetching()
	{
		System.out.println("1");
	}
}
public class TestCase1 extends ExcelSheet
{
	void LoginToLogout()
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		ExcelSheet e1=new TestCase1(); //Upcasting
		e1.DataFetching(); //with this reference variable we can only access the parent class properties
		//downcassting is not possible without upcasting
		TestCase1 t1=(TestCase1)e1;    //explicit way only
		t1.DataFetching();
		t1.LoginToLogout();

	}
}

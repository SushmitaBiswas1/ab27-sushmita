package access_specifier_class;

import access_specifier.Mother;
import access_specifier.Son;

class Father
{
	void F1()
	{
		System.out.println("Class  2");
	}
}

public class Daughter
{
	void D1()
	{
		System.out.println("Class 1");
	}

	public static void main(String[] args) 
	{
		Father f1=new Father();
		f1.F1();
		Son s1=new Son();
		s1.S1();
		Mother m1=new Mother();
		m1.M1();

	}

}

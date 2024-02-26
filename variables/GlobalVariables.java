package variables;

public class GlobalVariables 
{
	static byte a1;
	short a2;
	static int a3;
	long a4;
	static double a5;
	float a6;
	static boolean a7;
	char a8;
	static String a9;
	

	public static void main(String[] args) 
	{
		System.out.println(a1);
		GlobalVariables v1=new GlobalVariables();		
		System.out.println(v1.a2);
		System.out.println(a3);
		System.out.println(v1.a4);
		System.out.println(a5);
		System.out.println(v1.a6);
		System.out.println(a7);
		System.out.println(v1.a8);
		System.out.println(a9);

	}

}

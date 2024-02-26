package string_function;

public class Assignment9
{

	public static void main(String[] args)
	{
		String name="SuShMIta";
		System.out.println(name.repeat(3)); //Repeating the string
		String a=name.replaceAll("[a-z]", "");//removing all lower case
		System.out.println(a); 
		String b=name.replaceAll("[A-Z]", "");//removing all upper case
		System.out.println(b);

	}

}

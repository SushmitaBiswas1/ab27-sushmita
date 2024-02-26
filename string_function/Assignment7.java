package string_function;
//String = Abhishek, remove A from the string.
public class Assignment7 
{

	public static void main(String[] args)
	{
		String name="abhishek";
		System.out.println(name.replaceAll("a", "")); //Removed a from the string
		System.out.println(name.replaceAll("a", "A"));//Replaced small a with capital A
		String name1="I love my country";
		System.out.println(name1.replaceAll(" ", ""));//Removed space from the string
		String a="grotechminds167823";
		System.out.println(a.replaceAll("[a-z]", ""));//Removed alphabets from the string

		

	}

}

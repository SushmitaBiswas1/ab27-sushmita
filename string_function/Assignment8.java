package string_function;
//WAP where the string is My Name Is Sushmita and o/p should be M N I S
public class Assignment8 
{

	public static void main(String[] args) 
	{
		String name="My Name Is Sushmita";
		String a=name.replaceAll("[a-z]", ""); //removed the lower case from the string
		System.out.println(a);
		System.out.println(a.replaceAll(" ", "")); //printing the output without space 
		String name2="world no 1 @!#";
		String b=name2.replace("[a-z]", "");
		String c=name2.replace("[0-9", "");
		String d=b.concat(c);
		System.out.println(d);
	

	}

}

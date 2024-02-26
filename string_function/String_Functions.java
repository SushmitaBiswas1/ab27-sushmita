package string_function;

public class String_Functions {

	public static void main(String[] args) 
	{
		String s="HELLO World";
		System.out.println("Length of s1:"+s.length());
		System.out.println("Print the string in lower case:"+s.toLowerCase()); //changing the string to lower case
		System.out.println("Print the string in upper case:"+s.toUpperCase()); //changing the string to upper case
		String s2="  HELLO World  ";
		System.out.println("Length of s2:"+s2.length()); //checks the length of the string
		System.out.println(s.trim()); //trims the extra space from starting and ending of the string
		String s3="My name is";
		String s4="Sushmita Biswas";
		System.out.println(s3.concat(" ").concat(s4));

	}

}

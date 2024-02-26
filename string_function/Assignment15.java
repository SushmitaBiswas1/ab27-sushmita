package string_function;
//check if the given string is Palindrome
public class Assignment15 {

	public static void main(String[] args)
	{
		String input="malayalam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev=input.charAt(i);
			output=output+rev;
		}
		System.out.println("input:"+input);
		System.out.println("output:"+output);
		if(input.equals(output))
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("It's not a Palindrome");
		}

	}

}

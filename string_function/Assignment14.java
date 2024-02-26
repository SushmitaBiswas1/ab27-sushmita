package string_function;
//reversing a string as a string
public class Assignment14
{
	public static void main(String[] args) 
	{
		String input="sushmita";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev=input.charAt(i);
			output=output+rev;
		}
		System.out.println(output);

	}

}

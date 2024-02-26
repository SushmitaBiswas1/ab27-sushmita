package string_function;

import java.util.Arrays;

public class Split_Function 
{

	public static void main(String[] args)
	{
		String name="INDIA";
		String s1[]=name.split("D"); //from where you want to split the string and converting to an array
		System.out.println(Arrays.toString(s1));
		String aa="My name is Sushmita";
    	String a1[]=aa.split(" "); //splitting the string and converting to an array
    	System.out.println(a1[1]);
		System.out.println(Arrays.toString(a1));
		
 
	}

}

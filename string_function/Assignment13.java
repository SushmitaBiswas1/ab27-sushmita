package string_function;

import java.lang.reflect.Array;

public class Assignment13 
{

	public static void main(String[] args)
	{
		String name="Post789";
		char c1[]=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			if(b1==true)
			{
				System.out.println(c1[i]+" is a digit");
			}
			
			else
			{
				System.out.println(c1[i]+" is a char");

			}
		
			
			
			
		}

	}

}

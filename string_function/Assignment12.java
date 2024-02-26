package string_function;

import java.lang.reflect.Array;

//in given alphanumeric string check how many are char and how many are digit
public class Assignment12 
{

	public static void main(String[] args) 
	{
		String name="Sush1234";
		char c1[]=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if(answer==true)
			{
				System.out.println(c1[i]+" index is at: "+i); 
				
			}
			else
			{
				System.out.println(c1[i]+" index is at: "+i);
			}
			
			
		}
		

	}

}

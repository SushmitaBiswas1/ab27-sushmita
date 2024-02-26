package string_function;

public class Assignment81 {

	public static void main(String[] args)
	{
		String name="Rahul123";
		char c1[]=name.toCharArray();
		int digitcount=0;
		int charcount=0;
		for(int i=0;i<name.length();i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			if(b1==true)
			{
				digitcount++;
			}
			else
			{
				charcount++;
			}
			
			
		}
		System.out.println("The number of digits present in the string are: "+digitcount);
		System.out.println("The number of characters present in the string are: "+charcount);

	}

}

 package string_function;
//check if the 2 strings are Anagram
import java.util.Arrays;

public class Assignment16 {

	public static void main(String[] args)
	{
		String a="bear";
		String b="bare";
		if(a.length()!=b.length())
		{
			System.out.println("Not an Anagram");
			
		}
		else
		{
			char[] c1=a.toCharArray();
			Arrays.sort(c1);
			System.out.println("String a:"+a);
			System.out.println("Sorting string a:"+Arrays.toString(c1));
			char[] c2=b.toCharArray();
			Arrays.sort(c2);
			System.out.println("String b:"+b);
			System.out.println("Sorting string b:"+Arrays.toString(c2));
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("It's a Anagram");
			}
		}
		
	

	}

}

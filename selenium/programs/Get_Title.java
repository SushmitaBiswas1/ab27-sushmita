package selenium.programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.amazon.in");
		String Title=c1.getTitle();
		System.out.println(Title);
		c1.quit();
		String s1=Title.substring(0, 29);
		System.out.println("First String="+s1);
		String s2=Title.substring(31, 54);
		System.out.println("Second String="+s2);
		String s3=Title.substring(56, 61);
		System.out.println("Third String="+s3);
		String s4=Title.substring(63, 70);
		System.out.println("Fourth String="+s4);
		String s5=Title.substring(72, 77);
		System.out.println("Fifth String="+s5);
		String s6=Title.substring(78, 81);
		System.out.println("Sixth String="+s6);
		String s7=Title.substring(82, 86);
		System.out.println("Seventh String="+s7);
		String s8=Title.substring(89);
		System.out.println("Eighth String="+s8);

	}

}

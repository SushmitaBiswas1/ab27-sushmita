package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText
{

	public static void main(String[] args)
	{
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("Gma")).click();
			
		}	

	}

}

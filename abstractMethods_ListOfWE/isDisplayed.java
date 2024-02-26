package abstractMethods_ListOfWE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.name("fname"));
		boolean check=first_name.isDisplayed();
		if(check==true)
		{
			first_name.sendKeys("Sushmita");
			
		}
		else
		{
			System.out.println("do nothing");
		}
		

	}

}

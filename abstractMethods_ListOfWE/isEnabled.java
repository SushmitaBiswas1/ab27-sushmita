package abstractMethods_ListOfWE;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) 
	{
		try
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/sushmita%20biswas/Downloads/learningHTML1.html");
			driver.manage().window().maximize();
			WebElement search=driver.findElement(By.id("121"));
			if(search.isDisplayed()==true)
			{
				if(search.isEnabled()==true)
				{
					search.sendKeys("Abc@123");
				}
				else
				{
					search.sendKeys("Biswas");
				
				}
			}
		}
		catch(ElementNotInteractableException e1)
		{
			System.out.println("Skipping as of now, to continue");
		}
		
		

	}

}

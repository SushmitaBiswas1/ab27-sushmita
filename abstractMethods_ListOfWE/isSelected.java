package abstractMethods_ListOfWE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sushmita%20biswas/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.xpath("(/html/body/input)[6]"));
		checkbox.click();
		if(checkbox.isSelected()==true)
		{
			System.out.println("Click on Submit button");
		}
		else
		{
			System.out.println("Kindly select the checkbox");
		}

	}

}

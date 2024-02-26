package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_popup {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sushmita%20biswas/Downloads/learningHTML1.html");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		WebElement a1=driver.findElement(By.id("1"));
		a1.sendKeys("Sushmita");

	}

}

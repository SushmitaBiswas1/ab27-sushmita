package Hoverover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement fashion=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.moveToElement(fashion);
		WebElement mensTshirt=driver.findElement(By.linkText("Men's T-Shirts"));
		mensTshirt.click(); 

	}

}

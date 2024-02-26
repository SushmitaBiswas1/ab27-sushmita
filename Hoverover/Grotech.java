package Hoverover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement hoverover=driver.findElement(By.linkText(" Demo1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(hoverover).perform();
	//	WebElement w1=driver.findElement(By.xpath("(//div/span/div)[3]"));
	//	w1.click();

	}

}

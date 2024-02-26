package selenium.programs;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws AWTException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.contextClick(w1).perform();
		Robot r1=new Robot();
	
		
	

	}

}

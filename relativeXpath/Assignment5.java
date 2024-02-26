package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Sushmita");
		driver.findElement(By.id("lname")).sendKeys("Biswas");
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE+""+Keys.BACK_SPACE+""+Keys.BACK_SPACE+""+Keys.BACK_SPACE+""+Keys.BACK_SPACE+""+Keys.BACK_SPACE);


	}

}

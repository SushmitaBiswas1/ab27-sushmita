package RightClick_Forbidden;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement Continue_Login=driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN']"));
		Continue_Login.click();
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("Sushmita@gmail.com");
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("Sush123");
		WebElement captcha=driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("eXbW12");
		

	}

}

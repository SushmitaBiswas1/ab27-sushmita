package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("neha.biswas@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Hello@1234");
		driver.findElement(By.name("login")).click();
		
		

	}

}

package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_GroTech
{

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		WebElement Fill_Details=driver.findElement(By.name("fname"));
		Fill_Details.sendKeys("Sushmita");
		Fill_Details=driver.findElement(By.name("lname"));
		Fill_Details.sendKeys("Biswas");
		Fill_Details=driver.findElement(By.name("Username"));
		Fill_Details.sendKeys("Sush_Biswas");
		Fill_Details=driver.findElement(By.name("password"));
		Fill_Details.sendKeys("Hello_World");
		Fill_Details=driver.findElement(By.name("FeMale"));
		Fill_Details.click();
		Fill_Details=driver.findElement(By.id("w3review"));
		Fill_Details.sendKeys("Hitech City, Hyderabad");
		Fill_Details=driver.findElement(By.id("Address"));
		Fill_Details.sendKeys("Hyderabad");
		Fill_Details=driver.findElement(By.name("Pincode"));
		Fill_Details.sendKeys("560001");
		Fill_Details=driver.findElement(By.id("Agree"));
		Fill_Details.click();
		
		
		

	}
 
}

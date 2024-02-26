package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.id("Choice1"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Demo2");
		WebElement w2=driver.findElement(By.id("Choice9"));
		Select s2=new Select(w2);
		s2.selectByValue("SQL15"); 
		WebElement w3=driver.findElement(By.id("Choice4"));
		Select s3=new Select(w3);
		s3.selectByIndex(5);
		

	}

}

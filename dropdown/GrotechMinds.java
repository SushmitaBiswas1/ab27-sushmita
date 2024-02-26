package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMinds {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement dropDown1=driver.findElement(By.name("Skills"));
		Select s1=new Select(dropDown1);
		s1.selectByVisibleText("Technical Skills"); //selectByVisibleText
		WebElement dropDown2=driver.findElement(By.name("Country"));
		Select s2=new Select(dropDown2);
		s2.selectByValue("India"); //selectByValue
		WebElement dropDown3=driver.findElement(By.name("Relegion"));
		Select s3=new Select(dropDown3);
		s3.selectByIndex(1); //selectByIndex
 
	}

}

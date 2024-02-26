package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(Keys.ARROW_DOWN+" "+Keys.ARROW_DOWN+" "+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+""+Keys.ENTER);
	    driver.findElement(By.xpath("(//input)[5]")).sendKeys("Software Books"+Keys.ENTER);
//		driver.findElement(By.id("nav-search-submit-button")).click();
	

	}

}

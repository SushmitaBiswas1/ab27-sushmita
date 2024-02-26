package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_books {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement findProduct=driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
		findProduct.click();
		WebElement findbook=driver.findElement(By.xpath("//a[.=' Books ']"));
		findbook.click(); 
	
	}

}

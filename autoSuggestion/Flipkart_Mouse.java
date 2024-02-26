package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Mouse {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shirts");
		Thread.sleep(1000);
/*		List<WebElement> result=driver.findElements(By.xpath("//form/ul/li"));
		int count_auto=result.size();
		System.out.println(count_auto);
		Thread.sleep(1000);
		result.get(count_auto-6).click();
*/		List<WebElement> result_shirt=driver.findElements(By.xpath("//form/ul/li"));
		int count=result_shirt.size();
		Thread.sleep(1000);
		result_shirt.get(count-7).click();
	}

}

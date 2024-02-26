package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> results=driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		int count_auto=results.size();
		System.out.println(count_auto);
		Thread.sleep(1000);
		results.get(count_auto-6).click();

	}

}

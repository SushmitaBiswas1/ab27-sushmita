package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mouse {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mouse");
		Thread.sleep(1000);
		List<WebElement> suggesion=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		int count_auto=suggesion.size();
		System.out.println(count_auto);
		Thread.sleep(1000);
		suggesion.get(count_auto-5).click();		

	}

}

package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("kids");
		List<WebElement> lists =driver.findElements(By.xpath("//div/ul/li"));
		int count=lists.size();
		System.out.println(count);
	//	lists.get(count).click();

	}

}

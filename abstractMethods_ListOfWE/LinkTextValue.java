package abstractMethods_ListOfWE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextValue {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		List<WebElement> tags=driver.findElements(By.tagName("a"));
		int count=tags.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement a=tags.get(i);
			String text=a.getText();
			System.out.println(text);
		}

	}

}

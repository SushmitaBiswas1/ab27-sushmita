package popups;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoe");
		search.sendKeys(Keys.ENTER);
		WebElement select_shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
		select_shoe.click();
		Set<String> Parent_Child_id=driver.getWindowHandles();
		Iterator<String> pcid=Parent_Child_id.iterator();
		String Parent_id=pcid.next();
		String Child_id=pcid.next();
		driver.switchTo().window(Child_id);
		WebElement add_to_cart=driver.findElement(By.name("submit.add-to-cart"));
		add_to_cart.click();

	}

}

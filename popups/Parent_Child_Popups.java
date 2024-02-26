package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Popups {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement click_google=driver.findElement(By.xpath("//span[.='Google']"));
		click_google.click();
		Set<String> parent_child_id=driver.getWindowHandles();
		System.out.println(parent_child_id);
		Iterator<String> pcid=parent_child_id.iterator();
		String Parent_id=pcid.next();
		System.out.println(Parent_id);
		String Child_id=pcid.next();
		System.out.println(Child_id);
		driver.switchTo().window(Child_id);
	//	driver.close();
		WebElement w1=driver.findElement(By.name("identifier"));
		w1.sendKeys("neha.biswas28@gmail.com");
		
		
		
		

	}

}

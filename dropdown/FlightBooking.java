package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
	//	driver.get("https://grotechminds.com/flights/");
		driver.navigate().to("https://grotechminds.com/flights/");
		driver.manage().window().maximize();
		WebElement from_dd=driver.findElement(By.name("From"));
		Select s1=new Select(from_dd);
		s1.selectByIndex(3);
		List<WebElement> list=s1.getOptions();
		int count=list.size();   //Counts the no. of values we have in the drop down
		System.out.println(count);
		WebElement to_dd=driver.findElement(By.name("To"));
		Select s2=new Select(to_dd);
		s2.selectByVisibleText("GOI - Goa, IN");
		
		
		

	}

}

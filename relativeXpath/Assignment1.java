package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args)
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[@id='twotabsearchtextbox']")).sendKeys("Books");
		driver.findElement(By.xpath("(//input)[@id='nav-search-submit-button']")).click(); 

	}

}

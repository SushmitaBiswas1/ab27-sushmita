package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath_JSAM {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sushmita%20biswas/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Sushmita777");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Sush");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("HelloWorld@2024");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Sushmita");
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.tagName("a")).click();  //Using tagname locator which should be unique.
		



	}

}

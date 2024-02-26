package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ibibo {

	public static void main(String[] args) 
	{
	//	ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=EAIaIQobChMI8ub9pOq-hAMVSqVmAh2I6QOiEAAYASAAEgJCqfD_BwE");
		driver.manage().window().maximize();
		WebElement from_city=driver.findElement(By.linkText("Enter city or airport"));
		from_city.sendKeys("bengaluru");
		List<WebElement>  suggession_from=driver.findElements(By.xpath("//div[@class='sc-12foipm-35 kdxZzw']/div/div"));
		int count1=suggession_from.size();
		System.out.println(count1);
		

	}

}

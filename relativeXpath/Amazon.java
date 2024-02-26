package relativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args)
	{
	//	ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("9438025037");
		driver.findElement(By.xpath("(//input)[10]")).click();
		driver.findElement(By.xpath("(//input)[11]")).sendKeys("");
		driver.findElement(By.xpath("(//input)[13]")).click();
	}

}

package popups;

import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String s1=driver.getTitle();
		System.out.println("The title of the page is "+s1);

	}

}

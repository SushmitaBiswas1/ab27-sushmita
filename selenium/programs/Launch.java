package selenium.programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch 
{

	public static void main(String[] args) throws InterruptedException 
	{
	//	ChromeDriver c1=new ChromeDriver(); //Launch the Empty Browser
	//	c1.get("https://www.google.com");
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://grotechminds.com/registration");
	//	EdgeDriver e1=new EdgeDriver();
	//	e1.get("https://www.google.com");
		
		Thread.sleep(2000);
	//	f1.close();
		f1.quit();
		

	}

}

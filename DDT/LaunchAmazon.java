package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchAmazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\sushmita biswas\\eclipse-workspace\\SeleniumProject\\ExcelSheet\\Sushmita.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String un=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String pas=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
	//	ChromeDriver driver=new ChromeDriver(); 
		EdgeDriver driver=new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(pas);
		driver.findElement(By.id("signInSubmit")).click(); 

	}

}

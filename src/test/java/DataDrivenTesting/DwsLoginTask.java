package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsLoginTask {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		// TODO Auto-generated method stub
		
		String expected_url="https://demowebshop.tricentis.com/";
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into dws page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String actual_Url=driver.getCurrentUrl();
		if(expected_url.equals(actual_Url)) 
		{
			driver.findElement(By.linkText("Log in")).click();
			FileInputStream fis=new FileInputStream("E:\\selenium\\DwsLogin.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet("Sheet1");
			String email1=sheet.getRow(0).getCell(0).toString();
			String password1=sheet.getRow(0).getCell(1).toString();
			
			driver.findElement(By.id("Email")).sendKeys("email1");
			driver.findElement(By.id("Password")).sendKeys("password1");
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.cssSelector("input[value='Log in")).click();
			
			
			
		
			
			}
			
		}
		

	}


package TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DataProviderExcel 
{
	
	public Object[][]provider()throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis=new FileInputStream("");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("sheet1");
	int row =sheet.getPhysicalNumberOfRows();
	int colom=sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][]obj=new Object[row][colom];
	for(int i=0;i<row;i++) 
	{
		for(int j=0; j<colom;j++)
		{
			
			obj[i][j]=sheet.getRow(i).getCell(j).toString();
		}
		
	}
	return obj;
}
	
	@Test(dataProvider="login")
	 public void receiver(String usernme,String password)throws InterruptedException
	 {
		    ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("");
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("Email")).sendKeys("username");
			Thread.sleep(1000);
			driver.findElement(By.id("Password")).sendKeys("password");
			Thread.sleep(1000);
			driver.findElement(By.id("RememberMe")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[value='Log in']")).click();
			Thread.sleep(1000);
			driver.close();
			
		 
	 }
		

}

	



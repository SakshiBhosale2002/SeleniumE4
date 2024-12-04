package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class DataProviderAnnotation extends DwsBaseClass
{
	@DataProvider(name="login")
	public Object[][]provider()
	{
		Object[][]obj=new Object[2][2];
		obj[0][0]="admin01@gmail.com";
		obj[0][1]="admin01";
		obj[1][0]="admin02@gmail.com";
		obj[1][1]="admin02";
		return obj;
		
		
	}
	@Test(dataProvider="login")
 public void receiver(String username,String password)throws InterruptedException
 {
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[value='Log in']")).click();
		Thread.sleep(1000);
		driver.close();
		
	 
 }
	

}

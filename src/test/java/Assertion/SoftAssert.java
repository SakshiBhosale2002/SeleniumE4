package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert 
{
	@Test
	public void main() throws InterruptedException 
	{
	EdgeDriver d=null;
	String expected_url="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual_url=driver.getCurrentUrl();
    org.testng.asserts.SoftAssert sa=new org.testng.asserts.SoftAssert();
    sa.assertEquals(expected_url,actual_url);
	Reporter.log(" i am in dws page");
	WebElement register= driver.findElement(By.className("ico-register"));
	sa.assertTrue(register.isEnabled());
	register.click();
	sa.assertNull(d);
	Thread.sleep(1000);
	driver.close();
	sa.assertAll();
		
	}


		
	

}

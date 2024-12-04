package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertNull 
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
	assertEquals(expected_url,actual_url,"i am not in dws page");
	Reporter.log(" i am in dws page");
	WebElement register= driver.findElement(By.className("ico-register"));
	assertTrue(register.isEnabled(),"register link is not enabled...");
	register.click();
	assertNull(d);
	Thread.sleep(1000);
	driver.close();
		
	}


}

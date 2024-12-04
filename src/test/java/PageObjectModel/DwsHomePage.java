package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsPage;

public class DwsHomePage 
{
	@Test
	public void main()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/",driver.getCurrentUrl());
		DwsPage ref=new DwsPage();
		ref.logo1();
		ref.register_link();
		ref.login_link();
		ref.cart_link();
		ref.cart_link();
		ref.search();
		
		
	}

}




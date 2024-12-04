package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLogin;

public class Login 
{
	@Test

	public void main() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/",driver.getCurrentUrl());
		DwsLogin ref=new DwsLogin(driver);
		
		ref.login("sakshibhosale@gmail.com","sakshi");
		//*ref.loginLink();
		//ref.email("sakshibhosale@gmail.com");
		//ref.password("sakshi");
		//ref.rememberMe();
		//ref.loginButton();/*
		
		
		
		
		
	}

	
	
}
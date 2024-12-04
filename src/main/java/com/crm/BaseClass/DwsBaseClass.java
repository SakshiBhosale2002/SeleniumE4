package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DwsBaseClass 
{
	public static WebDriver driver=null;
	@Parameters({"browser","url"})
	@BeforeClass
	public void preCondition(String browser, String url)throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	@BeforeMethod
	public void login()throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("sakshibhosale@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("sakshi");
		//Thread.sleep(3000);
		driver.findElement(By.id("RememberMe")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[value='Log in']")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass
	public void postConditon()
	{
		driver.quit();
	}

		
		
}



package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kawasaki 
{
	@Test(groups="functional")
	public void kawasaki() 
	{
		System.out.println(" i am kawasaki");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://kawasaki-india.com/");
		driver.close();
		
		
	}

}

package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class TestCase extends DwsBaseClass
{
	@Test
	public void testScript1() throws InterruptedException
    {
		
				List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
				for(WebElement link : links)
				{
					link.click();
					String currentUrl =driver.getCurrentUrl();
					if(currentUrl.equals("https://demowebshop.tricentis.com/news/rss/1"))
					{
						driver.navigate().back();
					}
					Thread.sleep(1000);
				}
				System.out.println("TestScript1 executed Successfully!");
		}
	@Test
	public void testScript2() throws InterruptedException
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("TestScript2 executed Successfully!");
	}
		
		
}



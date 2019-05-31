package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInFirefox {
	@Test
	public void fsearch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Google");
		driver.findElement(By.name("q")).sendKeys("SeleniumHQ");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	}

}

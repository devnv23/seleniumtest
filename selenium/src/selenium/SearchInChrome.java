package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInChrome {
  @Test
  public void fSearch() {
	   
	  	WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Google");
		driver.findElement(By.name("q")).sendKeys("SeleniumHQ");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
	}
}

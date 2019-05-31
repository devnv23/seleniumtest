package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependancyTestDemo extends BrowserMethods{
	
 @Test (dependsOnMethods = "googlePage")
 public void Search()
 {
	 driver.findElement(By.name("q")).sendKeys("SeleniumHQ");
	 driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	 
 }
  @Test
  public void googlePage() {
	  
	  String Title =driver.getTitle();
	  Assert.assertEquals(Title, "Google");
	  
  }
  
}

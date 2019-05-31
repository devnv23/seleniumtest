package caqh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterPage {
  @Test
  public void caqh() throws Exception{
	  WebDriver driver = new ChromeDriver();
	//  driver.get("https://proview.caqh.org/Login/Index?ReturnUrl=%2f");
	  driver.get("https://proview.caqh.org/PR/Registration/SelfRegistration");
//	  Thread.sleep(5000);
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/form[1]/ol[1]/li[3]/p[1]/a[1]")).click();
//	  Thread.sleep(5000);
//	  driver.findElement(By.linkText("Go to next section")).click();
	  Thread.sleep(1000);
	  
//	  WebElement element = driver.findElement(By.id("ProviderTypeId"));
//	  Actions actions = new Actions(driver);
//	  actions.moveToElement(element);
//	  actions.perform();
//	  driver.findElement(By.id("ProviderTypeIdDiv")).click();
//	  Select s= new Select(element);
//	  s.selectByVisibleText("Advanced Practice Nurse");
	  

	  driver.findElement(By.id("ProviderTypeIdDiv")).click();
	  Thread.sleep(2000);
	  WebElement dd_ProvType = driver.findElement(By.id("ProviderTypeId"));
	  Select s= new Select(dd_ProvType);
//	  s.selectByValue("b1cff416-1ebb-e411-9705-0050569b5d6f");
//	  s.selectByVisibleText("Advanced Practice Nurse");
//	  s.selectByIndex(3);
	  List<WebElement> ProvType=s.getOptions();
	  System.out.println("Size :"+ProvType.size());
	  for(WebElement Type:ProvType) {
	
		  System.out.println("Provider Type: " +Type.getText());
	  }
  }
}

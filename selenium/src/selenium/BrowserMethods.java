package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BrowserMethods {
  @Test
  public void f() {
	  
  }
  public static WebDriver driver;
  
  @BeforeMethod(alwaysRun = true )
  public void StartUp() {
	  driver = new FirefoxDriver();
	  driver.get("http://google.com");  	  
  }

  @AfterMethod
  public void ShutDown() {
	  driver.quit();
  }

}

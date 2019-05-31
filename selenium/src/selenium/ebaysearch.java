package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ebaysearch {
  @Test
  public void f() {
	  WebDriver driver= new FirefoxDriver();
	  driver.get("http://www.ebay.com");
	  driver.close();
  }
  
}

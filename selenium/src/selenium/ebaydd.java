package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ebaydd {
  @Test
  public void f() throws Exception{
	  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://proview.caqh.org/PR/Registration/SelfRegistration");
	  
	  driver.findElement(By.id("ProviderTypeIdDiv")).click();
	 
	  driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Audiologist",Keys.ENTER);
	  
	  driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("hello");
	  
	  driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Last Name");
	  
	  driver.findElement(By.xpath("//div[@class='form-group col-xs-6']//b")).click();
			  
	  driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Correspondence",Keys.ENTER);
	
	  driver.findElement(By.xpath("//input[@id='Address1_Line1']")).sendKeys("Address1_Line1");
	  
	  
	}
}

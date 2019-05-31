package caqh;

import java.util.List;
import java.util.Scanner;

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
  public void caqh() throws Exception
  {

	  String month = "June 2010";
	  String Day = "10";

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
	  
	  driver.findElement(By.xpath("//input[@id='Address1_City']")).sendKeys("Alaska");
	  
	  driver.findElement(By.xpath("//*[@id='select2-AddressStateId-container']")).click();
	  
	  driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("AK",Keys.ENTER); 
	  
	  driver.findElement(By.xpath("//input[@id='Address1_PostalCode']")).sendKeys("123456789");
	  
	  driver.findElement(By.id("select2-PrimaryPracticeStateId-container")).click();
	  
	  driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("AK",Keys.ENTER);
	  
	  driver.findElement(By.xpath("//input[@id='EmailAddress1']")).sendKeys("hello123@email.com");
	  
	  driver.findElement(By.xpath("//i[@class='icon icon-calendar']")).click();
	  
	  while(true)
		{
			String monthval =driver.findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]")).getText();
			System.out.println("Month: "+monthval);
		//	monthval= monthval.substring(0,3);
			
			if(monthval.equals(month))
			{
				System.out.println("Same Month");
				//driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev'][contains(text(),'«')]")).click();
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev'][contains(text(),'«')]")).click();
				System.out.println("Month: "+monthval);
			}
		}
	  
	  List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr"));
	  System.out.println("Rows Size : " +rows.size());
	  for(int i=3;i<= rows.size();i++) 
	  {
		//	System.out.println("For Columns Size :");
			List<WebElement> cols = driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr["+i+"]/td"));
		
			//System.out.println("Columns Size :"+cols.size());
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell = driver.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
			//	System.out.println("Value:"+cell.getText());
				//cell.click();
				String Day2=cell.getText();
				if(Day2.equals(Day))
				{
					//System.out.println("Day:"+cell.getText());
					cell.click();
					break;
				}

			}
	  
		}
	}
}

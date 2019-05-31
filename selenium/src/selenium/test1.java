package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[5]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		
		System.out.println("WindowHandle="+driver.getWindowHandle());
		String Title=driver.getTitle();
		Thread.sleep(2000);
        
        Set<String> winids= driver.getWindowHandles();
        for(String id: winids)
        {
        	driver.switchTo().window(id);
        	if(driver.getTitle().equalsIgnoreCase("Title"));
        }
        
        driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("naracmha");
		
		
	}

}

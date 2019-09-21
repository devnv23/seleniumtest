package KeywordTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KeywordDecl {
	static WebDriver driver;
	public void open_Browser (String BrowserName) {
		
		try {
			if(BrowserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			else if(BrowserName.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
		}
		
		catch(WebDriverException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void enter_URL(String url)
	{
		driver.get(url);
	}
	public By locatorValue(String locatorType, String value)
	{
		By by = null;
		switch(locatorType)
		{
			case "id"	: 
				by = By.id(value);	
				break;
			case "name"	:		
				by = By.name(value);
				break;
			case "xpath":
				by = By.xpath(value);
				break;
			case "css"	:
				by = By.cssSelector(value);	
				break;
			case "linktext"	:
				by = By.linkText(value);
				break;
			case "partiallinktext":
				by = By.partialLinkText(value);
				break;
			case "default":
				by=null;
				break;			

		}
		return by;	
		
	}
	
	public void select_dropdown(String locatorType,String value,String text)
	{
		
		try
		{
			By locator;
			locator=locatorValue(locatorType,value);
			WebElement element =driver.findElement(locator);
			Select s = new Select(element);
			s.selectByVisibleText(text);
			
		}
		catch(Exception e) 
		{
			System.err.format("No element found to select item"+e);
		}
		
	}
	public void enter_text(String locatorType,String value,String text)
	{
		
		try
		{
			By locator;
			locator=locatorValue(locatorType,value);
			WebElement element =driver.findElement(locator);
			element.sendKeys(text);			
		}
		catch(Exception e) 
		{
			System.err.format("No element found to enter text"+e);
		}
		
	}
	public void click_on_button(String locatorType,String value)
	{
		try
		{
			By locator;
			locator=locatorValue(locatorType,value);
			WebElement element =driver.findElement(locator);
			element.click();		
		}
		catch(Exception e) 
		{
			System.err.format("No element found to enter text"+e);
		}
	}
	public void close_browser()
	{
			driver.quit();
	}
}


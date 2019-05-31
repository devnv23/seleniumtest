package KeywordTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	public void enter_url(String url)
	{
		driver.get(url);
	}

}

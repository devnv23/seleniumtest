package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingNaukriSiteJobs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		String winTitle=driver.getTitle();
		String winId=driver.getWindowHandle();
		System.out.println("Current Window Id :"+ winId);
		System.out.println("Window Title:" +winTitle);
		Set<String> winIDs=driver.getWindowHandles();
		
		for(String id:winIDs)
		{
			driver.switchTo().window(id);
			if(!driver.getTitle().equals(winTitle))
			{
				System.out.println("Window ID:" +id);
				System.out.println("Window Title:" +driver.getTitle());
				//driver.close();
			}
		}
		driver.switchTo().window(winId);
		System.out.println("Main Window Id :"+ winId);

	}

}

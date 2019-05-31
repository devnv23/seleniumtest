package selenium;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://ebay.com");
		File fsource =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String pathname = "D://SELENIUM/errorpic.jpeg";
		File fdest = new File(pathname );
		FileUtils.copyFile(fsource, fdest);
	}

}

package Pom.Pom.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pom.Pages.fpktlLoginPage;

public class fpktsearchtest {
	@Test
	public void search()
	{
		WebDriver driver = new FirefoxDriver();
		  driver.get("http://flipkart.com");
		  fpktlLoginPage signin = new fpktlLoginPage(driver);
		  signin.typePhNo("9492756097");
		  signin.typePassword("narasimha@1");
		  signin.btnLogin();
		  signin.StrSearch("Mobiles");
	}

}

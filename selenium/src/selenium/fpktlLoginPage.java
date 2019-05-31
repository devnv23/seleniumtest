package Pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fpktlLoginPage {
	WebDriver driver;
	By username = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By signin =   By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	By SearchText = By.className("LM6RPg");
	By SearchBtn = By.className("vh79eN");
	
	public fpktlLoginPage(WebDriver d)
	{
		driver =d;
	}
	public void typePhNo(String str)
	{
	   driver.findElement(username).sendKeys(str);
	}
	public void typePassword(String str)
	{
	   driver.findElement(password).sendKeys(str);
	}
	public void btnLogin()
	{
		driver.findElement(signin).click();
	}
	public void StrSearch(String str)
	{
		driver.findElement(SearchText).sendKeys(str);
		driver.findElement(SearchBtn).click();
	}
}

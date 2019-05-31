package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendarcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Month");
		String month = sc.next();
		month = month.substring(0, 3);
		System.out.println("Enter Day");
		String Day = sc.next();
		//boolean isExits =false;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		while(true)
		{
			String monthval =driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
			
			monthval= monthval.substring(0,3);
			if(monthval.equals(month))
			{
				//System.out.println("Same Month");
				break;
			}
			else
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		}
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		//System.out.println("Rows Size : " +rows.size());
		for(int i=3;i<= rows.size();i++) 
		{
		//	System.out.println("For Columns Size :");
			List<WebElement> cols = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td"));
			
		//	System.out.println("Columns Size :"+cols.size());
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
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

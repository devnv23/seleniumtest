package ddfDemo;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fpktLoginTest {
	WebDriver driver;
	XSSFWorkbook wb;
	XSSFSheet ws;
	
	@Test(dataProvider="LoginData")
	public void LoginTest(String Username, String Password) throws Exception
	{
		driver= new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(Username);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(Password);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(10000);
		String str = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/span/div")).getText();
		Assert.assertTrue(str.equals("Flipkart"), "User is Not able to Login- Invalid Credentials");
		System.out.println("User Verified -Login Successfully");
	}
	@DataProvider(name="LoginData")
	public Object[][] passData() throws Exception
	{
		wb = new XSSFWorkbook("C:\\Users\\narac\\Desktop\\Selenium\\DDFTestData.xlsx");
		ws = wb.getSheet("Sheet1");
		int rows= ws.getPhysicalNumberOfRows();
		Object[][] data= new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
			data[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
		}
		
		/*Object[][] data= new Object[3][2];
		data[0][0]="user1";
		data[0][1]="pwd1";
		data[1][0]="9492756097";
		data[1][1]="narasimha@1";
		data[2][0]= "Usere2";
		data[2][1]= "Pwd2";*/
		return data;
		
	}
}

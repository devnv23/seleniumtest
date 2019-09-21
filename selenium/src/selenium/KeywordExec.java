package KeywordTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class KeywordExec {
	@Test
	public void Search() throws Exception
	{
		KeywordDecl keyDecl = new KeywordDecl();
		System.out.println("search");
		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\narac\\Desktop\\Selenium\\Keywords.xlsx");
		XSSFSheet ws =wb.getSheet("sheet1");
		int rows= ws.getPhysicalNumberOfRows();
		for(int i=1;i<rows;i++)
		{
			
			String methodName= ws.getRow(i).getCell(0).getStringCellValue();
			switch(methodName)
			{
			case "open_Browser":
				System.out.println("Opening Browser ...");
				keyDecl.open_Browser(ws.getRow(i).getCell(3).getStringCellValue());
				Thread.sleep(3000);
				break;
			case "enter_URL":
				keyDecl.enter_URL(ws.getRow(i).getCell(3).getStringCellValue());
				break;
			case "select_Dropdown":
				keyDecl.select_dropdown(ws.getRow(i).getCell(1).getStringCellValue(), 
										ws.getRow(i).getCell(2).getStringCellValue(), 
										ws.getRow(i).getCell(3).getStringCellValue());
				break;
			case "enter_text":
				keyDecl.enter_text(ws.getRow(i).getCell(1).getStringCellValue(), 
										ws.getRow(i).getCell(2).getStringCellValue(), 
										ws.getRow(i).getCell(3).getStringCellValue());
				break;
			case "click_on_button":
				keyDecl.click_on_button(ws.getRow(i).getCell(1).getStringCellValue(), 
										ws.getRow(i).getCell(2).getStringCellValue());
				break;
			case "close_browser":
				keyDecl.close_browser();
				break;
				
				
			}
			
			
		}
		
	}
}

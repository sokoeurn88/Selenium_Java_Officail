package selenium_webdriver;


import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;	//for multiple classes use *, then do not need to import again
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.logs.Logger;


public class Read_Data_From_ExcelSheet_iscalled_DataDrivenTests {


	public static void main(String[] args) throws IOException {
		
		/* Excel File -> work books -> sheets -> rows -> cells is where data store
		 * 
		 * In order to read data from EXCEL needs 3 classes:
		 * 
		 * FileInputStream -> class for creating object for Excel file
		 * XSSFWorkbook -> class for creating object for Workbook
		 * XSSFSheet -> class for creating object to work with sheet
		 * XSSFRow -> class for creating object to work with rows
		 * XSSFCell -> class for creating object to work with cell.
		 * 
		 * */

		
		/*Excel File -> work books -> sheets -> rows -> cells is where data store*/
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sokoeurn chhay\\OneDrive\\Desktop\\data3.xlsx");
		
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		
//		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1"); /*providing Sheet Name "Sheet1"*/
		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0); /*providing sheet index*/
		
		int rowCount = xssfSheet.getLastRowNum();					/*->will return row count*/
		int cellCount = xssfSheet.getRow(0).getLastCellNum();		/*->will return column count*/
		
		for(int i=0;i<rowCount;i++) {
			
			XSSFRow currentRow = xssfSheet.getRow(i); /*focused on current row*/
			
			for(int j=0;j<cellCount;j++) {
				String valueCell = currentRow.getCell(j).toString();
				System.out.print("   	  "+valueCell);
			}
			System.out.println();
			
		}
		
		/*
		getStringCellValue();
		getNumericCellValue();
		getBooleanCellValue();
		*/
		
		
		
		/*
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		*/
		
		

	}

}

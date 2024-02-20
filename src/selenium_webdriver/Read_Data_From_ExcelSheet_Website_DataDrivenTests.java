package selenium_webdriver;


import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;	//for multiple classes use *, then do not need to import again
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.logs.Logger;


public class Read_Data_From_ExcelSheet_Website_DataDrivenTests {
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

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/interest-calculator.html?cstartingprinciple=1%2C000&cannualaddition=1%2C000&cmonthlyaddition=500&cadditionat1=beginning&cinterestrate=5&ccompound=annually&cyears=3&cmonths=6&ctaxtrate=0.8&cinflationrate=5&printit=0&x=Calculate#interestresults");
		System.out.println(driver.getTitle());

		/*Excel File -> work books -> sheets -> rows -> cells is where data store*/
		/*Getting data from Excel sheet*/
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sokoeurn chhay\\OneDrive\\Desktop\\Interest Calculator.xlsx");
		
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1"); /*providing Sheet Name "Sheet1"*/
//		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0); /*providing sheet index*/
		
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
		
		
		
		

		
		

	}

}

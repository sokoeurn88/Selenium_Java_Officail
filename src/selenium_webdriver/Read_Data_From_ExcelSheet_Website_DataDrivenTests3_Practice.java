//package selenium_webdriver;
//
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
////import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.*;	//for multiple classes use *, then do not need to import again
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import io.opentelemetry.api.logs.Logger;
//
//
//public class Read_Data_From_ExcelSheet_Website_DataDrivenTests3_Practice{
//	public static void main(String[] args) throws IOException {
//		
//		
//		/*CODE WILL NOT RUN DUE TO ONLINE WORKSHEET NOT ALVAILABLE, MISS CONSISTANCY OF DATA*/
//		
//		
//		/* Excel File -> work books -> sheets -> rows -> cells is where data store
//		 * 
//		 * In order to read data from EXCEL needs 3 classes:
//		 * 
//		 * FileInputStream -> class for creating object for Excel file
//		 * XSSFWorkbook -> class for creating object for Workbook
//		 * XSSFSheet -> class for creating object to work with sheet
//		 * XSSFRow -> class for creating object to work with rows
//		 * XSSFCell -> class for creating object to work with cell.
//		 * 
//		 * */
//
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.calculator.net/interest-calculator.html?cstartingprinciple=1%2C000&cannualaddition=1%2C000&cmonthlyaddition=500&cadditionat1=beginning&cinterestrate=5&ccompound=annually&cyears=3&cmonths=6&ctaxtrate=0.8&cinflationrate=5&printit=0&x=Calculate#interestresults");
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//input[@value='Clear']")).click();
//
//		/*Excel File -> work books -> sheets -> rows -> cells is where data store*/
//		/*Getting data from Excel sheet*/
//		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sokoeurn chhay\\OneDrive\\Desktop\\Interest Calculator.xlsx");
//		
//		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
//		
//		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1"); /*providing Sheet Name "Sheet1"*/
////		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0); /*providing sheet index*/
//		
//		int rowCount = xssfSheet.getLastRowNum();					/*->will return row count*/
//		xssfSheet.
//		
//		for(int row=0;row<=rowCount;row++) {
//			
//			XSSFRow current_Row = xssfSheet.getRow(row);
//			
//			current_Cell = xssfSheet.get
//			
//			/*get value from columns or cell*/
//			/*2 line statements is the same as one line, just for demo purpose*/
////			XSSFCell firstCellValue = current_Row.getCell(0);
////			int cellValue = (int)firstCellValue.getNumericCellValue(); /*type cast value from double to int*/
//			
//			for() {
//				
//			}
//			
//			/*1 line statement*/
//			 String value = current_Row.getCell(1).toString(); /*default value is double, but we don't want it, we want to cast in int value*/
//			
////			int secondCellValue = (int)current_Row.getCell(1).getNumericCellValue();
////			int thirdCellValue = (int)current_Row.getCell(2).getNumericCellValue();
////			String forthCellValue = current_Row.getCell(3).getStringCellValue();
////			int fithCellValue_ExpectValue = (int)current_Row.getCell(4).getNumericCellValue(); /*actual value in excel sheet, locat data*/
//			
//			/*process start: finding web or locate element, then pass local data */
//			/*sendKeys() method - is now allowed for numeric value. sendKeys is designed for text box or String value.*/
//			/*String.valueOf(int value) method - is converting int value to String value*/
//			driver.findElement(By.id("cstartingprinciple")).sendKeys(value);
////			driver.findElement(By.id("interest")).sendKeys(String.valueOf(secondCellValue));
////			driver.findElement(By.id("tensur")).sendKeys(String.valueOf(thirdCellValue));
////			
////			/*if it is a dropdown value, use Select class*/
////			Select periodcom = new Select(driver.findElement(By.id("tenurePeriod")));
////			periodcom.selectByVisibleText(forthCellValue);
////			
////			driver.findElement(By.xpath(".//*[id='fddsfa']")).sendKeys(String.valueOf(fithCellValue_ExpectValue));
////			
////			/*submit the form*/
////			driver.findElement(By.name("acdde")).click();
////			
////			/*comparing the result expect and actual*/
////			String actualValue = driver.findElement(By.xpath(".//*[@id='resp_matval]")).getText(); /* for dynamic text or changing text*/
////			
////			
////			/*actualValue is String data type. fithCellValue_ExpectValue is int data type. we can't compare
////			/*
////			 * if you want to compare, we need to type cast data type.
////			 * 
////			 * How to type cast data
////			 * 
////			 *  String to int ------------> Integer.parseInt(String value);
////			 *  String to double-----------> Double.parseDouble(String value);
////			 */
////
////			if(Double.parseDouble(actualValue)==fithCellValue_ExpectValue) {
////				System.out.println("Test passed");
////			} else {
////				System.out.println("Test failed");
////			}
////			
////			/*clear the online data, by clear button. Before move on to the next row data.*/
////			driver.findElement(By.xpath("//*[@id='adcda']")).click();
////	
//		}
//		
////		driver.close();
////		driver.quit();
//
//	}
//
//}

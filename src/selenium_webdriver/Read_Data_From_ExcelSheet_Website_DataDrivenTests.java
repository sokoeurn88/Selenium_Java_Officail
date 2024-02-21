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
//public class Read_Data_From_ExcelSheet_Website_DataDrivenTests {
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
//		/*Excel File -> work books -> sheets -> rows -> cells is where data store*/
//		/*Getting data from Excel sheet*/
//		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sokoeurn chhay\\OneDrive\\Desktop\\Registration.xlsx");
//		
//		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
//		
//		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1"); /*providing Sheet Name "Sheet1"*/
////		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0); /*providing sheet index*/
//		
//		int rowCount = xssfSheet.getLastRowNum();					/*->will return row count*/
//		
//		for(int row=1;row<=rowCount;row++) {
//			
//			XSSFRow current_Row = xssfSheet.getRow(row);
//			
//			/*if you know number of columns is fixed. Column = cell*/
//			String First_name = current_Row.getCell(0).getStringCellValue(); /*When you know column data is String*/
//			String Last_Name = current_Row.getCell(1).getStringCellValue();
//			String Phone = current_Row.getCell(2).getStringCellValue();
//			String Email = current_Row.getCell(3).getStringCellValue();
//			String Address = current_Row.getCell(4).getStringCellValue();
//			String City = current_Row.getCell(5).getStringCellValue();
//			String State = current_Row.getCell(6).getStringCellValue();
//			String Pincode = current_Row.getCell(7).getStringCellValue();
//			String Country = current_Row.getCell(8).getStringCellValue();
//			String UserName = current_Row.getCell(9).getStringCellValue();
//			String Password = current_Row.getCell(10).getStringCellValue();
//			
//			/*Once we get all values, it's time to start the process*/
//			
//			/*Registration Process*/
//			driver.findElement(By.linkText("Registration")).click();
//			
//			/*Enter contact information*/
//			driver.findElement(By.name("firstName")).sendKeys(First_name);
//			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
//			driver.findElement(By.name("phone")).sendKeys(Phone);
//			driver.findElement(By.name("email")).sendKeys(Email);
//
//			/*Entering mailing address*/
//			driver.findElement(By.name("address")).sendKeys(Address);
//			driver.findElement(By.name("city")).sendKeys(City);
//			driver.findElement(By.name("state")).sendKeys(State);
//			driver.findElement(By.name("pincode")).sendKeys(Pincode);
//			/*country selection*/
//			Select dropDownCountry = new Select(driver.findElement(By.name("country")));
//			dropDownCountry.selectByVisibleText(Country);
//			
//			/*entering user information*/
//			driver.findElement(By.name("username")).sendKeys(UserName);
//			driver.findElement(By.name("password")).sendKeys(Password);
//			
//			/*submit a form*/
//			driver.findElement(By.name("registration")).click();
//			
//			/*validation part*/
//			if(driver.getPageSource().contains("Thank you for registration")) {
//				System.out.println("Registration form "+row+"record");
//			} else {
//				System.out.println("Registration failed "+row+"record");
//			}
//			
//		}
//		
//		System.out.println("Data Driven Test Completed");
//		
//		driver.close();
//		driver.quit();
//		
//		fileInputStream.close();	
//
//	}
//
//}

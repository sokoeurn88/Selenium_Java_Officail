package selenium_webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebExcel2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://newtours.demoaut.com/");
		
		/*Getting data from Excel sheet*/
		FileInputStream file = new FileInputStream("C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Excel\\caldata.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		int noOfRows = sheet.getLastRowNum();
		
		for(int row = 1; row<=noOfRows;row++) {
			XSSFRow currentRow = sheet.getRow(row);
			
			/*way 1*/
			int principle = (int) currentRow.getCell(0).getNumericCellValue();
			
			/*way 2 is same way 1*/
			XSSFCell cell0 = currentRow.getCell(0);
			int valuecell0 = (int) cell0.getNumericCellValue();
			
			
			
			int rateOfInterest= (int) currentRow.getCell(1).getNumericCellValue();
			int periods = (int) currentRow.getCell(2).getNumericCellValue();
			String frequency = currentRow.getCell(3).getStringCellValue();
			int maturity = (int) currentRow.getCell(4).getNumericCellValue();
			
			/*Process start here*/
			driver.findElement(By.linkText("Register")).click();
			
			/*Entering the information*/
			driver.findElement(By.name("firstname")).sendKeys(String.valueOf(principle));
			driver.findElement(By.name("firstname")).sendKeys(String.valueOf(rateOfInterest));
			driver.findElement(By.name("firstname")).sendKeys(String.valueOf(periods));
			driver.findElement(By.name("firstname")).sendKeys(frequency);
			driver.findElement(By.name("firstname")).sendKeys(String.valueOf(maturity));
			
			/*drop down selection*/
			Select sel = new Select(driver.findElement(By.name("countryname")));
			sel.selectByVisibleText("cambodioa");
			
			/*submit the form*/
			driver.findElement(By.name("register")).click();
			
			/*getting dynamic value after submitting*/
			String actualValue = driver.findElement(By.xpath(".//*[@id='abc123']")).getText();
			
			/*Covert data type:
			 * 
			 * String to integer -> Integer.parseInt(string value);
			 * 
			 * String to double -> Double.parseDouble(String value);
			 *
			 * We can't convert currency value into integer data type. We need double data type $13.50 
			 * 
			 * */
			
			if(driver.getPageSource().contains("Thank you for register")) {
				System.out.println("Registration completed for "+row+" record");
			} else {
				System.out.println("Registration failed for"+row+" record");
			}
			
		}
		System.out.println("Data Driven Test Completed");
		driver.close();
		driver.quit();
		file.close();
	
	}

}

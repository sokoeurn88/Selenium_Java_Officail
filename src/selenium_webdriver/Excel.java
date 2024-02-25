package selenium_webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel {

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
			
			double principle = currentRow.getCell(0).getNumericCellValue();
			double rateOfInterest= currentRow.getCell(1).getNumericCellValue();
			double periods = currentRow.getCell(2).getNumericCellValue();
			String frequency = currentRow.getCell(3).getStringCellValue();
			double maturity = currentRow.getCell(4).getNumericCellValue();
			
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

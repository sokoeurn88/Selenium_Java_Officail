package selenium_webdriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set path for log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Log\\log4j.properties");
		
		//Create Logger class
		Logger logger = Logger.getLogger("Log4j");		//give a string class name:  Log4j
		
		String actualTitle = "";
		String expectedTitle = "Google";
		
		driver.get("https://www.google.com");
		actualTitle = driver.getTitle();
		
		if(expectedTitle.contentEquals(expectedTitle)) {
			logger.info("Test passes ");
		} else {
			logger.info("Test fails");
		}
		
		
		driver.quit();	
		

	}

}

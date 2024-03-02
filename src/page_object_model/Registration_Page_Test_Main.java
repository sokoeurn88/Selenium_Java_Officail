package page_object_model;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_Page_Test_Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*log4j: 
		 * download log4j jar file, then add to java build path
		 * log4j needs log4j.properties
		 * log4j nedds log4j.xml
		 */
		
		Logger logger = Logger.getLogger("Registration_Page_Test_Main");
//		DOMConfigurator.configure("log4j.xml");
		PropertyConfigurator.configure("long4j.properties");
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver1.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/sokoeurn chhay/eclipse-workspace2024Feb/Selenium_Java_Official/Drivers/chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		logger.info("Browser opened");
				
		Registration_Page rp = new Registration_Page(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		logger.info("open url");
		driver.get("https://www.chase.com");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='homepage-navigation-mbox-ab']/header/section[2]/section[3]/section/nav/ul/li[1]/a")).click();
		
		
		Thread.sleep(1000);
		rp.createCheckingAcc();

		
		Thread.sleep(1000);
		
		driver.quit();
}
}
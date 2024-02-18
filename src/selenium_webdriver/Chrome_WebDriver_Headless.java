package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_WebDriver_Headless {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		/*To make chrome headless using ChromeOptions class*/
		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true); /*another way of making chrome headless*/
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		
		driver.close();
		
		

	}

}

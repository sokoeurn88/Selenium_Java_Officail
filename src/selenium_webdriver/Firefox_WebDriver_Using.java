package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_WebDriver_Using {

	public static void main(String[] args) {
		
		System.setProperty("webdirver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe"); /*./ is current working directory*/
		
//		FirefoxDriver driver = new FirefoxDriver(); /*This one is only used with FirefoxDriver. it can't instantiate with other Drivers. eg ChromeDriver(),*/
		
		WebDriver  driver = new FirefoxDriver(); /*it is a generic way. WebDriver is an Interface. FirefoxDriver is a class implement WebDriver */
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.com");
//		driver.get("https://www.facebook.com");
		
		driver.get("https://demo.guru99.com/selenium/newtours/index.php");
		
//		driver.findElement(By.name("userName")).sendKeys("mercury");
		WebElement webEle = driver.findElement(By.name("userName"));
		webEle.sendKeys("mercury");
		
//		driver.findElement(By.name("password")).sendKeys("mercury");
		WebElement webEle2 = driver.findElement(By.name("password"));
		webEle2.sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test passes");
		} else {
			System.out.println("Test failed");
		}
		
		
		driver.close();
		


	}

}

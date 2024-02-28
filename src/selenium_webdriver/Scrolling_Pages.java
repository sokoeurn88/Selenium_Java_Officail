package selenium_webdriver;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling_Pages {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement webelem = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		webelem.sendKeys("cambodia");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*finding by pixels*/
//		js.executeScript("window.scrollBy(0,2000)", "");
		
		
		/*scroll the page until find the element*/
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"6kDfZcSzK8Otur8Pj9OZ-AY__174\"]/div/a/div/div[2]/div[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", element);
//		element.click();
		
		/*Scroll page until bottom*/
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
//		driver.quit();
		
		

	}

}

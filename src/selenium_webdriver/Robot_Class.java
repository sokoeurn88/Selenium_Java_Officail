package selenium_webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Robot_Class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Tuesday morning I was a greate one");
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		
		/*Sometime when you click on download, window will pop up asking where to save location. In this case use Robot Class*/
		Robot robot = new Robot();
		
		/*Requirements: press Down Arrow, 3 time tab key, press Enter*/
		
		/*Press Down Arrow on Keyboard*/
		robot.keyPress(KeyEvent.VK_DOWN);
		
		/*Press tab*/
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		/*Press Enter*/
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.quit();
		

	}

}

package selenium_webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_UseCases {

	private static Object JavaScriptUtil;

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement join = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		WebElement login = driver.findElement(By.xpath("//*[@name='login']"));
		
//		flash(join, driver);
		
		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		flash(password, driver);
		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		flash(login, driver);
		
		/*draw a border around the element*/
		((JavascriptExecutor_UseCases) JavaScriptUtil).drawBorder(login, driver);
		
		
		/*take screen shot for defect or error*/
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\ScreenShots\\twoplugs1.png");
		FileUtils.copyFile(src, target);
		
		/*get page title*/
		System.out.println(driver.getTitle());
		String jsTitle = ((JavascriptExecutor_UseCases) JavaScriptUtil).getTitleByJS(driver);
		System.out.println(jsTitle);
		
		/*sometime click not work direct with web element, we can use JavascirptExecutor*/
//		((JavascriptExecutor_UseCases) JavaScriptUtil).clickElementByJS(login, driver);
		
		/*generate alert*/
		((JavascriptExecutor_UseCases) JavaScriptUtil).generateAlertByJS(driver, "Please fill out with valid credential");
		driver.switchTo().alert().accept();
		
		/*refresh page*/
//		driver.navigate().refresh();
//		Thread.sleep(100);
//		((JavascriptExecutor_UseCases) JavaScriptUtil).refreshPageByJS(driver);
		
		
		/*scrollIntoView(true)*/
		WebElement footer = driver.findElement(By.xpath("//*[@id='pageFooter']/div[3]/div/span"));
		((JavascriptExecutor_UseCases) JavaScriptUtil).scrollIntoView(footer, driver);
		
		
		/*scroll down page till end*/
//		((JavascriptExecutor_UseCases) JavaScriptUtil).scrollPageDown(driver);
		
//		driver.quit();
		
	}
	
	public static void flash(WebElement element, WebDriver driver) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolor = element.getCssValue("backgroundColor");
		
		for(int i=0;i<500;i++) {
			changeColor("#000000", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(300);
		} catch(InterruptedException e) {
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='10px solid red'", element);
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void generateAlertByJS(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+ message+"')");
	}
	
	public static void refreshPageByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go[0]");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	

}

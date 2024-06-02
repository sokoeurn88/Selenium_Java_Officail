package javascriptexecutor_demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoon_and_Minimize_Page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//zoom page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='20%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='40%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='60%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='100%'");
		
		driver.quit();

	}

}

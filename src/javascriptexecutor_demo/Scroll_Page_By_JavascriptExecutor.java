package javascriptexecutor_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Page_By_JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//scroll page by pixel
		JavascriptExecutor js = (JavascriptExecutor ) driver;
		
		js.executeScript("window.scrollBy(0, 1500)", args);
		
		//getting page location after scrolling
		System.out.println(js.executeScript("return window.pageYOffset;" ));		//for horizontal x; pageXOffset
		
		//scroll untill the element is visible
		
		WebElement my_account_element = driver.findElement(By.xpath("//div[@class='title']//strong[contains(text(), 'My account')]"));
		
		js.executeScript("arguments[0].scrollIntoView()", my_account_element);
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//scroll to the end of page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");		//for horizontal x, scrollWith;
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(2000);
		
		//return to initial location
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
	}

}

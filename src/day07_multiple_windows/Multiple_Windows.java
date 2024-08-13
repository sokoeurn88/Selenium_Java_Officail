package day07_multiple_windows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterateWindow = windows.iterator();
		
		String parentWindow = iterateWindow.next();
		
		String childWindow = iterateWindow.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println( driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(parentWindow);
		
		System.out.println( driver.findElement(By.cssSelector(".example h3")).getText());
				
		driver.quit();
		

	}
}

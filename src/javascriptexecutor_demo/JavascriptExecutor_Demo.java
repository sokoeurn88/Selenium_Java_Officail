package javascriptexecutor_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sokouern Chhay");
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		//we can't write JavascriptExecutor js = new JavascriptExecutor(driver), Because JavascriptExecutor is the inferface, we can't create the object of interface.;
		
		js.executeScript("arguments[0].setAttribute('value', 'Sokoeurn Chhay')", inputBox);
		
		
//		driver.findElement(By.xpath("//input[@id='female']")).click();
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='female']"));
		
		js.executeScript("arguments[0].click()", radiobtn);
		
		driver.quit();
		
		

	}

}

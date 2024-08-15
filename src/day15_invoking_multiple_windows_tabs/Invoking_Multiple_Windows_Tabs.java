package day15_invoking_multiple_windows_tabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoking_Multiple_Windows_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses']")).click();
		String couseName = driver.findElement(By.xpath("//div[contains(text(),'Boost your career with UNLIMITED ACCESS to ALL existing and future courses')]")).getText();
		System.out.println(couseName);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("div>input[name='name']")).sendKeys(couseName);
		
		Thread.sleep(Duration.ofSeconds(2));
		driver.quit();
	}

}

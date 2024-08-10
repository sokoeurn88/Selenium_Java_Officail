package day04_automate_form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("abc");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		WebElement selElement = (WebElement) driver.findElements(By.id("exampleFormControlSelect1"));
		Select sel = new Select(selElement);
		sel.selectByValue("Male");
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id='inlineRadio2']")).isSelected();
		
		
		
		
		
		driver.findElement(By.className("form-control")).sendKeys("8/10/2024");
		driver.findElement(By.className("btn btn-success")).click();
		
	}

}

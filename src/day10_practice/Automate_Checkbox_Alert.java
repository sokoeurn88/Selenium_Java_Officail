package day10_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_Checkbox_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		System.out.println(driver.findElement(By.xpath("//label[@for='honda']")).getText());
		
		String selectedCheckBox = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		
		WebElement selecElement = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sel = new Select(selecElement);
		
		sel.selectByVisibleText(selectedCheckBox);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(selectedCheckBox);
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		if(alertText.contains(selectedCheckBox)) {
			System.out.println("Alert message is success.");
		} else {
			System.out.println("Something is wrong with execution");
		}
		
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.quit();
		

	}

}

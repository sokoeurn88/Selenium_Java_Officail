package day05_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) {

		String userName = "sokoeurn";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.name("enter-name")).sendKeys(userName);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.switchTo().parentFrame();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.findElement(By.id("confirmbtn")).getText());
		driver.switchTo().alert().accept();

		driver.switchTo().parentFrame();

		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}

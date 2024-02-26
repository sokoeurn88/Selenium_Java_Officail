package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		driver.switchTo().alert().sendKeys("Sokoeurn Chhay");
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if(text.contains("Sokoeurn Chhay")) {
			System.out.println("Validation the test is passed.");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		driver.switchTo().alert().dismiss();
		
		
	

	}

}

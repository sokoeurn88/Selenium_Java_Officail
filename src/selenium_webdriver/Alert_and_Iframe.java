package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_and_Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.linkText("Alert with OK ")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();		
		

	}

}

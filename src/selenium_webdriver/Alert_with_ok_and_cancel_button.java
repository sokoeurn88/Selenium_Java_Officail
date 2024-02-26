package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_ok_and_cancel_button {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		
		/*swith to alert*/
		driver.switchTo().alert().accept();
		String actualtext = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();
		System.out.println(actualtext);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		driver.switchTo().alert().dismiss();
		String canceltext = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).getText();
		System.out.println(canceltext);
		
		driver.quit();
	
	}

}

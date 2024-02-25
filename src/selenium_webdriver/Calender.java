package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://goo.gl/kNZ6Sr");
		
		/*click on Calendar*/
		driver.findElement(By.xpath("html/body/form/div[2]/div[19]/img")).click();
		
		Select select = new Select(driver.findElement(By.xpath("html/body/div[1]/div/div/select")));
		select.selectByVisibleText("2017");
		
		for(int i=6;i>=1;i--) {
			
			driver.findElement(By.xpath("html/body/div[1]/div/a[2]/span")).click();
			
			String m = driver.findElement(By.xpath("html/body/div[1]/div/div/span")).getText();
			
			if(m.equals("December")) {
				
				driver.findElement(By.linkText("10")).click();
				break;
				
			}
		}
		
		
		
		
	}

}

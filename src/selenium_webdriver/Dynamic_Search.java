package selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Search {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java");
		
		Thread.sleep(3000);
		
		List<WebElement> webList = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='presentation']"));
		System.out.println(webList.size());	
		
		for(int i=0;i<=webList.size();i++) {
			String eachList = webList.get(i).getText();
			if(eachList.contains("java compiler")) {
				System.out.println(eachList);
				webList.get(i).click();
				break;
			}
		}
		
		driver.quit();

	}

}

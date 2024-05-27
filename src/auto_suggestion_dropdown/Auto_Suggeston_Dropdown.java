package auto_suggestion_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggeston_Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@class='wM6W7d']"));
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getText().equals("selenium foods")) {
				list.get(i).click();
				break;
			}
		}

		
		driver.quit();
	}

}

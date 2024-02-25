package selenium_webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("animals"));
		
		Select select = new Select(element);
		
		List originallist = new ArrayList();
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement e:options) {
			
			originallist.add(e.getText());
			
		}
		
		System.out.println(originallist);

	}

}

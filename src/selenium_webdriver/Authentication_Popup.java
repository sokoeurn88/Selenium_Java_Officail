package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		/*Inject username: admin and password: admin into URL*/
		
		/*Syntax: http://usernamevalue:passwordvalue@URL.COM*/
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		
		driver.quit();
	
	}

}

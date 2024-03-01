package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft_Edge_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:/Users/sokoeurn chhay/eclipse-workspace2024Feb/Selenium_Java_Official/Drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());

	}

}

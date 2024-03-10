package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SSL_and_Unstruted_Certificate_Website {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
		
		// Do not run the website. Just for demo
		
//		driver.get("https://cacert.org/");
//		System.out.println(driver.getTitle());
//		
//		
//		driver.quit();	
		

	}

}

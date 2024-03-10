package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevTools_for_Unstruted_Website {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((ChromeDriver)driver).getDevTools();
		
		devTools.createSession();
		
		
		devTools.send(Security.enable());
		
		devTools.send(Security.setIgnoreCertificateErrors(true));
		
		driver.get("https://expired.badssl.com/");

		
		
	}

}

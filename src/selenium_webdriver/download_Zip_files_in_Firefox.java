package selenium_webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class download_Zip_files_in_Firefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\geckodriver.exe");
				
		/*Creating browser profile*/
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk", "application/zip");		/*"text/plain is for set MINE TYPES: https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types */	
		profile.setPreference("browser.download.manager.showWhenStarting", false);

		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://logging.apache.org/log4j/2.x/download.html");
		
		driver.findElement(By.xpath("/html/body/div/div/main/table/tbody/tr[1]/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/main/div/p[2]/a/strong")).click();
		Thread.sleep(4000);
		
	
		driver.quit();
	}

}

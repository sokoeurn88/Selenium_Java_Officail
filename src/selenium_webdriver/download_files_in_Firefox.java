package selenium_webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class download_files_in_Firefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\geckodriver.exe");
				
		/*Creating browser profile*/
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk", "text/plain");		/*"text/plain is for set MINE TYPES: https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types */	
		profile.setPreference("browser.download.manager.showWhenStarting", false);

		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Monday downloading text file");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		Thread.sleep(10);
		
		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Pdf Monday downloading text file");
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		Thread.sleep(10);
		
		
		
		
		driver.quit();
	}

}

package selenium_webdriver;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class download_files_to_specific_locations {

	public static void main(String[] args) throws InterruptedException {
		
		/*download file to required location using chrome*/
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.prompt_for_download", "false");
		chromePrefs.put("download.default_directory", "c:\\Downloadedfiles");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver(cap);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Sunday evening I am cooking some food.");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();

		
		/*verify if the file get download*/
		
		if(isFileExist("C://Downlaodedfiles/info.txt")) {
			System.out.println("file exist");
		} else {
			System.out.println("file is not exist");
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Sunday evening I am cooking some food.");
		
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		
		
		/*verify if pdf file get download*/
		if(isFileExist("C://Downlaodedfiles/info.pdf")) {
			System.out.println("file exist");
		} else {
			System.out.println("file is not exist");
		}
		
		
//		driver.quit();
	}

	/*Verify if the file exist or not*/
	static boolean isFileExist(String path){
		
		File f = new File(path);
		
		if(f.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
}

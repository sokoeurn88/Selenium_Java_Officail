package selenium_webdriver;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class download_files {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Sunday evening I am cooking some food.");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();

		
		/*verify if the file get download*/
		
		if(isFileExist("C://Users/sokoeurn chhay/Downloads/info.txt")) {
			System.out.println("file exist");
		} else {
			System.out.println("file is not exist");
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Sunday evening I am cooking some food.");
		
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		
		
		/*verify if pdf file get download*/
		if(isFileExist("C://Users/sokoeurn chhay/Downloads/info.pdf")) {
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

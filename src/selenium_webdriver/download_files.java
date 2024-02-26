package selenium_webdriver;

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

		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Sunday evening I am cooking some food.");
		
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		
		
//		driver.quit();
	}

}

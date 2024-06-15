package chromeoptions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Block_Ads {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		
		File file = new File("C:\\Users\\sokoeurn chhay\\Downloads\\uBlock-Origin.crx");
		
		co.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");

	}

}

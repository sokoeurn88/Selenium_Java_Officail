package chromeoptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bad_SSS_Certificate {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		
		co.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		System.out.println( driver.getTitle());

	}

}

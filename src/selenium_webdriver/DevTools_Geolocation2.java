package selenium_webdriver;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class DevTools_Geolocation2 {

	
	public static void main(String[] args ) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/geolocation");

		//https://www.google.com/maps/place/Phnom+Penh,+Cambodia/@11.579654,104.7253719,11z/data=!3m1!4b1!4m6!3m5!1s0x3109513dc76a6be3:0x9c010ee85ab525bb!8m2!3d11.5563738!4d104.9282099!16zL20vMGRsd2o?entry=ttu
		//11.579654,104.7253719
		
		DevTools devTools = ((ChromeDriver)driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Emulation.setGeolocationOverride(Optional.of(11.579654), Optional.of(104.7253719), Optional.of(100)));
	
		
		driver.findElement(By.xpath("//button[contains(text(), 'Where am I?')]")).click();
		driver.findElement(By.xpath("//div[@id='map-link']/a")).click();
		
		driver.quit();
	}

}

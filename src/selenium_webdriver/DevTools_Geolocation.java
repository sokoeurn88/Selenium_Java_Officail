package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.ImmutableMap;

public class DevTools_Geolocation {

	
	public static void main(String[] args ) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/geolocation");


		//https://www.google.com/maps/place/Phnom+Penh,+Cambodia/@11.579654,104.7253719,11z/data=!3m1!4b1!4m6!3m5!1s0x3109513dc76a6be3:0x9c010ee85ab525bb!8m2!3d11.5563738!4d104.9282099!16zL20vMGRsd2o?entry=ttu
		//11.579654,104.7253719
		
		//update geo location
		ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
		
		params.put("latitude", 11.579654);
		params.put("longtitude", 104.7253719);
		params.put("accuracy", 100);
		
		//this piece of code below is not working right now. need more implementation
		
//		((ChromeDriver)driver).executeCdpCommand(commandName:"Emulation.setGeolocationOverride", params.build());
		
		//casting the chrome driver
		
				
		
		
		driver.findElement(By.xpath("//button[contains(text(), 'Where am I?')]")).click();
		
//		driver.quit();
	}

}

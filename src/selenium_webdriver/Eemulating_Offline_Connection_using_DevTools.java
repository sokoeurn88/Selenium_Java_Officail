package selenium_webdriver;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.model.ConnectionType;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.devtools.v85.network.Network;

public class Eemulating_Offline_Connection_using_DevTools {

	
	public static void main(String[] args ) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((ChromeDriver)driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.of(100000000), Optional.empty(), Optional.empty()));
		
//		devTools.send((Network.emulateNetworkConditions(true, 100, 1000, 2000, Optional.of(ConnectionType.CELLULAR3G))));
		
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/geolocation");
		
		driver.quit();
	}

}

package keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_and_Window {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		// open new tab
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://orangehrm.com/");
		
		//open new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://orangehrm.com/");

	}

}

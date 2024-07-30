package window_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Pop_Up {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "./Drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com");	//this is Window pop up: https://username_value:password_value@the-internet.herokuapp.com
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();	//username:admin and password is admin
		
		
	}

}

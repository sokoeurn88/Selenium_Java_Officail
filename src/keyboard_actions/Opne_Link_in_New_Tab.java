package keyboard_actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opne_Link_in_New_Tab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		//ctrl + click()
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		//driver focus is still on first tab browser
//		Set<String> ids = driver.getWindowHandles();
		
		 List<String> ids = new ArrayList(driver.getWindowHandles());
		 
		 //switchTo registration browser
		 driver.switchTo().window(ids.get(1));
		 
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mr Sokoeurn");
		 
		 //switchTo Home page
		 driver.switchTo().window(ids.get(0));
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
		 

	}

}

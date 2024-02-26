package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick_Actions_Class2 {

	public static void main(String[] args) {
		
		/*Handling mouse movement: is done using Advance User Interface
		 * 
		 * it contains the actions and Actions Class that are needed to execute this event.
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));

		act.contextClick(ele).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		
		/*alert will display a message*/
		System.out.println(driver.switchTo().alert().getText());
		
		driver.quit();
	}

}

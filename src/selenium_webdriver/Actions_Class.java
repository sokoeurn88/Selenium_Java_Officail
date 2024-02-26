package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) {
		
		/*Handling mouse movement: is done using Advance User Interface
		 * 
		 * it contains the actions and Actions Class that are needed to execute this event.
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		/*Login info*/
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("userpassword")).sendKeys("admin");
		driver.findElement(By.name("btn")).click();
		
		/*Mouse flow -> admin -> User management -> Users*/
		
		Actions act = new Actions(driver);
		
		WebElement admin = driver.findElement(By.xpath("//*[@name='admin']"));
		act.moveToElement(admin).build().perform();
		
		WebElement usermanagement = driver.findElement(By.xpath("//*[@name='user management']"));
		act.moveToElement(usermanagement).build().perform();
				
		WebElement users = driver.findElement(By.xpath("//*[@name='user']"));
		act.moveToElement(users).build().perform();
		
//		act.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).click().build().perform();
		
		

	}

}

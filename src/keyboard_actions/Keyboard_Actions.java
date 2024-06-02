package keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	
	public static void main(String []args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.text-compare.com/");
		
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Hello Mr Sokoeurn Chhay");
		
		Actions action = new Actions(driver);
		
		//ctrl + A
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl + C
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//Tab
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctrl + v
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
//		 WebElement text2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
//		 
//		System.out.println(text2.getText());
		
		driver.quit();
		
		
	}

}

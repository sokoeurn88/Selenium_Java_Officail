package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		WebElement madrid = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement spain = driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		
//		act.clickAndHold(madrid).moveToElement(spain).release().build().perform();
		act.dragAndDrop(madrid, spain).build().perform();

	}

}

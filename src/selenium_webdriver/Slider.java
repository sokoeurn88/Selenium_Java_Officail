package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider, 500, 0).build().perform();
		
//		driver.switchTo().parentFrame();
		
		/*Resizable*/
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement resizeElement = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		act.moveToElement(resizeElement).dragAndDropBy(resizeElement, 400, 200).build().perform();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
//		driver.quit();
		
		/*https://jqueryui.com/resizable/*/

	}

}

package slider_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@name='rangeInput']//span[1]"));
		System.out.println(min_slider.getLocation());
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("point location atfer increase: "+min_slider.getLocation());
		
		//max slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@name='rangeInput']//span[2]"));
		System.out.println(max_slider.getLocation());
		
		action.dragAndDropBy(max_slider, -100, 250).perform();
		System.out.println(max_slider.getLocation());
		
		driver.quit();

	}

}

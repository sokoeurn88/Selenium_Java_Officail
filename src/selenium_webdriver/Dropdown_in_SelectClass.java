package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_in_SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_js_dropdown_filter");
		driver.manage().window().maximize();
		
		WebElement dropElement = driver.findElement(By.xpath("//button[contains(text(), 'Dropdown')]"));
		
		Select select = new Select(dropElement);
		
		select.selectByIndex(1);
		select.selectByValue("radio-2"); /*value = "radio-2"*/
		select.selectByVisibleText("Moringing");
		
		/*getting the dropdown size*/
		System.out.println(select.getOptions().size());
		
		/*select radio butoon*/
		if(driver.findElement(By.id("RESULT_RADIO_BUTTON-7_0")).isSelected()==true) { /*will return true or false*/
			
			driver.findElement(By.id("RESULT_RADIO_BUTTON-7_0")).click();
		}
		
		
		/*select check box*/
		
		
		
		
		driver.quit();

	}

}

package selenium_webdriver;



import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Compare_Images_using_Ashot_API {

	private static String png;

	public static void main(String[] args) throws IOException, InterruptedException {
		/*We need third party API jars from Maven Repository:
		 * ashot jar
		 * Gson jar
		 * Hamcreast-all jar
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");				
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement imageWebEle = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
		js.executeScript("arguments[0].click();", imageWebEle);
		
		Screenshot logoImageScreehshot = new AShot().takeScreenshot(driver, imageWebEle);
		
		ImageIO.write(logoImageScreehshot.getImage(), png, new File("C://Users/sokoeurn chhay/eclipse-workspace2024Feb/Selenium_Java_Official/ScreenShots/orange.png"));
		
		File f = new File("C://Users/sokoeurn chhay/eclipse-workspace2024Feb/Selenium_Java_Official/ScreenShots/orange.png");

		if(f.exists()) {
			System.out.println("Image captureing is completed");
		} else {
			System.out.println("Image is failed to capture");
		}
		
		driver.quit();
	}

}

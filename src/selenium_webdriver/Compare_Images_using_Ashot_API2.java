package selenium_webdriver;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Compare_Images_using_Ashot_API2 {

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
		
		BufferedImage expectedImage = ImageIO.read( new File("C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\ScreenShots\\twoplugs.png"));
		
		WebElement imageWebEle = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));

		
		Screenshot logoImageScreehshot = new AShot().takeScreenshot(driver, imageWebEle);
		
		BufferedImage actualtImage = logoImageScreehshot.getImage();
		
		
		/*Create ImageDiffer class*/
		ImageDiffer imgDiff = new ImageDiffer();
		
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualtImage);
		
		if(diff.hasDiff()==true) {
			System.out.println("Image is not safe");
		} else {
			System.out.println("Image is safe");
		}
		

		
		driver.quit();
	}

}

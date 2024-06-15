package takesscreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takes_Screenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);		//source file is store somewhere in the memory
		
		File f = new File(System.getProperty("user.dir")+"\\ScreenShots\\fullpage.png");
		
		sourcefile.renameTo(f);
		
		//take section screenshot
		WebElement fp = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sf = fp.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"\\ScreenShots\\fp.png");
		sf.renameTo(file);
		
		
		
		
		

	}

}

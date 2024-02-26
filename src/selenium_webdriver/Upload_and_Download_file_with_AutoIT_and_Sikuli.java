package selenium_webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Upload_and_Download_file_with_AutoIT_and_Sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		/*AutoIT--> more difficult to used, need download and install autoIT application
		 * 
		 * Sikuli---> easy to use, no need download applications. just add jar file
		 * 
		 * Stpes for Sikuli
		 * 
		 * 	-> Download Sikuli jar file
		 *  -> Add jar file to project build path
		 *  -> Write code for upload file scenario in webdriver
		 *  
		 * Sikuli is alway used screen capture to identify the element. 
		 * 
		 * Snipping Tool use to screen shot the srceen.  save sreen as png, PNG, jpg file or some others.
		 *  */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://demo.automationtesting.in/Register.html");
		
		/*code error with iframe, come back later*/
		
		driver.findElement(By.xpath("//*[@type='file']")).click();
		Thread.sleep(1000);
		
		String imageFilePath = "C:\\Users\\sokoeurn chhay\\OneDrive\\Pictures";
		String inputFilePath = "C:\\Users\\sokoeurn chhay\\OneDrive\\Pictures";
		
		Screen s = new Screen();
		
		Pattern fileInputTextBox = new Pattern(imageFilePath+"filename.png");
		Pattern openButoon= new Pattern(imageFilePath+"openfilename.png\"");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox, inputFilePath+"elon musk.webp");
		s.click(openButoon);
		
		driver.quit();
		
		
		
		
	}

}

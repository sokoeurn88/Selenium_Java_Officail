package selenium_webdriver;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i =0;i<=links.size();i++) {
			
			WebElement element =  links.get(i);
			
			String url = element.getAttribute("href");
			
			URL link = new URI(url).toURL();
			
			/*create a connection using url object link*/
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(20000);
			
			httpcon.connect();
			
			int rescode = httpcon.getResponseCode();
			
			if(rescode>=400) {
				
				System.out.println(url+" "+"is broken link");
			} else {
				
				System.out.println(url+" "+"is valid link");
			}
			
			
			driver.quit();
			
			
		}
		
		
		
		
		
	}

}

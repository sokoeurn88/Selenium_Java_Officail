package selenium_webdriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie cookieVariable : cookies) {
			
			System.out.println(cookieVariable.getName()+" : "+cookieVariable.getValue());
		}
		
		System.out.println(driver.manage().getCookieNamed("fr"));
		
		/*Add a cookies*/
		Cookie cookObj = new Cookie("sccookies", "chhay123456");
		driver.manage().addCookie(cookObj);
		
		for(Cookie cookieVariable : cookies) {
			
			System.out.println(cookieVariable.getName()+" : "+cookieVariable.getValue());
		}
		
		System.out.println(cookies.size());
		driver.quit();
		
		

	}

}

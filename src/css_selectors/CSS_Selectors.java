package css_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		
		/*	ID 		1) html tagname[attribute = value] e.g input[id='first_name]
		 * 			2) html tagname#value. e.g input#first_name
		 * 
		 * 	class	1) html tange [attribute = 'value'] e.g input[class='input r4 wide mb16 mt8 password']
		 * 			2) html tag.classvalue e.g a.fr small (try this code but not work in real website)
		 * 
		 *	others attributes ( value, type, placeholder ) 	1) html tagname[attribute='value']
		 *
		 *	combine css selector or mix selector		1) html tagname#id's value[attribute='value']
		 *												2) html tagname.class's value[attribute='value']
		 *
		 *	sub-string css selector for dynamic weblement		1) ^ sing - signify the prefix of the text e.g input[class^='input'][class$='username']
		 *														2) $ sign - signify the suffix of the text e.g input[class$='password']
		 *														3) * sign - signify the sub-string of the text  e.g input[class*='r4'][value*='In']
		 *
		 *	finding child or sub-child element		1) direct child > sign is used to select direct child. tagname[attribute='value']>tagname[attribute='value']
		 *																								e.g div#username_container>input[class^='input']
		 *											2) child or sub-child. Descendant combinator (space) is used to select child or subchild e.g tagname[attribute='value'] tagname=[attribute='value']
		 *												
		 *	next sibling	1) sibling element are located using + operator e.g label.label+input[name='pw']
		 *					2) adjacent sibling (+) separate two css selector and match the second webelement only if it immediate follows the first webelement, and both are child of the same parent
		 *
		 *	CSS Selector PSEUDO-CLASS is a keyword added to selector that specifies a special state of the select element
		 *
		 *	:first-child - return first element from group of sibling elements
		 *
		 *	:last-child - returns last element from the group of sibling elements
		 *
		 *	:nth-child() - return elements based on their position in a group of siblings
		 *
		 *	:nth-last-child() - return element based on their position among a group of sibling, counting from the end.
		 * 
		 * 	CSS SELECTOR PSEUDO-CLASSES CONTINUE
		 * 
		 * 	first-of-type - return the first element if its type among a group of sibling elements
		 * 
		 * 	last-of-type - return last element of its type a mong a group of sibling elements
		 * 
		 * 	nth-of-type() matches element of given type, based on their position among a group of sibling
		 * 
		 * 
		 * */ 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\eclipse-workspace2024Feb\\Selenium_Java_Official\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[class^='input'][class$='username']")).sendKeys("sokouern");
		driver.findElement(By.cssSelector("input[class$='password']")).sendKeys("chhay");
		driver.findElement(By.cssSelector("input[class*='r4'][value*='In']")).click();
		
		
		driver.findElement(By.cssSelector("#username_container>input[class^='input']")).sendKeys("sarom");
		driver.findElement(By.cssSelector("label.label+input[name='pw']")).sendKeys("chhay");

		driver.findElement(By.cssSelector("a#signup_link")).click();

		
		
		//	:first-child
		driver.findElement(By.cssSelector("select[name='CompanyEmployees'] option:last-child")).click();
		driver.findElement(By.cssSelector("select[name='CompanyCountry']>option:nth-child(3)")).click();
		
		
		// :nth-of-type(5)
		driver.findElement(By.cssSelector("form[name='signup_form_RtZv']>div:nth-of-type(5)>div>input[name='UserPhone']")).sendKeys("5523659874");
		
		
		
			
		
		
		driver.quit();
		

	}

}

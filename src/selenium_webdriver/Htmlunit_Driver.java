package selenium_webdriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunit_Driver {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}

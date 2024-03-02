package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Registration_Page {
	
	WebDriver driver;
	
	By userName = By.xpath("//input[@name='userId']");
	
	
	/*way 1*/
	@FindBy(how = How.PARTIAL_LINK_TEXT, using="Choose")
	WebElement checkingAcc;
	
	
	/*way 2*/
//	@FindBy(name = "firstName")
//	WebElement fname;
	
	
	
	/*class constructor*/
	Registration_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); /* use this code when using @FindBy()*/
	}
	
	public void setUserName(String uName) {
		driver.findElement(this.userName).sendKeys(uName);
	}
	
	public void createCheckingAcc() {
		checkingAcc.click();
	}

}

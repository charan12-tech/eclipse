package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PageFactory {
	public Login_PageFactory(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver=driver1;
		
	}
	WebDriver driver;
	
	
	//By username=By.id("input-email");
	
	@FindBy(id="input-email")
	WebElement username;
	
	//By password=By.id("input-password");
	
	@FindBy(id="input-password")
	WebElement password;
	
	//By loginbutton=By.xpath("//button[normalize-space()='Login']");
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbutton;
	
	
	void enterusername(String email)
	{
		username.sendKeys(email);
	}
	void enterpassword(String passwords)
	{
		password.sendKeys(passwords);
	}
	void clickonloginbutton()
	{
		loginbutton.click();;
	}

}


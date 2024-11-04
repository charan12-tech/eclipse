package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_pom {
	public Login_pom(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver=driver1;
		
	}
	WebDriver driver;
	
	By username=By.id("input-email");
	By password=By.id("input-password");
	By loginbutton=By.xpath("//button[normalize-space()='Login']");
	void enterusername(String email)
	{
		driver.findElement(username).sendKeys(email);
	}
	void enterpassword(String passwords)
	{
		driver.findElement(password).sendKeys(passwords);
	}
	void clickonloginbutton()
	{
		driver.findElement(loginbutton).click();;
	}

}


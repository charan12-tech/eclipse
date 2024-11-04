package PAC_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_login_pagefactory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Login_PageFactory obj=new Login_PageFactory(driver);
		
		
		
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		obj.enterusername("charanpanamata12@gmail.com");
		obj.enterpassword("Amma@2002");
		obj.clickonloginbutton();

	}

}

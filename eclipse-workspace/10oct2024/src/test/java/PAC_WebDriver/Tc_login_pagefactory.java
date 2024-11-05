package PAC_WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_login_pagefactory {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String project_path=System.getProperty("user.dir");
		System.out.println(project_path);
		Properties pro=new Properties();
		InputStream input=new FileInputStream(project_path+"\\login_properties");
		pro.load(input);
		String snapdeal_url=pro.getProperty("url");
		String usrname=pro.getProperty("username");
		String passw=pro.getProperty("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Login_PageFactory obj=PageFactory.initElements(driver,Login_PageFactory.class);
		
		
		
		driver.get(snapdeal_url);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		obj.enterusername(usrname);
		obj.enterpassword(passw);
		obj.clickonloginbutton();

	}

}

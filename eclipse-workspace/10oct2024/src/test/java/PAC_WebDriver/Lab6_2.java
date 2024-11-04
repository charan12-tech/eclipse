package PAC_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Lab6_pom obj= new Lab6_pom(driver);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		obj.select_Mens_fashion();
		obj.select_Sport_shoes();
		obj.select_Sorting();
		obj.select_Price_hightolow();
		
		
		
		
		
		
		

	}

}

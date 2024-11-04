package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("Title of page is "+driver.getTitle());
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		ele.sendKeys("Testing Method");
		ele.submit();
	
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.navigate().to("https://www.yahoo.com/");
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.close();

	}

}

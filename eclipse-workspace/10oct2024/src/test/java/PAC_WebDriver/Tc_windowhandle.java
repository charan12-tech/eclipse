package PAC_WebDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("multi")).click();
		
		List<String> wh=new ArrayList(driver.getWindowHandles());
		
		for(String i:wh)
		{
			System.out.println(i);
		}
		driver.switchTo().window(wh.get(1));
		System.out.println("current page url :"+driver.getCurrentUrl());
		driver.switchTo().window(wh.get(0));
		System.out.println("current page url :"+driver.getCurrentUrl());
		driver.switchTo().window(wh.get(2));
		System.out.println("current page url :"+driver.getCurrentUrl());

	}

}

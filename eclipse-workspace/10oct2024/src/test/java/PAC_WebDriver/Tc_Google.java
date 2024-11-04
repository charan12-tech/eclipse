package PAC_WebDriver;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('search testing methods');");
		
		Thread.sleep(5000);
		System.out.println("Title of page is :"+driver.getTitle());
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		Wait wait1=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		
		ele.sendKeys("Testing Method");
		ele.submit();
		
		System.out.println("Title of the page is :"+driver.getTitle());
		
		

	}

}

package PAC_WebDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a/span")).click();
//		driver.findElement(By.className("sort-selected")).click();
//		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/ul/li[3]")).click();
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"622160125482\"]/div[1]/a/picture/img")).click();
//		
//		List<String> wh=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(wh.get(1));
//	     // Initialize JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
// 
//        // Scroll down the webpage once
//        js.executeScript("window.scrollTo(0, window.innerHeight);"); // Scroll down by one viewport height
//        
//        driver.findElement(By.id("add-cart-button-id")).click();
//        
//        System.out.println("Item added to cart :"+driver.findElement(By.className("mess-text")).isDisplayed());
        
        driver.findElement(By.id("inputValEnter")).sendKeys("apple 15 mobile");
        
        driver.findElement(By.className("searchTextSpan")).click();
        
        driver.findElement(By.className("sort-selected")).click();
		
        driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div[3]/div[1]/div/div[2]/ul/li[4]")).click();
        
        

        Thread.sleep(5000);
       
        driver.findElement(By.xpath("//*[@id=\"618850699446\"]/div[1]/a/picture/img")).click();
        List<String> wh1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wh1.get(1));
        

        js.executeScript("window.scrollTo(0, window.innerHeight);"); 
        
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[normalize-space()='add to cart']")).click();
        
        System.out.println("Item added to cart :"+driver.findElement(By.className("mess-text")).isDisplayed());
		
        driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[1]/div/i")).click();
        //driver.findElement(By.className("sd-icon sd-icon-cart-icon-white-2")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"CS1\"]")).click();
        
        driver.findElement(By.xpath("//body/div[23]/ul[1]/li[3]")).click();
        

		System.out.println("completed");
		
		
		

	}

}

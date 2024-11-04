package PAC_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_Lab5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().setSize(new Dimension(1202,672)); 
		
		driver1.get("https://demo.opencart.com/en-gb?route=account/register");
		if(driver1.getTitle().equals("Register Account"))
		{
			System.out.println("Title of page is "+driver1.getTitle());
			
		
			
			 ((JavascriptExecutor) driver1).executeScript("window.scrollTo(0,document.body.scrollHeight);");
			 Thread.sleep(5000);
			 driver1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			 
			 System.out.println("Alert Warning :"+driver1.findElement(By.id("alert")).isDisplayed());
			 
			 Thread.sleep(5000);
			 
			 ((JavascriptExecutor) driver1).executeScript("window.scrollTo(0,0);");
		
			 Thread.sleep(5000);
			
			 driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			 WebElement fname=driver1.findElement(By.id("input-firstname"));

			 fname.sendKeys("dacxvjdsvsbcvcjbjhcvjcjvchdcbjvcjsbvhshs hsvskujnksvhsvjs jsvhsv");
			 fname.submit();
			 System.out.println("firstname error :"+driver1.findElement(By.id("error-firstname")).isDisplayed());
			 
			 



			 
	    } 
		else 
		{
	            System.out.println("Web page title mismatched");
	    }
	        
	        driver1.close();
		}
	
		
		
		

	}






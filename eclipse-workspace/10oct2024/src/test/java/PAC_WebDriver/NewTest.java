package PAC_WebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  driver.findElement(By.id("input-email")).sendKeys(username);
	  driver.findElement(By.id("input-password")).sendKeys(password);
	  
	  js.executeScript("window.scrollTo(0, window.innerHeight);"); 
		Thread.sleep(5000);
		
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  Thread.sleep(5000);
	  System.out.println("this is test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	driver.get("https://demo.opencart.com/en-gb?route=account/login");
	driver.manage().window().maximize();
	  System.out.println("this is @beforemethod");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
	  driver.findElement(By.cssSelector("body main a:nth-child(13)")).click();
	  System.out.println("this is aftermethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "charanpanamat12@gmail.com", "Amma@2002"}
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is @beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is @afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is @beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is @aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is @beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is @aftertest");
  }


}

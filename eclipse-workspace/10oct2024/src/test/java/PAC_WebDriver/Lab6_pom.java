package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lab6_pom {
	
	public Lab6_pom(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver=driver1;
	}
	WebDriver driver;
	By Mens_Fashion=By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]");
	By Sport_shoes=By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a/span");
	By Sorting=By.className("sort-selected");
	By Price_hightolow=By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/ul/li[3]");
	
	void select_Mens_fashion() 
	{
		driver.findElement(Mens_Fashion).click();
	}
	void select_Sport_shoes()
	{
		driver.findElement(Sport_shoes).click();
	}
	void select_Sorting()
	{
		driver.findElement(Sorting).click();
	}
	void select_Price_hightolow()
	{
		driver.findElement(Price_hightolow).click();
	}
	

}

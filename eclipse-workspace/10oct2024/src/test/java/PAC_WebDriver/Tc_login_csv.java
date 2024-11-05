package PAC_WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_login_csv {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String project_path=System.getProperty("user.dir");
		System.out.println(project_path);
		
		FileInputStream input=new FileInputStream(project_path+"\\login1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("login");
		
		int noofrows=sheet.getPhysicalNumberOfRows();
		System.out.println("rows:"+noofrows);
		
		for(int i=0;i<noofrows;i++)
		{
			String url=sheet.getRow(i).getCell(0).getStringCellValue();
			String uname=sheet.getRow(i).getCell(1).getStringCellValue();
			String pword=sheet.getRow(i).getCell(2).getStringCellValue();
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			Login_PageFactory obj=PageFactory.initElements(driver,Login_PageFactory.class);
			
			
			
			driver.get(url);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			obj.enterusername(uname);
			obj.enterpassword(pword);
			obj.clickonloginbutton();
		}
		

	}

}

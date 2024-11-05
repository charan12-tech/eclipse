package PAC_WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_login_xml {

	public static void main(String[] args) throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		String project_path=System.getProperty("user.dir");
		System.out.println(project_path);
		/*Properties pro=new Properties();
		InputStream input=new FileInputStream(project_path+"\\login_properties");
		pro.load(input);
		String snapdeal_url=pro.getProperty("url");
		String usrname=pro.getProperty("username");
		String passw=pro.getProperty("password");
		*/
		
		File xmlfile=new File(project_path+"\\login.xml");
		
		DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder DBBuilder=DBFactory.newDocumentBuilder();
		Document DBDoc=(Document) DBBuilder.parse(xmlfile);
		
		NodeList NL=((Node) DBDoc).getChildNodes();
		Node n=NL.item(0);
		Element ele=(Element)n;
		
		String opencart_url=ele.getElementsByTagName("url").item(0).getTextContent();
		String uname=ele.getElementsByTagName("username").item(0).getTextContent();
		String pword=ele.getElementsByTagName("password").item(0).getTextContent();
		
		System.out.println("username"+uname);
		System.out.println("password"+pword);
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Login_PageFactory obj=PageFactory.initElements(driver,Login_PageFactory.class);
		
		
		
		driver.get(opencart_url);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		obj.enterusername(uname);
		obj.enterpassword(pword);
		obj.clickonloginbutton();


	}

}

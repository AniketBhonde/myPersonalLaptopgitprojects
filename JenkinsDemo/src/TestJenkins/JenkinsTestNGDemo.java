package TestJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JenkinsTestNGDemo {

public WebDriver driver;
	
	@Test
	public void openSite()
	{
		driver.get("https://www.flipkart.com/");
	}
	
	@BeforeClass
	public void  setUp(){
		System.setProperty("webdriver.chrome.driver" , "D:\\CP-SAT\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@AfterClass
	public void done(){
		driver.quit();
	}

	
	
}

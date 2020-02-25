package SeleniumTests;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeTest1 {

	
	public static void main (String args[]) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver" , "D:\\CP-SAT\\ChromeDriver2.35\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		try {
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("abhonde320@gmail.com");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("aniket11store");
			driver.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
			
			//MouseHover Code
			Actions actions = new Actions(driver);
			Thread.sleep(2000);
			WebElement Electronics = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
			actions.moveToElement(Electronics).build().perform();
			
			
			//Explicit Wait
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Apple']")));
			
			driver.findElement(By.xpath("//a[text()='Apple']")).click();
			
			driver.findElement(By.xpath("//img[@class='_2VeolH _3I5S6S' and @alt='iPhone 8 Plus X3 for Store']")).click();
			
			//DropDown
			Select MIN = new Select(driver.findElement(By.xpath("//select[@class='fPjUPw']")));
			MIN.selectByValue("2000");
			
			//CheckBox
			WebElement CKB=driver.findElement(By.xpath("//div[@class='_1p7h2j _2irnD_']"));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_1p7h2j _2irnD_']")));
			//wait.until(ExpectedConditions.visibilityOf(CKB));
			CKB.click();
			
			
			//Concept 
			//Internal wait waits until it locates the element.
			
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			System.out.println(timestamp);
			try {
				driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div/div[1]/a")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
				System.out.println(timestamp1);
				
			}
			
					
			Thread.sleep(5000);
			driver.quit();
			System.out.println("Code successfully executed");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			driver.quit();
		}
			
		
		
	}
	
	
}

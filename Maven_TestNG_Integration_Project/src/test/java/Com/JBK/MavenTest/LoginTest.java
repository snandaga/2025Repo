package Com.JBK.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.JBK.MavenCode.LoginPages;


public class LoginTest {
	WebDriver driver;
	LoginPages lp;
	
	@BeforeMethod
	public void testLoginPage(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing_Java%20By%20Kiran/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		lp= new LoginPages(driver);
		
	}
	@Test
	public void testToNextpage() {
		lp.testDataLoginPage();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

}

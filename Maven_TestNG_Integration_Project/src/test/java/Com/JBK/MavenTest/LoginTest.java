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
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // For newer Chrome versions
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
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

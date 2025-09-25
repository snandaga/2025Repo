package Com.JBK.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.JBK.MavenCode.DashboardPage;
import Com.JBK.MavenCode.LoginPages;



public class DashboardTest {
	
	WebDriver driver;
	LoginPages lp;
	DashboardPage dp;
	
	@BeforeMethod
	public void openBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing_Java%20By%20Kiran/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		lp= new LoginPages(driver);
		dp = new DashboardPage(driver);
		
	}
	@Test
	public void testToNextpage() {
		lp.testDataLoginPage();
		dp.testLogout();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
}

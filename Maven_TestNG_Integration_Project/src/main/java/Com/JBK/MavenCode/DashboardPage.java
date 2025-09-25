package Com.JBK.MavenCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement logout;
	
	public DashboardPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void testLogout() {
		logout.click();
	}


}

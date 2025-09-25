package Com.JBK.MavenCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//button")
	public WebElement Button;
	
	public LoginPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void testDataLoginPage() {
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		Button.click();
	}

}

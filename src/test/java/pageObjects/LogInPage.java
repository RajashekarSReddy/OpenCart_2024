package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement continueLogin;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continueRegister;
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement Textverify;
	
	
public void sendLoginEmail(String mail)
	 {
email.sendKeys(mail);

}
public void sendLoginPassword(String pword) {
password.sendKeys(pword);
}

public void ClickcontinueLogin() {
continueLogin.click();
}

public void ClickcontinueRegister() {
continueRegister.click();
}

public String teXtVerify()
{
try {
return(driver.getTitle());
}
catch(Exception e) {
	return (e.getMessage());
		

}	}
}

package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegistrationTestcase {
	public WebDriver driver;
	@Test(priority=1)
	public void OpenBrowser() {
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test(priority=2)
	public void launchApp() {
		driver.get("http://localhost/opencart/upload/");
	}
	@Test(priority=3)
	public void register() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		Thread.sleep(2000);
		
		hp.clickOnRegister();
		Thread.sleep(2000);
		
		RegisterPage rp=new RegisterPage(driver);
		Thread.sleep(2000);
		
		rp.sendFirstName("asd");
		Thread.sleep(2000);
		
	    rp.sendLastName("h");
	    Thread.sleep(2000);
	    
	    rp.sendEmail("hy@gmail.com");
	    Thread.sleep(2000);
	    
         rp.sendPasword("12456");
         Thread.sleep(2000);
         
         rp.selectAgree();
         Thread.sleep(3000);
         
         rp.ClickContinue();
		
	}

}
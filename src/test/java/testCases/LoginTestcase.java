package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTestCase extends BaseClass{
	@Test(priority=1)
	public void login() throws InterruptedException {
		logger.info("starting login testcase");
			
			HomePage hp=new HomePage(driver);
			logger.info("clicking on my account");
			hp.ClickOnMyAccount();	
			Thread.sleep(2000);
			logger.info("clicking on login");
			hp.clickOnLogin();
			Thread.sleep(2000);
			
			
			
			logger.info("entering the credentias");
			LoginPage lp=new LoginPage(driver);
			Thread.sleep(2000);
			
			lp.sendLoginEmail("ab@gmail.com");
			Thread.sleep(2000);
		    lp.sendLoginPassword("1234");
		    Thread.sleep(2000);
		    lp.ClickcontinueLogin();
			logger.info("login testcase is completed");
	}
}
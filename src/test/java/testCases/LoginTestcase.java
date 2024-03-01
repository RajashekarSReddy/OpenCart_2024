package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class LoginTestcase extends BaseClass {
@Test(priority=3)
	public void logIn() throws InterruptedException {
	logger.info("clicking on my account");
		HomePage hp=new HomePage(driver);
	hp.clickOnMyAccount();
	Thread.sleep(2000);
	logger.info("clicking on login");
	hp.clickonLogin();
	Thread.sleep(2000);
	
	logger.info("Enter the credentials");
	LogInPage lg=new LogInPage(driver);
	lg.sendAddress("hy@gmail.com");
	Thread.sleep(2000);
	lg.sendPassword("12456");
	Thread.sleep(2000);
	lg.selectLogIn();
	logger.info("login testcase is completed");
	
}
	
}



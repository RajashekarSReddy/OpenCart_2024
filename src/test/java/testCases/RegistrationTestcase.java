package testCases;


import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class RegistrationTestCase extends BaseClass{

	@Test(priority=3)
	public void register() throws InterruptedException {
		
		logger.info("starting registration testcase");
		HomePage hp=new HomePage(driver);
		logger.info("clicking on my account");
		hp.ClickOnMyAccount();
		Thread.sleep(2000);
		logger.info("clicking on register");
		hp.clickOnRegister();
		Thread.sleep(2000);
		logger.info("entering the credentias");
		RegisterPage rp=new RegisterPage(driver);
		Thread.sleep(2000);
		rp.sendFirstName("ab");
		Thread.sleep(2000);
	    rp.sendLastName("hs");
	    Thread.sleep(2000);
	    rp.sendEmail("ab@gmail.com");
	    Thread.sleep(2000);
         rp.sendPasword("1234");
         Thread.sleep(2000);
         rp.selectAgree();
         Thread.sleep(3000);
         rp.ClickContinue();
			logger.info("registration testcase is completed");
}
}
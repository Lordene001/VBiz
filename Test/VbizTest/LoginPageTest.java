package VbizTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.LoginPage;

public class LoginPageTest {


	@Test
	public void Verify_Login_LogOut_With_Valid_Details() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		LoginPage LP = new LoginPage(driver);
		LP.LoginEmail("mkparuchisom@gmail.com");
		LP.LoginPassword("Password@1");
		Thread.sleep(500);
		Boolean LoginMessage = LP.LoginMessage();
		Assert.assertTrue(LoginMessage);
		Thread.sleep(500);
		
		Boolean LogoutMessage = LP.LogOut();
		Assert.assertTrue(LogoutMessage);
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Login_With_Invalid_Details() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		LoginPage LP = new LoginPage(driver);
		LP.LoginEmail("abc@gmail.com");
		LP.LoginPassword("Password");
		Thread.sleep(2000);
		Boolean Text = LP.InvalidLoginAlert();
		Assert.assertTrue(Text);
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Login_With_Empty_Field() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		LoginPage LP = new LoginPage(driver);
		LP.LoginEmail("");
		LP.LoginPassword("");
		Boolean Button = LP.LoginButton();
		Assert.assertFalse(Button);
		BaseClass.TearDown(driver);
	}
	
	

	@Test
	public void Verify_Reset_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		LoginPage LP = new LoginPage(driver);
		LP.ResetPassword("abc@gmail.com");
		BaseClass.TearDown(driver);
		//To add assertion we need a vbiz registered email address
	}
	
	@Test
	public void Verify_SignUp_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		
		LoginPage LP = new LoginPage(driver);
		LP.SignUpBtn();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://vbiz-dev.vfdbank.com/onboarding";
		Assert.assertEquals(ActualURL, ExpectedURL);
		BaseClass.TearDown(driver);
	}
	
	
	
}

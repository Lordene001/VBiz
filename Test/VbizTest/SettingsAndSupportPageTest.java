package VbizTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.SettingsAndSupportPage;

public class SettingsAndSupportPageTest {
	
	@Test
	public void Verify_Add_Company_Btn() throws AWTException, InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		SettingsAndSupportPage SAS = new SettingsAndSupportPage(driver);
		SAS.RegisterCompany();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://vbiz-dev.vfdbank.com/onboarding";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
	}
	
	
	
	@Test
	public void Verify_Update_Registered_Company_Document() throws AWTException, InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		SettingsAndSupportPage SAS = new SettingsAndSupportPage(driver);
		SAS.RegisterCompany();
		SAS.UpdateCompanyDocument1();
		
		Robot RB = new Robot();
		StringSelection SS = new StringSelection("C:\\Users\\bglag\\Desktop\\Doc1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_V);
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(500);
		SAS.UpdateCompanyDocument2();
		BaseClass.TearDown(driver);
	}
	
	
	
	@Test
	public void Verify_Change_Password() throws AWTException, InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		SettingsAndSupportPage SAS = new SettingsAndSupportPage(driver);
		SAS.RegisterCompany();
		SAS.ChangePasswordCurrentPassword("Plate@123");
		SAS.ChangePasswordNewPassword("Middle_001");
		SAS.ChangePasswordNewPasswordAgain("Middle_001");
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Change_Transaction_PIN() throws AWTException, InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		SettingsAndSupportPage SAS = new SettingsAndSupportPage(driver);
		SAS.RegisterCompany();
		SAS.ChangeTransactionPin_EnterPassword("Middle_1234");
		SAS.ChangeTransactionPin_EnterNewPin1("1");
		SAS.ChangeTransactionPin_EnterNewPin2("2");
		SAS.ChangeTransactionPin_EnterNewPin3("3");
		SAS.ChangeTransactionPin_EnterNewPin4("4");
		SAS.ChangeTransactionPin_EnterNewPin1Again("1");
		SAS.ChangeTransactionPin_EnterNewPin1Again("2");
		SAS.ChangeTransactionPin_EnterNewPin1Again("3");
		SAS.ChangeTransactionPin_EnterNewPin1Again("4");
		
		BaseClass.TearDown(driver);
	}
	
	
	// Business Advisory Button is not responsive
	
	
	
	
	
	
	
	
	
}

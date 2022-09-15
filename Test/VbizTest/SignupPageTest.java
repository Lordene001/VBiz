package VbizTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.SignupPage;

public class SignupPageTest {
	
	@Test
	public void Verify_SignUp_With_Corporate_Account()  {
		WebDriver driver = BaseClass.SetUp();
		SignupPage SP = new SignupPage(driver);
		SP.SignUpWithCoperateAccount("1234567890");
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_SignUp_With_Personal_Account()   {
		WebDriver driver = BaseClass.SetUp();
		SignupPage SP = new SignupPage(driver);
		SP.SignUpWithPersonalAccount("1234567890");
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_SignUp_With_Registered_Company() {
		WebDriver driver = BaseClass.SetUp();
		SignupPage SP = new SignupPage(driver);
		SP.SignUpWithRegisteredCompany();
		SP.SignUpWithBVN("12097654380");
		SP.SignUpWithNIN("14256898730");
		SP.SignUpWithDateOfBirth("12/06/1994");
		SP.SignUpWithPhoneNumber("08036876462");
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void Verify_SignUp_Without_Registered_Company()  {
		WebDriver driver = BaseClass.SetUp();
		SignupPage SP = new SignupPage(driver);
		SP.SignUpWithoutRegisteredCompany();
		SP.SignUpWithBVN("12097654381");
		SP.SignUpWithNIN("14256898731");
		SP.SignUpWithDateOfBirth("12/06/1994");
		SP.SignUpWithPhoneNumber("08036876462");
		BaseClass.TearDown(driver);
		
	}
	
	
	
	
}

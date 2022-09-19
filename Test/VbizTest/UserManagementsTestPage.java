package VbizTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.UserManagementsPage;

public class UserManagementsTestPage {

	@Test
	public void Verify_One_Year_Statement_In_Excel() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		UserManagementsPage UM = new UserManagementsPage(driver);
		
		UM.CreateNewUserBVN("12345678923");
		UM.CreateNewUserNIN("23456789076");
		UM.CreateNewUserEmail("abc@gmail.com");
		UM.CreateNewUserPosition("QA Tester");
		
		BaseClass.TearDown(driver);
	}
	
	
}

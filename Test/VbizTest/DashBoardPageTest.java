package VbizTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.DashBoardPage;
import VbizPage.LoginPage;

public class DashBoardPageTest {

	@Test
	public void Verify_Add_Company_Button()   {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		DashBoardPage DP = new DashBoardPage(driver);
		DP.AddCompanyBtn();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://vbiz-dev.vfdbank.com/onboarding";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Make_Transfer_Button()   {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		DashBoardPage DP = new DashBoardPage(driver);
		DP.MakeTransferBtn();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://vbiz-dev.vfdbank.com/transfers";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Recent_Transaction_View_More_Button()   {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		DashBoardPage DP = new DashBoardPage(driver);
		DP.RecentTransactionViewMoreBtn();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://vbiz-dev.vfdbank.com/payments";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void View_Inflow_Outflow_Value_By_Month_Or_Year()    {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		driver.findElement(By.xpath("(//button[@class='sc-gubKfm dPkLWU'])[1]")).click();
		List<WebElement> Duration1 = driver.findElements(By.tagName("p"));
		for(int i=0;i<Duration1.size();i++) {
			if(Duration1.get(i).getText().contains("Year")) {
				Duration1.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//button[@class='sc-gubKfm dPkLWU'])[2]")).click();
		List<WebElement> Duration2 = driver.findElements(By.tagName("p"));
		for(int i=0;i<Duration2.size();i++) {
			if(Duration2.get(i).getText().contains("2020")) {
				Duration2.get(i).click();
				break;
			}
		}
		
		BaseClass.TearDown(driver);
	}
	
	
	
	
}

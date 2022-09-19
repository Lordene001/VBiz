package VbizTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.Analytic_ReportPage;
import VbizPage.MakePayment;

public class Analytics_ReportPageTest {

	@Test
	public void Verify_Transaction_Details_Next_Previous_And_Download() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		Analytic_ReportPage AR = new Analytic_ReportPage(driver);
		AR.TransactionDetails1();
		
		Thread.sleep(3000);
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,7000)");
		
		AR.TransactionDetails2();
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Three_Months_Statement_In_PDF() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		Analytic_ReportPage AR = new Analytic_ReportPage(driver);
		AR.RequestPdfStatement();
		
		BaseClass.TearDown(driver);
	}
	
	@Test
	public void Verify_One_Year_Statement_In_Excel() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		Analytic_ReportPage AR = new Analytic_ReportPage(driver);
		AR.RequestExcelStatement();
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Verify_Statement_With_Customized_Date() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		Analytic_ReportPage AR = new Analytic_ReportPage(driver);
		AR.RequestStatementWithCustomizedDate1("January 10, 2022");
		AR.RequestStatementWithCustomizedDate2("September 20, 2022");
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public  void Verify_Individual_Payment_Transaction_Report_By_Year() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		Analytic_ReportPage AR = new Analytic_ReportPage(driver);
		AR.IndividualPaymentTransactions();
		
		driver.findElement(By.cssSelector(".sc-gubKfm")).click();
		List<WebElement> Year = driver.findElements(By.tagName("p"));
		for(int i=0;i<Year.size();i++) {
			if(Year.get(i).getText().contains("2021")) {
				Year.get(i).click();
				break;
			}
		}
		
		BaseClass.TearDown(driver);
	}
	
	
	
	@Test
	public  void Verify_Bulk_Payment_Transaction_Report_By_Year() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		Analytic_ReportPage AR = new Analytic_ReportPage(driver);
		AR.BulkPaymentTransactions();
		
		driver.findElement(By.cssSelector(".sc-gubKfm")).click();
		List<WebElement> Year = driver.findElements(By.tagName("p"));
		for(int i=0;i<Year.size();i++) {
			if(Year.get(i).getText().contains("2021")) {
				Year.get(i).click();
				break;
			}
		}
		
		BaseClass.TearDown(driver);
	}
	
	
}

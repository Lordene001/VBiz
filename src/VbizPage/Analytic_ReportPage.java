package VbizPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Analytic_ReportPage {

	WebDriver driver;
	
	@FindBy(xpath="(//div/span[text()='Analytics & Reports'])")
	WebElement AnalyticsAndReportBtn;
	
	@FindBy(xpath="//button[normalize-space()='Transaction Details']")
	WebElement TransactionDetailsBtn;
	
	@FindBy(xpath="(//ul/li[text()='Next'])")
	WebElement TransactionDetailsNextBtn;
	
	@FindBy(xpath="(//ul/li[text()='Previous'])")
	WebElement TransactionDetailsPreviousBtn;
	
	@FindBy(xpath="//button[normalize-space()='Download']")
	WebElement TransactionDetailsDownloadBtn;
	
	@FindBy(xpath="//button[normalize-space()='Request account statement']")
	WebElement RequestAccountStatementBtn;
	
	@FindBy(xpath="//input[@class='sc-irOQnY bhfAri']")
	WebElement LinkedAccount1;
	
	@FindBy(xpath="//div[@class='sc-eJBYSJ ikUgzk']")
	WebElement LinkedAccount2;
	
	@FindBy(xpath="(//div/label[text()='3 Months'])")
	WebElement ThreeMonth;
	
	@FindBy(xpath="(//div/label[text()='1 Year'])")
	WebElement OneYear;
	
	@FindBy(xpath="//label[normalize-space()='Custom']")
	WebElement CustomizeDate;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement StartDate;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement EndDate;
	
	@FindBy(xpath="(//div/label[text()='PDF'])")
	WebElement PdfBtn;
	
	@FindBy(xpath="(//div/label[text()='Excel'])")
	WebElement ExcelBtn;
	
	@FindBy(xpath="(//div/button[text()='Request statement'])")
	WebElement RequestStatementBtn;
	
	@FindBy(xpath="//span[normalize-space()='Transaction Report']")
	WebElement TransactionReportBtn;
	
	@FindBy(xpath="//span[contains(text(),'Individual payment')]")
	WebElement IndividualPaymentBtn;
	
	@FindBy(xpath="//span[contains(text(),'Bulk payment')]")
	WebElement BulkPaymentBtn;
	
	
	
	public Analytic_ReportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void TransactionDetails1()  {
		AnalyticsAndReportBtn.click();
		TransactionDetailsBtn.click();	
	}
	
	public void TransactionDetails2()  {
		TransactionDetailsNextBtn.click();
		TransactionDetailsPreviousBtn.click();
		TransactionDetailsDownloadBtn.click();
		
	}
	
	
	public void RequestPdfStatement() {
		AnalyticsAndReportBtn.click();
		RequestAccountStatementBtn.click();
		LinkedAccount1.click();
		LinkedAccount2.click();
		ThreeMonth.click();
		PdfBtn.click();
		RequestStatementBtn.click();
		
	}
	
	
	public void RequestExcelStatement() {
		AnalyticsAndReportBtn.click();
		RequestAccountStatementBtn.click();
		LinkedAccount1.click();
		LinkedAccount2.click();
		OneYear.click();
		ExcelBtn.click();
		RequestStatementBtn.click();
	}
	
	public void RequestStatementWithCustomizedDate1(String startDate) {
		AnalyticsAndReportBtn.click();
		RequestAccountStatementBtn.click();
		LinkedAccount1.click();
		LinkedAccount2.click();
		CustomizeDate.click();
		StartDate.sendKeys(startDate);
		
	}
	
	public void RequestStatementWithCustomizedDate2(String endDate) {
		ExcelBtn.click();
		RequestStatementBtn.click();
		EndDate.sendKeys(endDate);
	}
	
	
	public void IndividualPaymentTransactions() {
		AnalyticsAndReportBtn.click();
		TransactionReportBtn.click();
		IndividualPaymentBtn.click();
		
	}
	
	
	public void BulkPaymentTransactions() {
		AnalyticsAndReportBtn.click();
		TransactionReportBtn.click();
		BulkPaymentBtn.click();
		
	}


	
}

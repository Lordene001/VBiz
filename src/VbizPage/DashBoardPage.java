package VbizPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Add company']")
	WebElement AddCompanyBtn; 
	
	@FindBy(xpath="//span[normalize-space()='Make a transfer']")
	WebElement MakeTransferBtn; 
	
	@FindBy(xpath="//a[normalize-space()='View More']")
	WebElement RecentTransactionViewMoreBtn; 
	
	
	
	
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void AddCompanyBtn() {
		AddCompanyBtn.click();
	}
	
	public void MakeTransferBtn() {
		MakeTransferBtn.click();
	}
	
	public void RecentTransactionViewMoreBtn() {
		RecentTransactionViewMoreBtn.click();
	}
	
	
	
	
}

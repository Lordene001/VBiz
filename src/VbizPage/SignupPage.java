package VbizPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	WebDriver driver;
	
	@FindBy(xpath="(//div/div[text()='Sign up'])")
	WebElement SignUpPageBtn;
	
	@FindBy(xpath="(//article/span[text()='I have a Corporate V Bank Account'])")
	WebElement WithCorporateVbankAccount;
	
	@FindBy(xpath="//span[normalize-space()='I have a Personal V Bank Account']")
	WebElement WithPersonalVbankAccount;
	
	@FindBy(xpath="(//span[normalize-space()=\"I don't Have a V Bank Account\"])[1]")
	WebElement WithoutVbankAccount;
	
	@FindBy(xpath="//input[@type='currency']")
	WebElement AccountNumberField;
	
	@FindBy(xpath="//button[normalize-space()='Proceed']") 
	WebElement ProceedBtn;
	
	@FindBy(xpath="//span[normalize-space()='I have a registered company']")
	WebElement WithRegisteredCompany;
	
	@FindBy(xpath="//span[normalize-space()='I would like to register a company']")
	WebElement WithoutRegisteredCompany;
	
	@FindBy(xpath="(//input[@type='currency'])[1]")
	WebElement BVN;
	
	@FindBy(xpath="(//input[@type='currency'])[2]")
	WebElement NIN;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement DateOfBirth;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement PhoneNumber; 
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement ContinueBtn; 
	
	
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void SignUpWithCoperateAccount(String AccountNumber)  {
		SignUpPageBtn.click();
		WithCorporateVbankAccount.click();
		AccountNumberField.sendKeys(AccountNumber);
		ProceedBtn.click();
	}
	
	public void SignUpWithPersonalAccount(String AccountNumber)  {
		SignUpPageBtn.click();
		WithPersonalVbankAccount.click();
		AccountNumberField.sendKeys(AccountNumber);
		ContinueBtn.click();
	}
	
	public void SignUpWithRegisteredCompany() {
		SignUpPageBtn.click();
		WithoutVbankAccount.click();
		WithRegisteredCompany.click();
	}
	
	public void SignUpWithoutRegisteredCompany() {
		SignUpPageBtn.click();
		WithoutVbankAccount.click();
		WithoutRegisteredCompany.click();
		
	}
	
	public void SignUpWithBVN(String bvn) {
		BVN.sendKeys(bvn);
	}
	
	public void SignUpWithNIN(String nin) {
		NIN.sendKeys(nin);
	}
	
	public void SignUpWithDateOfBirth(String DOB) {
		DateOfBirth.sendKeys(DOB);
	}
	
	public void SignUpWithPhoneNumber(String phoneNumber) {
		PhoneNumber.sendKeys(phoneNumber);
		ContinueBtn.click();
	}
	
	
	
	
	
	

	
	
	
}

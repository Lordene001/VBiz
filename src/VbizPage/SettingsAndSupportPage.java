package VbizPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsAndSupportPage {

	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Setting & Support']")
	WebElement SettingsAndSupportBtn;
	
	@FindBy(xpath="//div[normalize-space()='Register a new company']")
	WebElement RegisterCompanyBtn;
	
	@FindBy(xpath="(//button[@class='sc-iwyYcG dmnvNE'])[1]")
	WebElement ARegisteredCompanyBtn;
	
	@FindBy(xpath="(//div/div/span[text()='Update'])[1]")
	WebElement UpdateDocumenmentBtn;
	
	@FindBy(css=".sc-XhUPp.kiNLFp")
	WebElement SelectDocumentBtn;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement AddSelectedDocumenmentBtn;
	
	@FindBy(xpath="//div[contains(text(),'Change password')]")
	WebElement ChangePasswordBtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement CurrentPassword;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement ContinueBtn;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement NewPassword;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement NewPasswordAgain;
	
	@FindBy(xpath="//div[contains(text(),'Change transaction pin')]")
	WebElement ChangeTransactionPinBtn;
	
	@FindBy(xpath="(//div/span[text()='Reset Tansaction PIN'])")
	WebElement ResetTransactionPinBtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement EnterYourPassword;
	
	@FindBy(xpath="(//input[@placeholder='0'])[1]")
	WebElement EnterNewPin1;
	
	@FindBy(xpath="(//input[@placeholder='0'])[2]")
	WebElement EnterNewPin2;
	
	@FindBy(xpath="(//input[@placeholder='0'])[3]")
	WebElement EnterNewPin3;
	
	@FindBy(xpath="(//input[@placeholder='0'])[4]")
	WebElement EnterNewPin4;
	
	@FindBy(xpath="(//input[@placeholder='0'])[5]")
	WebElement EnterNewPin1Again;
	
	@FindBy(xpath="(//input[@placeholder='0'])[6]")
	WebElement EnterNewPin2Again;
	
	@FindBy(xpath="(//input[@placeholder='0'])[7]")
	WebElement EnterNewPin3Again;
	
	@FindBy(xpath="(//input[@placeholder='0'])[8]")
	WebElement EnterNewPin4Again;
	
	@FindBy(xpath="//button[normalize-space()='Reset PIN']")
	WebElement ResetPin;
	
	
	
	
	
	
	
	
	public SettingsAndSupportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void RegisterCompany()  {
		SettingsAndSupportBtn.click();
		RegisterCompanyBtn.click();
	}
	
	
	public void UpdateCompanyDocument1() throws InterruptedException  {
		Thread.sleep(5000);
		SettingsAndSupportBtn.click();
		ARegisteredCompanyBtn.click();
		UpdateDocumenmentBtn.click();
		SelectDocumentBtn.click();
	}
	
	
	public void UpdateCompanyDocument2()  {
		AddSelectedDocumenmentBtn.click();
	}
	
	
	public void ChangePasswordCurrentPassword(String currentPassword) throws InterruptedException  {
		Thread.sleep(5000);
		SettingsAndSupportBtn.click();
		ChangePasswordBtn.click();
		CurrentPassword.sendKeys(currentPassword);
		ContinueBtn.click();
	}
	
	
	public void ChangePasswordNewPassword(String newPassword)  {
		NewPassword.sendKeys(newPassword);
	}
	
	public void ChangePasswordNewPasswordAgain(String newPasswordAgain)  {
		NewPasswordAgain.sendKeys(newPasswordAgain);
		ContinueBtn.click();
	}
	
	public void ChangeTransactionPin_EnterPassword(String YourPassword) throws InterruptedException  {
		Thread.sleep(5000);
		SettingsAndSupportBtn.click();
		ChangeTransactionPinBtn.click();
		ResetTransactionPinBtn.click();
		EnterYourPassword.sendKeys(YourPassword);
		
	}
	
	public void ChangeTransactionPin_EnterNewPin1(String pin)   {
		EnterNewPin1.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin2(String pin)   {
		EnterNewPin2.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin3(String pin)   {
		EnterNewPin3.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin4(String pin)   {
		EnterNewPin4.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin1Again(String pin)   {
		EnterNewPin1Again.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin2Again(String pin)   {
		EnterNewPin2Again.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin3Again(String pin)   {
		EnterNewPin3Again.sendKeys(pin);
	}
	
	public void ChangeTransactionPin_EnterNewPin4Again(String pin)   {
		EnterNewPin4Again.sendKeys(pin);
		ResetPin.click();
	}
	
	
	
}

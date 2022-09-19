package VbizPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakePayment {

WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Make a Payment']")
	WebElement MakePaymentBtn;
	
	@FindBy(xpath="//div[contains(text(),'Transfer to own accounts')]")
	WebElement TransferToOwnAccountBtn;
	
	@FindBy(xpath="//div[contains(text(),'Transfer to other accounts')]")
	WebElement TransferToOtherAccountBtn;
	
	@FindBy(xpath="//div[contains(text(),'Beneficiaries managment')]")
	WebElement BeneficiariesManagementBtn;
	
	@FindBy(xpath="//div[contains(text(),'Payment Approvals')]")
	WebElement PaymentApprovalBtn;
	
	@FindBy(xpath="//span[contains(text(),'Add New Beneficiary')]")
	WebElement AddNewBenefiaryBtn;
	
	@FindBy(xpath="(//*[name()='svg'])[18]")
	WebElement DeleteNewBenefiaryBtn; 		
			
	@FindBy(xpath="(//div[@class='sc-iuGMqu dhSref'])[1]")
	WebElement SendersAcct1;
	
	@FindBy(xpath="(//div[@class='sc-fFYUoA iFyAmo'])[1]")
	WebElement SendersAcct2;
	
	@FindBy(xpath="(//input)[6]")
	WebElement DestinationAccount;
	
	@FindBy(xpath="(//input[@type='currency'])[1]")
	WebElement Amount;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement PaymentComment;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Make a transfer'])[2]")
	WebElement MakeTransferBtn;
	
	@FindBy(xpath="//div[contains(text(),'Transfer to other accounts')]")
	WebElement MakeTransferToOtherAcctBtn;
	
	@FindBy(xpath="//div/span[contains(text(),'Upload File')]")
	WebElement UploadFileBtn;
	
	@FindBy(xpath="//div[@class='sc-fybufo cEOTJe']//span[@class='sc-XhUPp kiNLFp'][normalize-space()='Select']")
	WebElement SelectFileToUpload;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add'])[3]")
	WebElement AddFileBtn;
	
	@FindBy(xpath="//div/span[contains(text(),'Saved Beneficiaries')]")
	WebElement SaveBeneficiariesBtn;
	
	@FindBy(xpath="//button[3]")
	WebElement AddNewBeneficiariesBtn;
	
	@FindBy(xpath="//div[@class='sc-iuGMqu dhSref']")
	WebElement BeneficiaryDestinationBank;
	
	@FindBy(xpath="(//input[@type='currency'])[2]")
	WebElement BeneficiaryAccount;
	
	@FindBy(xpath="(//input[@type='currency'])[3]")
	WebElement BeneficiaryAmount;
	
	@FindBy(xpath="(//div[@class='sc-gzpPaa iXFuHF'])[2]")
	WebElement BeneficiaryType;
	
	@FindBy(xpath="(//span[@class='sc-iktFzd jSTaBT'][normalize-space()='Add new type'])[2]")
	WebElement AddNewBeneficiaryType;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement EnterBeneficiaryType;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add new beneficiary type'])[2]")
	WebElement SaveBeneficiaryType;
	
	@FindBy(xpath="//button[normalize-space()='Add new beneficiary']")
	WebElement SubmitNewBeneficiaryBtn;
	
	@FindBy(xpath="(//div[@class='sc-hlTvYk bNzyQB'])[5]")
	WebElement SelectBeneficiaryForDelete;
	
	@FindBy(xpath="(//*[name()='svg'])[20]")
	WebElement BeneficiaryDeleteBtn;
	
	@FindBy(xpath="(//td[@class='sc-gOjUcv fvNLbd'])[1]")
	WebElement SelectBeneficiaryForEdit;
	
	@FindBy(xpath="//button[normalize-space()='Save changes']")
	WebElement SaveEditChanges;
	
	@FindBy(xpath="//span[normalize-space()='Transaction Details']")
	WebElement ViewMsg;
	
	@FindBy(xpath="(//span[contains(text(),'View')])[1]")
	WebElement View;
	
	@FindBy(xpath="//button[normalize-space()='Download Reciept']")
	WebElement DownloadReceiptButton;
	
	
	
	
	
	public MakePayment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void MakeTransferToOwnAcct1(String DestinationAcct) {
		MakePaymentBtn.click();
		TransferToOwnAccountBtn.click();
		SendersAcct1.click();
		SendersAcct2.click();
		DestinationAccount.sendKeys(DestinationAcct);
	}
	
	public void MakeTransferToOwnAcct2(String amount) {
		Amount.sendKeys(amount);
	}
	
	public void MakeTransferToOwnAcct3(String comment) {
		PaymentComment.sendKeys(comment);
		MakeTransferBtn.click();
	}
	
	public void AddAndDeleteNewBeneficiary()  {
		MakePaymentBtn.click();
		TransferToOwnAccountBtn.click();
		AddNewBenefiaryBtn.click();
		DeleteNewBenefiaryBtn.click();
	}
	
	public void UploadPaymentFile1() throws InterruptedException  {
		MakePaymentBtn.click();
		MakeTransferToOtherAcctBtn.click();
		UploadFileBtn.click();
		Thread.sleep(1000);
		SelectFileToUpload.click();
		
	}
	
	public void UploadPaymentFile2()  {
		AddFileBtn.click();
	}
	
	public void AddEditDeleteNewBeneficiary1() throws InterruptedException  {
		MakePaymentBtn.click();
		MakeTransferToOtherAcctBtn.click();
		SaveBeneficiariesBtn.click();
		Thread.sleep(5000);
		AddNewBeneficiariesBtn.click();
		Thread.sleep(500);
		BeneficiaryDestinationBank.click();
	}
	
	public void AddEditDeleteNewBeneficiary2(String AccountNumber)   {
		BeneficiaryAccount.sendKeys(AccountNumber);
	}
	
	public void AddEditDeleteNewBeneficiary3(String Amount)   {
		BeneficiaryAmount.sendKeys(Amount);
		BeneficiaryType.click();
		AddNewBeneficiaryType.click();
	}
	
	public void AddEditDeleteNewBeneficiary4(String BeneficiaryTypeValue) throws InterruptedException   {
		EnterBeneficiaryType.sendKeys(BeneficiaryTypeValue);
		SaveBeneficiaryType.click();
		Thread.sleep(5000);
		SubmitNewBeneficiaryBtn.click();
		Thread.sleep(3000);
	}
	
	public void AddEditDeleteNewBeneficiary5() throws InterruptedException   {
		SelectBeneficiaryForEdit.click();
		Thread.sleep(3000);
		SaveEditChanges.click();
	}
	
	public void AddEditDeleteNewBeneficiary6() throws InterruptedException   {
		SelectBeneficiaryForDelete.click();
		Thread.sleep(2000);
		BeneficiaryDeleteBtn.click();
	}
	
	public String ViewTransactionDetailsAndDownloadReceipt1() throws InterruptedException    {
		MakePaymentBtn.click();
		PaymentApprovalBtn.click();
		Thread.sleep(1000);
		View.click();
		return ViewMsg.getText();
	}
	
	public void ViewTransactionDetailsAndDownloadReceipt2()    {
		DownloadReceiptButton.click();
	}
	
	
}

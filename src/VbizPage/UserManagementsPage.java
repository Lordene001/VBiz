package VbizPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementsPage {

	WebDriver driver;
	
	
	@FindBy(xpath="(//div/span[contains(text(),'User Managements')])")
	WebElement UserManagementsBtn;
	
	@FindBy(xpath="//button[normalize-space()='Create a new user']")
	WebElement CreateNewUserBtn;
	
	@FindBy(xpath="(//input[@type='currency'])[1]")
	WebElement BVN;
	
	@FindBy(xpath="(//input[@type='currency'])[2]")
	WebElement NIN;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement Email;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement Position;
	
	@FindBy(xpath="//label[normalize-space()='Viewer']")
	WebElement Viewer;
	
	@FindBy(xpath="//label[normalize-space()='Active']")
	WebElement Status;
	
	@FindBy(xpath="//button[normalize-space()='Create new user']")
	WebElement CreateUser;
	
	
	public UserManagementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void CreateNewUserBVN(String bvn)  {
		UserManagementsBtn.click();
		CreateNewUserBtn.click();
		BVN.sendKeys(bvn);	
	}
	
	public void CreateNewUserNIN(String nin)  {
		NIN.sendKeys(nin);	
	}
	
	public void CreateNewUserEmail(String email)  {
		Email.sendKeys(email);	
	}
	
	public void CreateNewUserPosition(String position)  {
		Position.sendKeys(position);	
		Viewer.click();
		Status.click();
		CreateUser.click();
	}
	
	
	
	
}

	

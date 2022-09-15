package VbizPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="(//div/div[text()='Log in'])")
	WebElement LoginPageBtn;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class='Toastify']")
	WebElement LoginSuccessMessage;
	
	@FindBy(xpath="(//span[@class='sc-iktFzd RMOti'][normalize-space()='Log out'])[2]")
	WebElement LogOutBtn1;
	
	@FindBy(xpath="(//button[@type='button'][normalize-space()='Log out'])[2]")
	WebElement LogOutBtn2;
	
	@FindBy(xpath="(//div/span[text()='What will you like to do:'])[1]") 
	WebElement LogOutMessage;
	
	@FindBy(xpath="(//div/span[text()='Fill in all required information below to log in.'])[1]") 
	WebElement InvalidLoginMessage;
	
	@FindBy(xpath="(//div/span[text()='Forgot Password?'])") 
	WebElement ForgetPasswordBtn;
	
	@FindBy(xpath="//button[normalize-space()='Reset password']") 
	WebElement ResetPasswordButton;
	
	@FindBy(xpath="(//div/span[text()='Open an account'])") 
	WebElement SignUpBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void LoginEmail(String email) {
		LoginPageBtn.click();
		Email.sendKeys(email);
	}
	
	public void LoginPassword(String password) throws InterruptedException {
		Password.sendKeys(password);
		Thread.sleep(500);
		LoginBtn.click();
	}
	
	public Boolean LoginMessage() throws InterruptedException {
		return LoginSuccessMessage.isDisplayed();
	}
	
	public boolean LogOut() {
		LogOutBtn1.click();
		LogOutBtn2.click();
		return LogOutMessage.isDisplayed();
	}
	
	public boolean InvalidLoginAlert() {
		return InvalidLoginMessage.isDisplayed(); 
	}
	
	public boolean LoginButton() {
		return LoginBtn.isEnabled();
	}
	
	public void ResetPassword(String email) {
		LoginPageBtn.click();
		ForgetPasswordBtn.click();
		Email.sendKeys(email);
		ResetPasswordButton.click();
	}
	
	public void SignUpBtn() {
		LoginPageBtn.click();
		SignUpBtn.click();
	}
	
	
	
}

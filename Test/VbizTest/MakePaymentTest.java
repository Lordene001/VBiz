package VbizTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import VbizPage.MakePayment;

public class MakePaymentTest {
/*
	@Test
	public void Verify_Own_Account_Add_Delete_Beneficiary()  {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		MakePayment MP = new MakePayment(driver);
		MP.AddAndDeleteNewBeneficiary();
		
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void Verify_Transfer_To_Own_Account()  {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		MakePayment MP = new MakePayment(driver);
		MP.MakeTransferToOwnAcct1("0730914585");
		MP.MakeTransferToOwnAcct2("1000");
		MP.MakeTransferToOwnAcct3("Testing");
		
		BaseClass.TearDown(driver);	
	}
	
	
	@Test
	public void Verify_Other_Account_Upload_Transfer_File() throws AWTException, InterruptedException  {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		MakePayment MP = new MakePayment(driver);
		MP.UploadPaymentFile1();
		
		Robot RB = new Robot();
		StringSelection SS = new StringSelection("C:\\Users\\bglag\\Desktop\\vbiz data.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_V);
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(500);
		MP.UploadPaymentFile2();
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void Verify_View_Transaction_Details_And_Download_Receipt() throws InterruptedException  {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		MakePayment MP = new MakePayment(driver);
		String ActualDetails = MP.ViewTransactionDetailsAndDownloadReceipt1();
		String ExpectedDetails = "Transaction Details";
		Assert.assertEquals(ActualDetails, ExpectedDetails);
		
		MP.ViewTransactionDetailsAndDownloadReceipt2();
		
		BaseClass.TearDown(driver);
		
	}
	*/
	
	
	@Test
	public void Verify_Other_Account_Add_Edit_And_Delete_Beneficiary() throws InterruptedException  {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Login(driver);
		
		MakePayment MP = new MakePayment(driver);
		MP.AddEditDeleteNewBeneficiary1();
		
		List<WebElement> BankName = driver
				.findElements(By.className("sc-eJBYSJ"));
		for (int i = 0; i < BankName.size(); i++) {
			if (BankName.get(i).getText().contains("Access Bank")) {
				BankName.get(i).click();
				break;
			}
		}
		
		MP.AddEditDeleteNewBeneficiary2("0730914585");
		MP.AddEditDeleteNewBeneficiary3("5000");
		MP.AddEditDeleteNewBeneficiary4("Trial");
		MP.AddEditDeleteNewBeneficiary5();
		MP.AddEditDeleteNewBeneficiary6();
		
		BaseClass.TearDown(driver);
	}
	
	
	
	
	
	
	
	
	
	
}

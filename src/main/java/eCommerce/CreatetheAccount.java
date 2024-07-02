package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class CreatetheAccount extends Base1{
	
	// Constructor Method
			public CreatetheAccount(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
			WebElement Account;
			@FindBy(xpath="//a[normalize-space()='Create Account']")
			WebElement CreateAccount;
			@FindBy(xpath="//input[@id='firstName']")
			WebElement FirstName;
			@FindBy(xpath="//input[@id='lastName']")
			WebElement LasttName;
			@FindBy(xpath="//input[@id='email']")
			WebElement email;
			@FindBy(xpath="//input[@id='fld-p1']")
			WebElement Password;
			@FindBy(xpath="//input[@id='reenterPassword']")
			WebElement ConfirmPassword;
			@FindBy(xpath="//input[@id='phone']")
			WebElement Mobile;
			@FindBy(xpath="//input[@id='is-recovery-phone']")
			WebElement MRecovery;
			@FindBy(xpath="//button[normalize-space()='Create an Account']")
			WebElement CreateAccountOption;
			
			
			public void Account() throws Exception
			{
				// Select the US Country
				Select.click();
				// Select the Account option
				Thread.sleep(1000);
				Account.click();
				// Click the Account option
				Thread.sleep(1000);
				CreateAccount.click();
			}
			
			public void AccountDetails(String FName, String LName, String email1, String Psd,String cpsd, String MB) {
				
			 // Input the First Name
			    FirstName.sendKeys(FName);
			 // Input the Last Name
			    LasttName.sendKeys(LName);
			 // Input the emailID
			    email.sendKeys(email1);
			 // Input the Password
			    Password.sendKeys(Psd);
			 // Input the Confirm  Password
			    ConfirmPassword.sendKeys(cpsd);
			 // Input the Mobile Number
			    Mobile.sendKeys(MB);
			 // Click the Recovery Mobile Number 
			    MRecovery.click();
			// Click the Create Account Option
			   CreateAccountOption.click(); 
			}
				
			
}

package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class SignIn extends Base1{
	
	// Constructor Method
			public SignIn(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//a[normalize-space()='Sign In']")
			WebElement SignInOp;
			@FindBy(xpath="//input[@id='fld-e']")
			WebElement EmailID;
			@FindBy(xpath="//input[@id='fld-p1']")
			WebElement Password;
			@FindBy(xpath="//button[normalize-space()='Sign In']")
			WebElement SignIN;
			@FindBy(xpath="//button[normalize-space()='Skip for now']")
			WebElement Skip;
			
			
			public void SignInDetails(String Email, String Psd){
				
				// Select the US Country
				Select.click();
				// Click the Sign-In option
				SignInOp.click();
				// Enter the Valid email ID
				EmailID.sendKeys(Email);
				Password.sendKeys(Psd);
				SignIN.click();
				
			}
			

}

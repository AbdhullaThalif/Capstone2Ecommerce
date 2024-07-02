package eCommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base1;

public class CheckoutpageAndPaymentdetails extends Base1{
	
	// Constructor Method
			public CheckoutpageAndPaymentdetails(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//input[@id='gh-search-input']")
			WebElement SearchInput;
			@FindBy(xpath="//span[@class='header-search-icon']//*[name()='svg']")
			WebElement Search;
			@FindBy(xpath="//a[normalize-space()='Apple - iPhone 14 128GB (Unlocked) - Midnight']")
			WebElement Product;
			@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button ']")
			WebElement AddToCart;
			@FindBy(xpath="//a[normalize-space()='Go to Cart']")
			WebElement cart;
			@FindBy(xpath="//button[normalize-space()='Checkout']")
			WebElement Checkout;
			@FindBy(xpath="//span[normalize-space()='Continue to Payment Information']")
			WebElement ContinuetoPaymentInfo;
			@FindBy(xpath="//input[@id='fld-e']")
			WebElement Emailid;
			@FindBy(xpath="//input[@id='fld-p1']")
			WebElement PSD;
			@FindBy(xpath="//button[normalize-space()='Sign In']")
			WebElement SignIn;
			@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
			WebElement Continue;
			@FindBy(xpath="//input[@id='number']")
			WebElement Cardnumber;
			@FindBy(xpath="//input[@id='first-name']")
			WebElement FirstName;
			@FindBy(xpath="//input[@id='first-name']")
			WebElement LastName;
			@FindBy(xpath="//input[@id='address-input']")
			WebElement Address;
			@FindBy(xpath="//input[@id='city']")
			WebElement City;
			@FindBy(xpath="//select[@id='state']")
			WebElement State;
			@FindBy(xpath="//input[@id='postalCode']")
			WebElement Zipcode;
			
			
			public void SearchTheItem(String item) {
				// Select the US Country
				Select.click();
				// Click and input the Search valuse
				SearchInput.sendKeys(item);
				// Click Search
				Search.click();
				
				}
			
			public void AddTheProduct() throws Exception{
				Thread.sleep(1000);
				Product.click();
				Thread.sleep(1000);
				//JavascriptExecutor executor = (JavascriptExecutor) driver;
				//executor.executeScript("window.scrollBy(0,2000)", "");
         	   // executor.executeScript("arguments[0].click();", AddToCart);
         	    Thread.sleep(10000);
         	    cart.click();
			}

			
			public void SignINDetais(String email, String PSW){
				
				// Click the Checkout option
				Checkout.click();
				// Click and input the email ID
				Emailid.sendKeys(email);
				// Click and input the Password
				PSD.sendKeys(PSW);
				// Click SignIn option
				SignIn.click();
				// Click continue option
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
         	    ContinuetoPaymentInfo.click();

}
			
			public void CartandPaymentInfo(String num, String FName, String LName, String Add, String Ct, String zip ) {
				
				// Click and input the Card number
				Cardnumber.sendKeys(num);
				// Click and input the First Name
				FirstName.sendKeys(FName);
				// Click and input the Last Name
				LastName.sendKeys(LName);
				// Click and input the Address
				Address.sendKeys(Add);
				// Click and input the City
				City.sendKeys(Ct);
				// Click and select the NY value
				Select Obj1 = new Select(State);
				Obj1.selectByValue("NY");
				// Click and input the Zipcode
				Zipcode.sendKeys(zip);
				
			}
			
			 public void  Confirmation(){
                 
 				// Convert the element values to string
 				String a = driver.getTitle();
 				// Print the string value
 				System.out.println(a);
 				// Verify the button in homepage or not
 				if (a.equalsIgnoreCase("Accessibility")) {
					System.out.println("In Order Confirmation Page");
				}
				else {
					System.out.println("Not In Order Confirmation Page");
			}

 				}
			
}
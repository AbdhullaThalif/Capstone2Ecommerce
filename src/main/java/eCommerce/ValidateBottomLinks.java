package eCommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class ValidateBottomLinks extends Base1{
	
	// Constructor Method
			public ValidateBottomLinks(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//a[normalize-space()='Accessibility']")
			WebElement Accessibility;
			@FindBy(xpath="//a[normalize-space()='Terms & Conditions']")
			WebElement TermsAndConditions;
			@FindBy(xpath="//a[normalize-space()='Privacy']")
			WebElement Privacy;
			@FindBy(xpath="//a[normalize-space()='Interest-Based Ads']")
			WebElement InterestBasedAds;
			@FindBy(xpath="//a[normalize-space()='State Privacy Rights']")
			WebElement StatePrivacyRights;
			@FindBy(xpath="//a[normalize-space()='Health Data Privacy']")
			WebElement HealthDataPrivacy;
			@FindBy(xpath="//a[normalize-space()='Do Not Sell/Share My Personal Information']")
			WebElement DoNotSell;
			@FindBy(xpath="//a[normalize-space()='Limit Use of My Sensitive Personal Information']")
			WebElement Limit;
			@FindBy(xpath="//a[normalize-space()='Targeted Advertising Opt Out']")
			WebElement Targeted;
			@FindBy(xpath="//a[normalize-space()='CA Supply Chain Transparency Act']")
			WebElement CASupplyChain;
			
			
			
              public void  SelectUSCountry(){
                
				// Select the US Country
				Select.click();
				// Scroll down in until end page
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				}
              
              
              public void  Accessibility(){
                  
    				// Convert the element values to string
    				String a = Accessibility.getText();
    				// Print the string value
    				System.out.println(a);
    				// Verify the button in homepage or not
    				if (a.equalsIgnoreCase("Accessibility")) {
  					System.out.println("Accessibility button in homepage");
  				}
  				else {
  					System.out.println("Accessibility button not in homepage");
  			}

    				}
              
              public void TermsAndConditions(){
                  
            	    // Convert the element values to string
    				String a = TermsAndConditions.getText();
    				// Print the string value
    				System.out.println(a);
    				// Verify the button in homepage or not
    				if (a.equalsIgnoreCase("Terms & Conditions")) {
  					System.out.println("Terms & Conditions button in homepage");
  				}
  				else {
  					System.out.println("Terms & Conditions button not in homepage");
  			}

    				}
                
              public void  Privacy(){
                  
            	// Convert the element values to string
  				String a = Privacy.getText();
  			    // Print the string value
  				System.out.println(a);
  			    // Verify the button in homepage or not
  				if (a.equalsIgnoreCase("Privacy")) {
					System.out.println("Privacy button in homepage");
				}
				else {
					System.out.println("Privacy button not in homepage");
			}

  				}

              public void  InterestBasedAds(){
                  
            	    // Convert the element values to string
    				String a = InterestBasedAds.getText();
    				// Print the string value
    				System.out.println(a);
    				// Verify the button in homepage or not
    				if (a.equalsIgnoreCase("Interest-Based Ads")) {
  					System.out.println("Interest-Based Ads button in homepage");
  				}
  				else {
  					System.out.println("Interest-Based Ads button not in homepage");
  			}

    				}
              
              public void  StatePrivacyRights(){
                  
            	// Convert the element values to string
  				String a = StatePrivacyRights.getText();
  			    // Print the string value
  				System.out.println(a);
  			    // Verify the button in homepage or not
  				if (a.equalsIgnoreCase("State Privacy Rights")) {
					System.out.println("State Privacy Rights button in homepage");
				}
				else {
					System.out.println("State Privacy Rights button not in homepage");
			}

  				}
              
              public void  HealthDataPrivacy(){
                  
            	// Convert the element values to string  
    			String a = HealthDataPrivacy.getText();
    			// Print the string value
    			System.out.println(a);
    			// Verify the button in homepage or not
    			if (a.equalsIgnoreCase("Health Data Privacy")) {
  				System.out.println("Health Data Privacy button in homepage");
  				
  				}
  				else {
  					System.out.println("Health Data Privacy button not in homepage");
  			}

    				}
              
              public void  DoNotSell(){
                  
            	// Convert the element values to string
  				String a = DoNotSell.getText();
  			    // Print the string value
  				System.out.println(a);
  				if (a.equalsIgnoreCase("Do Not Sell/Share My Personal Information")) {
					System.out.println("Do Not Sell/Share My Personal Information button in homepage");
				}
				else {
					System.out.println("Do Not Sell/Share My Personal Information button not in homepage");
			}

  				}
              
              public void  LimitUse(){
                  
    				// Select the US Country
    				String a = Limit.getText();
    				System.out.println(a);
    				if (a.equalsIgnoreCase("Limit Use of My Sensitive Personal Information")) {
  					System.out.println("Limit Use of My Sensitive Personal Information button in homepage");
  				}
  				else {
  					System.out.println("Limit Use of My Sensitive Personal Information button not in homepage");
  			}

    				}
              
              public void  TargetedAdvertising(){
                  
  				// Select the US Country
  				String a = Targeted.getText();
  				System.out.println(a);
  				if (a.equalsIgnoreCase("Targeted Advertising Opt Out")) {
					System.out.println("Targeted Advertising Opt Out button in homepage");
				}
				else {
					System.out.println("Targeted Advertising Opt Out button not in homepage");
			}

  				}
              
              public void  CASupplyChainTransparencyAct(){
                  
    				// Select the US Country
    				String a = CASupplyChain.getText();
    				System.out.println(a);
    				if (a.equalsIgnoreCase("CA Supply Chain Transparency Act")) {
  					System.out.println("CA Supply Chain Transparency Act button in homepage");
  				}
  				else {
  					System.out.println("CA Supply Chain Transparency Act button not in homepage");
  			}

    				}



}

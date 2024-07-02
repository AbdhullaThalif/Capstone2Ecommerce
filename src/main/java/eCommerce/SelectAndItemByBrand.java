package eCommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class SelectAndItemByBrand extends Base1{
	
	// Constructor Method
			public SelectAndItemByBrand(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//button[normalize-space()='Menu']")
			WebElement Menu;
			@FindBy(xpath="//button[normalize-space()='Brands']")
			WebElement Brands;
			@FindBy(xpath="(//a[contains(@class,'')][normalize-space()='Apple'])[1]")
			WebElement Apple;
			@FindBy(xpath="//a[@role='button'][normalize-space()='Mac']")
			WebElement Mac;
			@FindBy(xpath="//a[normalize-space()='MacBook Air']")
			WebElement MacBookAir;
			@FindBy(xpath="(//button[contains(@type,'button')][normalize-space()='Add to Cart'])[1]")
			WebElement Addtocart;
			
			
            public void  Brands(){
				
				Select.click();
				Menu.click();
				Brands.click();
				Apple.click();
				Mac.click();
				MacBookAir.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,300)", "");
         	    executor.executeScript("arguments[0].click();", Addtocart);

				}


}

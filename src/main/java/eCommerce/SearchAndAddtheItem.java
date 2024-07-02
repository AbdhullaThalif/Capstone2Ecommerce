package eCommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class SearchAndAddtheItem extends Base1{
	
	// Constructor Method
			public SearchAndAddtheItem(WebDriver driver) {
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
			
			public void SearchTheItem(String item) {
				Select.click();
				SearchInput.sendKeys(item);
				Search.click();
				
				}
			
			public void AddTheProduct() throws Exception{
				Thread.sleep(2000);
				Product.click();
				Thread.sleep(1000);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,2000)", "");
         	    executor.executeScript("arguments[0].click();", AddToCart);
			}

}

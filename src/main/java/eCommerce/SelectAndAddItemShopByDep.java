package eCommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class SelectAndAddItemShopByDep extends Base1{
	
	// Constructor Method
			public SelectAndAddItemShopByDep(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//button[normalize-space()='Menu']")
			WebElement Menu;
			@FindBy(xpath="//button[normalize-space()='Audio']")
			WebElement Audio;
			@FindBy(xpath="//button[normalize-space()='Headphones']")
			WebElement Headphone;
			@FindBy(xpath="//a[normalize-space()='AirPods']")
			WebElement Airpods;
			@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
			WebElement Addtocart;
			
			public void  Airpods(){
				
				Select.click();
				Menu.click();
				Audio.click();
				Headphone.click();
				Airpods.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,500)", "");
         	    executor.executeScript("arguments[0].click();", Addtocart);

				}

}

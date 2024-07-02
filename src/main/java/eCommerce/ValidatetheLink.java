package eCommerce;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class ValidatetheLink extends Base1{
	
	// Constructor Method
			public ValidatetheLink(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			
			
			public void SelecttheUSCountry()
			{
				Select.click();
			}
			
			public void Site(String url) {
				
				// Confirm the URL is not broken
				String x = driver.getTitle();
				System.out.println(x);
				try {
					HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
					httpConnection.connect();
					int respCode = httpConnection.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " is broken and its responsecode is " + respCode);
					} else {
						System.out.println(url + " is Valid and its responsecode is " + respCode);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
}
}
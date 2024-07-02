package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.CheckoutpageAndPaymentdetails;

public class CheckoutpageAndPaymentdetailsTest extends Base1{
	
	@Test
	public void CheckoutpageAndPaymentdetailsTst() throws Exception {

		CheckoutpageAndPaymentdetails chp = new CheckoutpageAndPaymentdetails(driver);
		// Calling the SignIndetails() Method
		chp.SearchTheItem("Apple 14 New");
		chp.AddTheProduct();
		chp.SignINDetais("testemailgv2000@gmail.com", "Ten+Ten=20");
		chp.CartandPaymentInfo("452118456789", "Arun", "Raj", "AB Flats", "New York", "10001" );
		chp.Confirmation();
		
	
}
}

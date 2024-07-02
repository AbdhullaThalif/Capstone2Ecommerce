package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.ValidatetheLink;

public class ValidatetheLinkTest extends Base1{
	
	@Test
	public void ValidatetheLinkTst() throws Exception {

		ValidatetheLink vl = new ValidatetheLink(driver);
		// Calling the SelecttheUSCountry() Method
		vl.SelecttheUSCountry();
		// Calling the Site() Method
		vl.Site("https://www.bestbuy.com/");
}
}

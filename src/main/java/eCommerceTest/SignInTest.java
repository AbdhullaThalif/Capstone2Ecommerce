package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.SignIn;

public class SignInTest extends Base1{
	
	@Test
	public void SignInTst() throws Exception {

		SignIn sn = new SignIn(driver);
		// Calling the SignIndetails() Method
		sn.SignInDetails("testemailgv2000@gmail.com", "Ten+Ten=20");
		
		
	
}
}
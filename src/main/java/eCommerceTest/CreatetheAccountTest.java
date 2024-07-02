package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.CreatetheAccount;

public class CreatetheAccountTest extends Base1{
	
	@Test
	public void CreatetheAccountTst() throws Exception {

		CreatetheAccount ca = new CreatetheAccount(driver);
		// Calling the Account() Method
		ca.Account();
	    // Calling the AccountDetails() Method
		ca.AccountDetails("Arun", "Raj", "testemailgva2000@gmail.com", "Ten+Ten=20","Ten+Ten=20", "9962019466");
}
}
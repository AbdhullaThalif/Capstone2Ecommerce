package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.SelectAndAddItemShopByDep;

public class SearchAndAddItemShopByDepTest extends Base1{
	
	@Test
	public void SearchAndAddItemShopByDepTst() throws Exception {

		SelectAndAddItemShopByDep sd = new SelectAndAddItemShopByDep(driver);
		// Calling the Deals() Method
		sd.Airpods();

}
}
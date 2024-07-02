package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.SelectAndItemByBrand;

public class SelectAndItemByBrandTest extends Base1{
	
	@Test
	public void SelectAndItemByBrandTst() throws Exception {

		SelectAndItemByBrand sb = new SelectAndItemByBrand(driver);
		// Calling the Deals() Method
		sb.Brands();

}
}
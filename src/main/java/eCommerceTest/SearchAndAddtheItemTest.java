package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.SearchAndAddtheItem;

public class SearchAndAddtheItemTest extends Base1{
	
	@Test
	public void SearchAndAddtheItemTst() throws Exception {

		SearchAndAddtheItem sa = new SearchAndAddtheItem(driver);
		// Calling the Deals() Method
		sa.SearchTheItem("Apple 14 New");
		sa.AddTheProduct();

}
}
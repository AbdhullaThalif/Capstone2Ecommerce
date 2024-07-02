package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.ValidateBottomLinks;

public class ValidateBottomLinksTest extends Base1{
	
	@Test
	public void ValidateBottomLinksTst() throws Exception {

		ValidateBottomLinks vb = new ValidateBottomLinks(driver);
		// Calling the SelecttheUSCountry() Method
		vb.SelectUSCountry();
		vb.Accessibility();
		vb.TermsAndConditions();
		vb.Privacy();
		vb.InterestBasedAds();
		vb.StatePrivacyRights();
		vb.HealthDataPrivacy();
		vb.DoNotSell();
		vb.LimitUse();
		vb.TargetedAdvertising();
		vb.CASupplyChainTransparencyAct();
}
}
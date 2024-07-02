package eCommerceTest;

import org.testng.annotations.Test;

import base.Base1;
import eCommerce.NavigateAllMenu;


public class NavigateAllMenuTest extends Base1{
	
	@Test
	public void NavigateAllMenuTst() throws Exception {

		NavigateAllMenu nam = new NavigateAllMenu(driver);
		// Calling the Deals() Method
		nam.Deals();
		// Calling the SupportAndService() Method
		nam.SupportAndService();
		// Calling the Brands() Method
		nam.Brands();
		// Calling the Appliances() Method
		nam.Appliances();
		// Calling the AllTVAndHomeTheater() Method
		nam.TVAndHomeTheater();
		// Calling the AllComputersAndTablets() Method
		nam.ComputersAndTablets();
		// Calling the CellPhones() Method
		nam.CellPhones();
		// Calling the Audio() Method
		nam.Audio();
		// Calling the VideoGames() Method
		nam.VideoGames();
		// Calling the CamerasAndDrones() Method
		nam.CamerasAndDrones();
		// Calling the HomeANDFurniture() Method
		nam.HomeANDFurniture();
		// Calling the SmartHome() Method
		nam.SmartHome();
		// Calling the CarElectronics() Method
		nam.CarElectronics();
		// Calling the WearableTechnology() Method
		nam.WearableTechnology();
		// Calling the HealthWellnessAndFitness() Method
		nam.HealthWellnessAndFitness();
		// Calling the OutdoorLiving() Method
		nam.OutdoorLiving();
		// Calling the ToysGamesAndCollectibles() Method
		nam.ToysGamesAndCollectibles();
		// Calling the ElectricTransportation() Method
		nam.ElectricTransportation();
		// Calling the NewAndFeatured() Method
		nam.NewAndFeatured();
		
		
	
}

}

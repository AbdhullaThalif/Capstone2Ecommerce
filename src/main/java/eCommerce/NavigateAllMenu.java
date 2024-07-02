package eCommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class NavigateAllMenu extends Base1{
	
	// Constructor Method
			public NavigateAllMenu(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Select;
			@FindBy(xpath="//button[normalize-space()='Menu']")
			WebElement Menu;
			@FindBy(xpath="//button[normalize-space()='Deals']")
			WebElement Deals;
			@FindBy(xpath="//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Top Deals']")
			WebElement TopDeals;
			@FindBy(xpath="//button[normalize-space()='Support & Services']")
			WebElement SupportAndService;
			@FindBy(xpath="//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Visit our Support Center']")
			WebElement Support;
			@FindBy(xpath="//button[normalize-space()='Brands']")
			WebElement Brands;
			@FindBy(xpath="//a[normalize-space()='All Brands']")
			WebElement AllBrands;
			@FindBy(xpath="//button[normalize-space()='Appliances']")
			WebElement Appliances;
			@FindBy(xpath="//a[normalize-space()='All Appliances']")
			WebElement AllAppliances;
			@FindBy(xpath="//button[normalize-space()='TV & Home Theater']")
			WebElement TVAndHomeTheater;
			@FindBy(xpath="//a[normalize-space()='All TV & Home Theater']")
			WebElement AllTVAndHomeTheater;
			@FindBy(xpath="//button[normalize-space()='Computers & Tablets']")
			WebElement ComputersAndTablets;
			@FindBy(xpath="//a[normalize-space()='All Computers & Tablets']")
			WebElement AllComputersAndTablets;
			@FindBy(xpath="//button[normalize-space()='Cell Phones']")
			WebElement CellPhones;
			@FindBy(xpath="//a[normalize-space()='All Cell Phones']")
			WebElement AllCellPhones;
			@FindBy(xpath="//button[normalize-space()='Audio']")
			WebElement Audio;
			@FindBy(xpath="//a[normalize-space()='All Audio']")
			WebElement AllAudio;
			@FindBy(xpath="//button[normalize-space()='Video Games']")
			WebElement VideoGames;
			@FindBy(xpath="//a[normalize-space()='All Video Games']")
			WebElement AllVideoGames;
			@FindBy(xpath="//button[normalize-space()='Cameras, Camcorders & Drones']")
			WebElement CamerasAndDrones;
			@FindBy(xpath="//a[normalize-space()='All Cameras, Camcorders & Drones']")
			WebElement AllCamerasAndDrones;
			@FindBy(xpath="//button[normalize-space()='Home, Furniture & Office']")
			WebElement HomeANDFurniture;
			@FindBy(xpath="//a[normalize-space()='All Home, Furniture & Office']")
			WebElement AllHomeANDFurniture;
			@FindBy(xpath="//button[normalize-space()='Smart Home, Security & Wi-Fi']")
			WebElement SmartHome;
			@FindBy(xpath="//a[normalize-space()='All Smart Home, Security & Wi-Fi']")
			WebElement AllSmartHome;
			@FindBy(xpath="//button[normalize-space()='Car Electronics & GPS']")
			WebElement CarElectronics;
			@FindBy(xpath="//a[normalize-space()='All Car Electronics & GPS']")
			WebElement AllCarElectronics;
			@FindBy(xpath="//button[normalize-space()='Wearable Technology']")
			WebElement WearableTechnology;
			@FindBy(xpath="//a[normalize-space()='All Wearable Technology']")
			WebElement AllWearableTechnology;
			@FindBy(xpath="//button[normalize-space()='Health, Wellness & Fitness']")
			WebElement HealthWellnessAndFitness;
			@FindBy(xpath="//a[normalize-space()='All Health, Wellness & Fitness']")
			WebElement AllHealthWellnessAndFitness;
			@FindBy(xpath="//button[normalize-space()='Outdoor Living']")
			WebElement OutdoorLiving;
			@FindBy(xpath="//a[normalize-space()='All Outdoor Living']")
			WebElement AllOutdoorLiving;
			@FindBy(xpath="//button[normalize-space()='Toys, Games & Collectibles']")
			WebElement ToysGamesAndCollectibles;
			@FindBy(xpath="//a[normalize-space()='All Toys, Games & Collectibles']")
			WebElement AllToysGamesAndCollectibles;
			@FindBy(xpath="//button[normalize-space()='Electric Transportation']")
			WebElement ElectricTransportation;
			@FindBy(xpath="//a[normalize-space()='All Electric Transportation']")
			WebElement AllElectricTransportation;
			@FindBy(xpath="//button[normalize-space()='New & Featured']")
			WebElement NewAndFeatured;
			@FindBy(xpath="//a[normalize-space()='Best Buy Drops']")
			WebElement BestBuyDrops;

			
			public void  Deals(){
                
				// Select the US Country
				Select.click();
				Menu.click();
				Deals.click();
				TopDeals.click();
				String a = driver.getTitle();
				System.out.println(a);

				}

				public void  SupportAndService(){

				Menu.click();
				SupportAndService.click();
				Support.click();
				String b = driver.getTitle();
				System.out.println(b);

				}

				public void  Brands(){

				Menu.click();
				Brands.click();
				AllBrands.click();
				String c = driver.getTitle();
				System.out.println(c);

				}

				public void  Appliances(){

				Menu.click();
				Appliances.click();
				AllAppliances.click();
				String d = driver.getTitle();
				System.out.println(d);

				}

				public void  TVAndHomeTheater(){

				Menu.click();
				TVAndHomeTheater.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", AllTVAndHomeTheater);
				String e = driver.getTitle();
				System.out.println(e);

				}

				public void  ComputersAndTablets(){

				Menu.click();
				ComputersAndTablets.click();
				AllComputersAndTablets.click();
				String f = driver.getTitle();
				System.out.println(f);

				}

				public void  CellPhones(){

				Menu.click();
				CellPhones.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", AllCellPhones);
				String g = driver.getTitle();
				System.out.println(g);

				}

				public void  Audio(){

				Menu.click();
				Audio.click();
				AllAudio.click();
				String h = driver.getTitle();
				System.out.println(h);

				}

				public void  VideoGames(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", VideoGames);
         	    executor.executeScript("arguments[0].click();", AllVideoGames);
				String i = driver.getTitle();
				System.out.println(i);

				}

				public void  CamerasAndDrones(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", CamerasAndDrones);
         	    executor.executeScript("arguments[0].click();", AllCamerasAndDrones);
				String j = driver.getTitle();
				System.out.println(j);

				}

				public void  HomeANDFurniture(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", HomeANDFurniture);
         	    executor.executeScript("arguments[0].click();", AllHomeANDFurniture);
				String k = driver.getTitle();
				System.out.println(k);

				}

				public void  SmartHome(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", SmartHome);
         	    executor.executeScript("arguments[0].click();", AllSmartHome);
				String l = driver.getTitle();
				System.out.println(l);

				}

				public void  CarElectronics(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", CarElectronics);
         	    executor.executeScript("arguments[0].click();", AllCarElectronics);
				String m = driver.getTitle();
				System.out.println(m);

				}

				public void  WearableTechnology(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", WearableTechnology);
         	    executor.executeScript("arguments[0].click();", AllWearableTechnology);
				String n = driver.getTitle();
				System.out.println(n);

				}

				public void  HealthWellnessAndFitness(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", HealthWellnessAndFitness);
         	    executor.executeScript("arguments[0].click();", AllHealthWellnessAndFitness);
				String p = driver.getTitle();
				System.out.println(p);

				}

				public void  OutdoorLiving(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", OutdoorLiving);
         	    executor.executeScript("arguments[0].click();", AllOutdoorLiving);
				String q = driver.getTitle();
				System.out.println(q);

				}

				public void ToysGamesAndCollectibles(){ 

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", ToysGamesAndCollectibles);
         	    executor.executeScript("arguments[0].click();", AllToysGamesAndCollectibles);
				String r = driver.getTitle();
				System.out.println(r);

				}

				public void ElectricTransportation(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", ElectricTransportation);
         	    executor.executeScript("arguments[0].click();", AllElectricTransportation);
				String s = driver.getTitle();
				System.out.println(s);

				}

				public void  NewAndFeatured(){

				Menu.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
         	    executor.executeScript("arguments[0].click();", NewAndFeatured);
         	    executor.executeScript("arguments[0].click();", BestBuyDrops);
				String t = driver.getTitle();
				System.out.println(t);

				}
			
			
			

}

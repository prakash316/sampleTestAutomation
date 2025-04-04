package SampleStepDefination;

import org.testng.annotations.Parameters;

import com.web.base.BaseClass;
import com.web.pageobjects.HouseFloorPlansPage;
import com.web.utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;


public class HouseFloorPlansStepDefinationTest extends BaseClass implements En {
	HouseFloorPlansPage houseFloorPlansPage=new HouseFloorPlansPage();
	
	public void TestFeatures() {	
		
		
		Given("I launch the Browser", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		Given("I Click on House floor plans option link", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});
		
		
	//@Parameters("browser")
	
//	Given("I launch the Browser", (String browser) -> {
//	//public void i_launch_the_browser(String browser) {
//		launchBrowser(browser);
//	//}
//	
//	});
	
//	When("I Click on House floor plans option link", () -> {
//	public void i_clickOnHousefloorPlansOptionLink() throws Throwable {
//		//houseFloorPlansTest.GoToMoreAndNavigateToHouseFloorPlans();
//		houseFloorPlansPage = new HouseFloorPlansPage();
//		String testName = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		Log.startTestCase(testName);
//		Log.info("Mouse hover to the More Option");
//		houseFloorPlansPage.ClickOnLocation();
//		houseFloorPlansPage.ClickOnPopUpClose();
//		houseFloorPlansPage.ClickOnLocation();
//		houseFloorPlansPage.mouseOverToTheMoreOption();
//		houseFloorPlansPage.ValidateFloorPlansandDesigns();
//		Log.info("Actual is meeting Expected");
//		Log.endTestCase(testName);
//		System.out.println();
//	});
//	Given("I Click on House floor plans option link", () -> {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	});
//
//	Given("verify the house Floor plans ulr", () -> {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	});
//
//	Given("I verify Plot Dimensions changes", () -> {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	});
//
//	Given("user should be able to nevigate to the House Floor plans screen", () -> {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	});
//
//	When("I click on the arrow icon", () -> {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	});
//
//	When("User can see the arrow icon", () -> {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	});

	}
}

package com.web.testcases;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.web.base.BaseClass;
import com.web.pageobjects.HouseFloorPlansPage;
import com.web.utility.Log;
import com.web.utility.RetryFailedTests;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;

public class ModuleTest extends BaseClass {

	// Static instance of HouseFloorPlansPage
	private static HouseFloorPlansPage houseFloorPlansPage = null;

	private static SoftAssert softAssert = new SoftAssert();

	// Public method to provide access to the instance
	public static HouseFloorPlansPage getHouseFloorPlansInstance() {
		if (houseFloorPlansPage == null) {
			houseFloorPlansPage = new HouseFloorPlansPage();
		}
		return houseFloorPlansPage;
	}

	@Parameters("browser")
	@BeforeClass(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(String browser) throws InterruptedException {
		launchBrowser(browser);
	}

	@AfterClass(groups = { "Smoke", "Sanity", "Regression" })
	public void tearDown() {
		getDriver().quit();
	}
	
	@AfterStep
	public void afterStepHook(Scenario scenario) throws IOException {
		if(scenario.isFailed()==true) {
			scenario.embed(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
		}
	}

	@Test(groups = { "Smoke", "Sanity", "Regression", "Check" }, retryAnalyzer = RetryFailedTests.class, priority = 1)
	public void GoToMoreAndNavigateToHouseFloorPlans() throws Throwable {
		houseFloorPlansPage = new HouseFloorPlansPage();
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		Log.startTestCase(testName);
		Log.info("Mouse hover to the More Option");
		houseFloorPlansPage.ClickOnLocation();
		houseFloorPlansPage.ClickOnPopUpClose();
		houseFloorPlansPage.ClickOnLocation();
		houseFloorPlansPage.mouseOverToTheMoreOption();
		houseFloorPlansPage.ValidateFloorPlansandDesigns();
		Log.info("Actual is meeting Expected");
		Log.endTestCase(testName);
		System.out.println();

	}
}





















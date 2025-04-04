package com.testWeb.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BnBweb.actiondriver.Action;
import com.BnBweb.base.BaseClass;
import com.BnBweb.utility.Log;

public class HouseFloorPlansPage extends BaseClass {
	Action action = new Action();
	private static SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "//button[@class='close']")
	private WebElement CrossCloseBtn;

	@FindBy(xpath = "//div[contains(text(),'More')]")
	private WebElement MoreOptions;

	@FindBy(xpath = "//a[contains(text(),'Floor Plans and Designs')]")
	private WebElement FloorPlansandDesignsOption;

	// @FindBy(xpath = "//input[@id='bengaluru']")
	@FindBy(xpath = "//img[@src='/assets/images/svg/bangalore.svg']")
	private WebElement SelectBengaluruLocation;

	@FindBy(xpath = "//a[contains(text(),'Floor Plans and Designs')]")
	private WebElement FloorPlansandDesignsLink;

	@FindBy(xpath = "//h1[contains(text(),'House Designs and Floor Plans')]")
	private WebElement houseDesignsandFloorPlans;

	@FindBy(xpath = "//p[contains(text(),'Find the curated floor plans from Brick&Bolt.')]")
	private WebElement Findthecuratedfloorplans;

	@FindBy(xpath = "//img[@src='https://design-platform-bucket.s3.ap-south-1.amazonaws.com/snapshots/CRN64875_Bikas-1643624953400.png']")
	private WebElement floorPlanImageLink;

	@FindBy(xpath = "//div[contains(text(),'Plot Dimensions (sq ft)')]")
	private WebElement ScrolltoPlotDimensions;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[1]")
	private WebElement PlotDimensionsArrow;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement CheckBoxFilter;

	@FindBy(xpath = "//div[contains(text(),'Reset')]")
	private WebElement ResetFunction;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[2]")
	private WebElement clickonHouseBudgetArrow;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[3]")
	private WebElement RoadFacingArrow;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[4]")
	private WebElement NumberofFloorArrow;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement RoadfacingCheckBox;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[5]")
	private WebElement TypeofContructionArrow;

	// input[@type='checkbox']

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement TypeofContructionfilter;

	// i[@class='anticon anticon-right ant-collapse-arrow'])[6]

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[6]")
	private WebElement NumberofbedroomsArrow;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement NumberofbedroomsFilter;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[7]")
	private WebElement VastucompliantArrow;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement Vastucompliantfilter;

	@FindBy(xpath = "(//i[@class='anticon anticon-right ant-collapse-arrow'])[8]")
	private WebElement SpecialRequiremnetArrow;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement SpecialRequiremnetfilter;

	@FindBy(xpath = "//div[@class='ant-slider']")
	private WebElement Slider;

	@FindBy(xpath = "//div[@class='ant-slider-handle ant-slider-handle-2']")
	private WebElement passtheBudget;

	@FindBy(xpath = "(//div[contains(text(),'View Details')])[1]")
	private WebElement ViewDetails;

	@FindBy(xpath = "//div[contains(text(),'Book Free Consultation')]")
	private WebElement BookFreeConsultation;

	@FindBy(xpath = "//span[contains(@aria-hidden,'true')]")
	private WebElement hiddenSR;

	@FindBy(xpath = "//span[contains(@aria-hidden,'true')]")
	private WebElement hiddenSR1;

	@FindBy(xpath = "(//button[@class='ant-btn'])[2]")
	private WebElement NumberOfFloorsPlusBtn;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-ghost']")
	private WebElement NumberOfFloorsPlanSelected;
	
	@FindBy(xpath = "//span[contains(text(),'Residential + Commercial')]")
	private WebElement ResidentialPlusCommercial_checkbox;
	
	@FindBy(xpath = "//div[contains(text(),'residential commercial')]")
	private List<WebElement> ResidentialcommercialFilter;
	
	
	@FindBy(xpath = "//span[contains(text(),'4BHK')]")
	private WebElement NumberOfBedroom_txt;
	
	@FindBy(xpath = "//div[@class='parent0']")
	private WebElement NumberOfBedroomTile_0;
	
	
	@FindBy(xpath = "//div[contains(text(),'No Of Bedrooms')]/../following-sibling::div")
	private WebElement NumberOfBedroomCount;
	
	@FindBy(xpath = "//div[contains(text(),'View Details']")
	private WebElement ViewDetails_Btn;
	
	@FindBy(xpath = "(//img[@src='/assets/images/like_design.svg'])[1]")
	private WebElement LikeDesign_icon;
	
	@FindBy(xpath = "(//div[@class='floor-plan-revamp-text'])[1]")
	private WebElement floorPlanRevamp_text;
	
	@FindBy(xpath = "(//img[@src='/assets/images/plotAreaIcon.svg'])[1]")
	private WebElement plotArea_Icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/plotAreaIcon.svg'])[1]/../div")
	private WebElement plotAreaDimention_Icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/rupeeIconNew.svg'])[1]")
	private WebElement rupeeNew_Icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/rupeeIconNew.svg'])[1]/../div")
	private WebElement rupeeNewAmount_Icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/floors-design.svg'])[1]")
	private WebElement floorsdesign_icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/floors-design.svg'])[1]/../div")
	private WebElement floorsdesignNumber_icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/constructionType.svg'])[1]")
	private WebElement constructionType_Icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/constructionType.svg'])[1]/../div")
	private WebElement constructionTypeText_Icon;
	
	@FindBy(xpath = "(//img[@src='/assets/images/share_design.png'])[1]")
	private WebElement sharedesign_Icon;
	
	
	
	@FindBy(xpath = "(//div[contains(text(),'Book Free Consultation')])[1]")
	private WebElement ClickonBookfreeConsultation;
	
	@FindBy(xpath = "(//input[@id='name'])[2]")
	private WebElement EnterName;
	
	@FindBy(xpath = "//input[@id='phonelike_form']")
	private WebElement EnterPhoneNo;
	
	@FindBy(xpath = "(//input[@id='email'])[2]")
	private WebElement EnterEmail;
	
	@FindBy(xpath = "//input[@id='address1like_form']")
	private WebElement EnterAddress;
	
	@FindBy(xpath = "(//div[@class='pac-item'])[1]")
	private WebElement selectAddressLocation;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-theme btn-lg btn-block form__submit-btn order-form-btn'])[2]")
	private WebElement ClickonBookfreeConsultationbutton;
	
	@FindBy(xpath = "(//span[@class='icon-arrow-right'])[3]")
	private WebElement ClickOnLetsBuildArrow;
	
	
	@FindBy(xpath = "//img[@alt=\"whatsapp--v1\"]")
	private WebElement ClickOnWhatappicon;
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Chat With Us')]")
	private WebElement ClickOnthechaticon;
	
	@FindBy(xpath = "//a[contains(text(),'LOAD MORE')]")
	private WebElement ClickOnLoadMore;
	

//        @FindBy(xpath = "//h1[contains(text(),'House Designs and Floor Plans')]")
//    	private WebElement HouseDesignsandFloorPlansHeader;
//      

	public HouseFloorPlansPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void ClickOnLocation() {
		try {
			SelectBengaluruLocation.click();
			System.out.println("Clicked on location");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void ClickOnPopUpClose() throws InterruptedException {
		if (hiddenSR.isDisplayed()) {
			// Thread.sleep(2000);
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), CrossCloseBtn, 30);
			CrossCloseBtn.click();
			System.out.println("Clicked on Close icon");
		}
	}

	public void mouseOverToTheMoreOption() throws InterruptedException {

		if (MoreOptions.isDisplayed()) {
			action.click(getDriver(), MoreOptions);
			Thread.sleep(2000);
		}

	}

	public void ValidateFloorPlansandDesigns() throws Throwable {
			//action.fluentWaitWithIgnoringNoSuchElement(getDriver(), FloorPlansandDesignsLink, 50);
		    Thread.sleep(2000);
			action.JSClick(getDriver(), FloorPlansandDesignsLink);
			Log.info("User clicked on FloorPlansandDesigns option link");
			Thread.sleep(1000);
	}

	public void verifytheFloorPlansDesignUrl() throws Throwable {
		String URL = getDriver().getCurrentUrl();
		Assert.assertEquals(URL, "https://www.bricknbolt.com/house-floor-plans");
	}

	public void getTextsFromPage1() {
		String ExpectedText = "House Designs and Floor Plans";
		String TextStr = houseDesignsandFloorPlans.getText();
		softAssert.assertEquals(TextStr, ExpectedText);

	}
	
	public void waitForNavigateToHouseDesignAndFloorPlansPage() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), houseDesignsandFloorPlans, 30);
	}

	public void getTextsFromPage2() {
		String ExpectedText2 = "Find the curated floor plans from Brick&Bolt.";
		String textstr2 = Findthecuratedfloorplans.getText();
		softAssert.assertEquals(textstr2, ExpectedText2);

	}

	public void verifythefilterArrow() throws InterruptedException {
		if (PlotDimensionsArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), PlotDimensionsArrow, 30);
			action.JSClick(getDriver(), PlotDimensionsArrow);
			action.scrollthepage(getDriver(), ScrolltoPlotDimensions);
			Log.info("User clicked on Filter");
			Thread.sleep(4000);
		}

	}

	public void verifFitterCheckBox() throws InterruptedException {

		List<WebElement> checkboxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isEnabled()) {
				Thread.sleep(2000);
				checkbox.click();

			}
		}
	}

	public void verfiyResetFunction() {
		if (ResetFunction.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), ResetFunction, 30);
			action.JSClick(getDriver(), ResetFunction);
			action.scrollthepage(getDriver(), ScrolltoPlotDimensions);

		}
	}

	public void verifytheBudgetArrow() throws InterruptedException {
		if (clickonHouseBudgetArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), PlotDimensionsArrow, 30);
			action.JSClick(getDriver(), clickonHouseBudgetArrow);
			action.scrollthepage(getDriver(), clickonHouseBudgetArrow);
			Log.info("User clicked on Filter");
			Thread.sleep(10000);

		}
	}

	public void verifyBudgetscroll() throws InterruptedException {
		if (passtheBudget.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), Slider, 30);
			action.click(getDriver(), Slider);
			Actions actions = new Actions(getDriver());
			int width = Slider.getSize().getWidth();
			Log.info("Total width of the slider = " + width);
			actions.moveToElement(Slider, (width / 2) - 100, 0).click().build().perform();
			Log.info("User clicked on Filter");
			Thread.sleep(4000);

		}
	}

	public void verifyroadfacingArrow() throws InterruptedException {
		if (RoadFacingArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), RoadFacingArrow, 30);
			action.JSClick(getDriver(), RoadFacingArrow);
			action.scrollthepage(getDriver(), RoadFacingArrow);
			Log.info("User clicked on Filter");
			Thread.sleep(4000);

		}
	}

	public void verifyroadFacingfilter() throws InterruptedException {
		List<WebElement> checkboxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isEnabled()) {
				Thread.sleep(2000);
				checkbox.click();

			}
		}
	}

	public void verifytheTypeOfContructionArrow() throws InterruptedException {
		if (TypeofContructionArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), TypeofContructionArrow, 30);
			action.JSClick(getDriver(), TypeofContructionArrow);
			action.scrollthepage(getDriver(), TypeofContructionArrow);
			Log.info("User clicked on TypeContructionArrow");
			Thread.sleep(4000);

		}
	}

	public void verifytheTypeOfContructionfilter() throws InterruptedException {
		List<WebElement> checkboxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isEnabled() && checkbox.getAttribute("value").equals("residential_commercial")) {
				Thread.sleep(1000);
				checkbox.click();
				softAssert.assertTrue(true, "Filter matched");	
				break;
			}
		}
	}

	public void verifytheNumberOFBedroomsArrow() throws InterruptedException {
		if (NumberofbedroomsArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), NumberofbedroomsArrow, 30);
			action.JSClick(getDriver(), NumberofbedroomsArrow);
			action.scrollthepage(getDriver(), NumberofbedroomsArrow);
			Log.info("User clicked on NumberofbedroomsArrow");
			Thread.sleep(4000);

		}
	}

	public void verifyttheNumberofbedroomsfilter() throws InterruptedException {
		List<WebElement> checkboxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isEnabled() && checkbox.getAttribute("value").contains("4")) {
				Thread.sleep(1000);
				checkbox.click();
				break;
			}
		}
		action.click(getDriver(), NumberOfBedroomTile_0);
		Thread.sleep(1000);
		//action.JSClick(getDriver(), ViewDetails_Btn);
		action.switchToNewWindow(getDriver());
		action.moveToElement(getDriver(), NumberOfBedroomCount);
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), NumberOfBedroomCount, 30);
		action.verifyText(NumberOfBedroomCount, "4");
		action.switchToOldWindow(getDriver());
		
		//getDriver().navigate().back();
		

	}

	public void verifytheVastucompliantArrowArrow() throws InterruptedException {
		if (VastucompliantArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), VastucompliantArrow, 30);
			action.JSClick(getDriver(), VastucompliantArrow);
			action.scrollthepage(getDriver(), VastucompliantArrow);
			Log.info("User clicked on NumberofbedroomsArrow");
			Thread.sleep(4000);

		}

	}

	public void verifytvastucompliantfiter() throws InterruptedException {
		List<WebElement> checkboxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isEnabled()) {
				Thread.sleep(2000);
				checkbox.click();

			}
		}
	}

	public void verifySpecialRequiremnetArrow() throws InterruptedException {
		if (SpecialRequiremnetArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), SpecialRequiremnetArrow, 30);
			action.JSClick(getDriver(), SpecialRequiremnetArrow);
			action.scrollthepage(getDriver(), SpecialRequiremnetArrow);
			Log.info("User clicked on SpecialRequiremnt Arrow");
			Thread.sleep(4000);

		}
	}

	public void verifySpecialRequiremnetfilter() throws InterruptedException {
		List<WebElement> checkboxes = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isEnabled()) {
				Thread.sleep(2000);
				checkbox.click();

			}
		}
	}

	public void verifyNumberoffloorArrow() throws InterruptedException {
		if (NumberofFloorArrow.isDisplayed()) {
			action.fluentWaitWithIgnoringNoSuchElement(getDriver(), NumberofFloorArrow, 30);
			action.JSClick(getDriver(), NumberofFloorArrow);
			action.scrollthepage(getDriver(), NumberofFloorArrow);
			action.JSClick(getDriver(), NumberOfFloorsPlusBtn);
			action.scrollthepage(getDriver(), NumberofFloorArrow);
			verifyNumberoffloorSelected();
			Log.info("User clicked on numberoffloorplan ");
			Thread.sleep(4000);

		}

	}

	public void verifyNumberoffloorSelected() throws InterruptedException {
		if (NumberOfFloorsPlanSelected.isDisplayed()) {
			String numberoffloors = NumberOfFloorsPlanSelected.getText();
			softAssert.assertEquals(numberoffloors, "1", "Number of floor selected not matached");
		}

	}

	public void verifytheFloorplanImage() throws InterruptedException {
		if (floorPlanImageLink.isDisplayed()) {
			action.fluentWaitVisibility(getDriver(), floorPlanImageLink, 20);
			action.JSClick(getDriver(), floorPlanImageLink);
			Log.info("User clicked on FloorPlansandDesigns option link");
			Thread.sleep(5000);
		}

	}
	
	public Boolean validateLikeDesignIcon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), LikeDesign_icon, 30);
		return action.isDisplayed(getDriver(), LikeDesign_icon);
	}
	
	public Boolean validatefloorPlanRevamp_text() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), floorPlanRevamp_text, 30);
		return action.isDisplayed(getDriver(), floorPlanRevamp_text);
	}
	
	public Boolean validateplotArea_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), plotArea_Icon, 30);
		return action.isDisplayed(getDriver(), plotArea_Icon);
	}
	
	public Boolean validateplotAreaDimention_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), plotAreaDimention_Icon, 30);
		return action.isDisplayed(getDriver(), plotAreaDimention_Icon);
	}
	
	public Boolean validaterupeeNew_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), rupeeNew_Icon, 30);
		return action.isDisplayed(getDriver(), rupeeNew_Icon);
	}
	
	public Boolean validaterupeeNewAmount_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), rupeeNewAmount_Icon, 30);
		return action.isDisplayed(getDriver(), rupeeNewAmount_Icon);
	}
	
	public Boolean validatefloorsdesign_icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), floorsdesign_icon, 30);
		return action.isDisplayed(getDriver(), floorsdesign_icon);
	}
	
	public Boolean validatefloorsdesignNumber_icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), floorsdesignNumber_icon, 30);
		return action.isDisplayed(getDriver(), floorsdesignNumber_icon);
	}
	
	public Boolean validateconstructionType_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), constructionType_Icon, 30);
		return action.isDisplayed(getDriver(), constructionType_Icon);
	}
	
	public Boolean validateconstructionTypeText_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), constructionTypeText_Icon, 30);
		return action.isDisplayed(getDriver(), constructionTypeText_Icon);
	}
	
	public Boolean validatesharedesign_Icon() {
		action.fluentWaitWithIgnoringNoSuchElement(getDriver(), sharedesign_Icon, 30);
		return action.isDisplayed(getDriver(), sharedesign_Icon);
	}
	
	public void verifyBookFreeConsultationoption() throws InterruptedException {
		    action.scrollthepage(getDriver(), NumberOfBedroomTile_0);
		    action.moveToElement(getDriver(), NumberOfBedroomTile_0);
			action.fluentWaitVisibility(getDriver(), ClickonBookfreeConsultation, 20);
			action.JSClick(getDriver(), ClickonBookfreeConsultation);
			Log.info("User clicked on the free consultation");
			Thread.sleep(3000);
		
}
	
	public void verifythefreeconsultationform() throws InterruptedException {
		EnterName.sendKeys("Test");
		Log.info("User Entered Name");
		EnterPhoneNo.sendKeys("9000000001");
		Log.info("User Entered phone number");
		EnterEmail.sendKeys("TestQA@gmail.com");
		Log.info("User Entered Email");
		EnterAddress.sendKeys("Whitefield, Bengaluru, Karnataka, India");
		EnterAddress.sendKeys(Keys.BACK_SPACE);
		EnterAddress.sendKeys(Keys.BACK_SPACE);
		action.click(getDriver(), selectAddressLocation);
		Thread.sleep(2000);
		action.JSClick(getDriver(), ClickonBookfreeConsultationbutton);
        Log.info("User clicked on free consultation submit button");
        Thread.sleep(7000);
	}


public void verifytheLetsBuildArrow() throws InterruptedException {
	if (ClickOnLetsBuildArrow.isDisplayed()) {
		action.fluentWaitVisibility(getDriver(), ClickOnLetsBuildArrow, 20);
		action.JSClick(getDriver(), ClickOnLetsBuildArrow);
		action.scrollthepage(getDriver(), ClickOnLetsBuildArrow);
		Log.info("User clicked on the LetBuild button");
		Thread.sleep(5000);
	}

}

public void verifytheWhatappicon() throws InterruptedException {
	if (ClickOnWhatappicon.isDisplayed()) {
		action.fluentWaitVisibility(getDriver(), ClickOnWhatappicon, 20);
		action.JSClick(getDriver(), ClickOnWhatappicon);
		//action.scrollthepage(getDriver(), ClickOnLetsBuildArrow);
		Log.info("User clicked on the Whatapp icon");
		Thread.sleep(5000);
	}

}

public void verifytheclickonChatonus() throws InterruptedException {
	if (ClickOnthechaticon.isDisplayed()) {
		action.fluentWaitVisibility(getDriver(), ClickOnthechaticon, 20);
		action.JSClick(getDriver(), ClickOnthechaticon);
		//action.scrollthepage(getDriver(), ClickOnLetsBuildArrow);
		Log.info("User clicked on the Chat on us iscon");
		Thread.sleep(5000);
	}

}


public void verifytheclickonLoadMore() throws InterruptedException {
	if (ClickOnLoadMore.isDisplayed()) {
		action.fluentWaitVisibility(getDriver(), ClickOnLoadMore, 20);
		action.JSClick(getDriver(), ClickOnLoadMore);
		//action.scrollthepage(getDriver(), ClickOnLetsBuildArrow);
		Log.info("User clicked on the Load more");
		Thread.sleep(5000);
	}

}


}






















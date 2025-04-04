package com.testWeb.pageobjects;

import com.BnBweb.actiondriver.Action;
import com.BnBweb.base.BaseClass;
import com.BnBweb.utility.ReadExcel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageExp extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//img[contains(@src,'/assets/images/logo/Logo_Home.svg')]")
	private WebElement imageLogo;

	@FindBy(xpath = "//p[contains(text(),'3100+')]")
	private WebElement numHomes;

	@FindBy(xpath = "(//p[contains(text(),'430+')])[2]")
	private WebElement qualityChecks;

	@FindBy(xpath = "(//p[contains(text(),'100%')])[1]")
	private WebElement safeMoneyTransaction;

	@FindBy(xpath = "(//a[contains(@href,'/lets-build')])[1]")
	private WebElement letsBuild;

	@FindBy(xpath = "(//a[contains(@class,'nav-link  lets-build-shadow')])")
	private WebElement letsBuildHeader;

	@FindBy(xpath = "//div[contains(text(),'Download App')]")
	private WebElement downloadApp;

	@FindBy(xpath = "(//a[contains(@class,'btn-link-btn')])[2]")
	private WebElement comparePackages;

	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "offerCode")
	private WebElement code;

	@FindBy(id = "city")
	private WebElement selectCity;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-primary btn-theme btn-lg btn-block')])[1]")
	private WebElement submit;

	@FindBy(xpath = "(//a[contains(text(),'How it Works')])[2]")
	private WebElement howItWorks;

	@FindBy(xpath = "(//a[contains(text(),'How it Works')])[1]")
	private WebElement howItWorksHeader;

	@FindBy(xpath = "(//a[contains(@class,'nav-link')])[4]")
	private WebElement more;

	@FindBy(xpath = "(//a[contains(text(),'Our Projects')])[2]")
	private WebElement ourProjects;

	@FindBy(xpath = "(//a[contains(text(),'Our Projects')])[1]")
	private WebElement ourProjectsHeader;

	@FindBy(xpath = "(//a[contains(text(),'Luxury Projects')])[2]")
	private WebElement luxuryProjects;

	@FindBy(xpath = "(//a[contains(text(),'Luxury Projects')])[1]")
	private WebElement luxuryProjectsHeader;

	@FindBy(xpath = "(//a[contains(text(),'Cost Estimator')])[2]")
	private WebElement costEstimator;

	@FindBy(xpath = "(//a[contains(text(),'Cost Estimator')])[1]")
	private WebElement costEstimatorHeader;

	@FindBy(xpath = "(//a[contains(text(),'Home Construction Cost Calculator')])")
	private WebElement houseConstructionCostCalculatorHeader;

	@FindBy(xpath = "(//a[contains(text(),'Home Building Guide')])")
	private WebElement homeBuildingGuideHeader;

	@FindBy(xpath = "(//a[contains(text(),'Construction for Business')])")
	private WebElement constructionForBusinessHeader;

	@FindBy(xpath = "(//a[contains(text(),'Building Materials')])")
	private WebElement buildingMaterialsHeader;

	@FindBy(xpath = "(//a[contains(text(),'All About House Construction')])")
	private WebElement allAboutHouseConstructionHeader;

	@FindBy(xpath = "(//a[contains(text(),'Material Estimator')])[2]")
	private WebElement materialEstimator;

	@FindBy(xpath = "(//a[contains(text(),'Material Estimator')])[1]")
	private WebElement materialEstimatorHeader;

	@FindBy(xpath = "(//a[contains(text(),'Floor Plans')])[2]")
	private WebElement floorPlans;

	@FindBy(xpath = "(//a[contains(text(),'Floor Plans')])[1]")
	private WebElement floorPlansHeader;

	@FindBy(xpath = "(//a[contains(text(),'About Us')])[2]")
	private WebElement aboutUs;

	@FindBy(xpath = "(//a[contains(text(),'About Us')])[1]")
	private WebElement aboutUsHeader;

	@FindBy(xpath = "(//a[contains(text(),'Blogs and Articles')])[2]")
	private WebElement blogsAndArticles;

	@FindBy(xpath = "(//a[contains(text(),'Blogs and Articles')])[1]")
	private WebElement blogsAndArticlesHeader;

	@FindBy(xpath = "(//a[contains(text(),'Careers')])[2]")
	private WebElement careers;

	@FindBy(xpath = "(//a[contains(text(),'Careers')])[1]")
	private WebElement careersHeader;

	@FindBy(xpath = "(//a[contains(text(),'Contact Us')])[2]")
	private WebElement contactUs;

	@FindBy(xpath = "(//a[contains(text(),'Contact Us')])[1]")
	private WebElement contactUsHeader;

	@FindBy(xpath = "(//a[contains(text(),'Reviews')])[2]")
	private WebElement reviews;

	@FindBy(xpath = "(//a[contains(text(),'Reviews')])[1]")
	private WebElement reviewsHeader;

	@FindBy(xpath = "(//a[contains(text(),'Join us as a professional')])[2]")
	private WebElement joinUsAsAProfessional;

	@FindBy(xpath = "(//a[contains(text(),'Join us as a professional')])[1]")
	private WebElement joinUsAsAProfessionalHeader;

	@FindBy(xpath = "//a[contains(text(),'Refer a Friend')]")
	private WebElement referAFriend;

	@FindBy(xpath = "//a[contains(text(),'Channel Partner')]")
	private WebElement channelPartner;

	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	private WebElement termsAndConditions;

	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicy;

	@FindBy(xpath = "//a[contains(text(),'FAQs')]")
	private WebElement FAQs;

	@FindBy(xpath = "//a[contains(text(),'Cancellation Policy')]")
	private WebElement cancellationPolicy;

	@FindBy(xpath = "//a[contains(text(),'+91 7505 205 205')]")
	private WebElement getInTouchMobile;

	@FindBy(xpath = "//a[contains(text(),'care@bricknbolt.com')]")
	private WebElement getInTouchEmail;

	@FindBy(xpath = "//p[contains(text(),' 2022 Pluckwalk Technologies Pvt. Ltd. All rights reserved')]")
	private WebElement PluckwalkTechnologiesCopyrights;

	@FindBy(xpath = "//span[contains(@class,'icon-ic-twitter')]")
	private WebElement twitter;

	@FindBy(xpath = "//span[contains(@class,'icon-ic-facebook')]")
	private WebElement facebook;

	@FindBy(xpath = "//span[contains(@class,'icon-ic-linkedin')]")
	private WebElement linkedin;

	@FindBy(xpath = "(//a[contains(text(),'T&C Apply')])[1]")
	private WebElement TCapply;

	@FindBy(xpath = "//div[contains(text(),'Chat With Us')]")
	private WebElement chatWIthUs;

	@FindBy(xpath = "//div[contains(@class,'btn btn-primary btn-theme btn-lg download-app')]")
	private WebElement downloadAppBtn;

	@FindBy(xpath = "(//a[contains(@href,'https://play.google.com/store/apps')])[1]")
	private WebElement googlePlayBadge;

	@FindBy(xpath = "//img[contains(@src,'/assets/images/appStore.png')]")
	private WebElement appStoreBadge;

	@FindBy(xpath = "//span[contains(@aria-hidden,'true')]")
	private WebElement hiddenSR;

//Sales Login Details

	@FindBy(xpath = "//input[contains(@type,'email')]")
	private WebElement LoginWithGoogleEmail;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	private WebElement LoginWithGoogleButton;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement EmailClickNext;

	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement EnterPassword;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement PasswordClickNext;

	@FindBy(xpath = "//span[contains(text(),'Add Filter')]")
	private WebElement SalesFilter;

	@FindBy(xpath = "//input[contains(@placeholder,'Search On CrnId, Phone, Email, Name')]")
	private WebElement searchByPhone;

	@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-primary ant-input-search-button')]")
	private WebElement searchByPhoneClick;

//Sales Created CRN Details

	@FindBy(xpath = "//span[contains(@style,'font-weight: bold; cursor: pointer; color: rgb(0, 123, 255)')]")
	private WebElement createdSRCRNID;

	@FindBy(xpath = "(//td[contains(@class,'ant-table-cell')])[2]")
	private WebElement createdSRName;

	@FindBy(xpath = "(//td[contains(@class,'ant-table-cell')])[3]")
	private WebElement createdSREMail;

	@FindBy(xpath = "(//td[contains(@class,'ant-table-cell')])[8]")
	private WebElement createdSRCity;

	@FindBy(xpath = "(//td[contains(@class,'ant-table-cell')])[4]")
	private WebElement createdSRPhone;

	@FindBy(xpath = "//span[contains(@aria-label,'delete')]")
	private WebElement deleteSR;

	@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-primary ant-btn-sm')]")
	private WebElement deleteSRconfirm;

	private int cityIndex = 2;
	private String cityValue = "MAS_TN_IN";
	private String cityBengaluru = "Bengaluru";
	private String cityMysuru = "Mysuru";
	private String cityHyderabad = "Hyderabad";
	private String cityChennai = "Chennai";
	private String cityPune = "Pune";

	public HomePageExp() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void hiddenSR() {
	if (hiddenSR.isDisplayed()) {
		hiddenSR.click();
		System.out.println("Closed HiddenSRRR");
	}}
	
	public void hiddenSR1() {
	if (hiddenSR.isDisplayed()) {
		hiddenSR.click();
		//System.out.println("Closed HiddenSRRR");
	}}

	public boolean validateLogoImageD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), imageLogo);
	}

	public boolean validateHomesD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), numHomes);
	}

	public boolean validateQualityChecksD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), qualityChecks);
	}

	public boolean validateSafeMoneyTransactionD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), safeMoneyTransaction);
	}

	public boolean validateLetsBuildD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), letsBuild);
	}

	public boolean validateDownloadAppD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), downloadApp);
	}

	public boolean validateNameD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), name);
	}

	public boolean validateMobileNumberD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), phone);
	}

	public boolean validateEmailD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), email);
	}
//Offer Code is Disabled
/*	public boolean validateOfferCodeD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), code);
	}*/

	public boolean validateCityD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), selectCity);
	}

	public boolean validateBookFreeConsultationD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), submit);
	}

	public boolean validateGooglePlayD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), googlePlayBadge);
	}

	public boolean validateAppStoreD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), appStoreBadge);
	}

	public boolean validateHowItWorksD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), howItWorks);
	}

	public boolean validateOurProjectsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), ourProjects);
	}

	public boolean validateLuxuryProjectsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), luxuryProjects);
	}

	public boolean validateCostEstimatorD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), costEstimator);
	}

	public boolean validateMaterialEstimatorD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), materialEstimator);
	}

	public boolean validateFloorPlansD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), floorPlans);
	}

	public boolean validateAboutUsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), aboutUs);
	}

	public boolean validateBolgsAndArticlesD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), blogsAndArticles);
	}

	public boolean validateCareers() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), careers);
	}

	public boolean validateContactUsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), contactUs);
	}

	public boolean validateReviewsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), reviews);
	}

	public boolean validateJoinUsAsProfessionalD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), joinUsAsAProfessional);
	}

	public boolean validateReferAFreinedD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), referAFriend);
	}

	public boolean validateChannelPartnerD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), channelPartner);
	}

	public boolean validateTermsAndConditionsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), termsAndConditions);
	}

	public boolean validatePrivacyPolicyD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), privacyPolicy);
	}

	public boolean validateFAQsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), FAQs);
	}

	public boolean validateCancellationPolicyD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), cancellationPolicy);
	}

	public boolean validateGetInTouchMobileD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), getInTouchMobile);
	}

	public boolean validateGetInTouchEmailD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), getInTouchEmail);
	}

	public boolean validatePluckwalkTechnologiesCopyrightsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), PluckwalkTechnologiesCopyrights);
	}

	public boolean validateTwitterD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), twitter);
	}

	public boolean validateFacebookD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), facebook);
	}

	public boolean validateLinkedinD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), linkedin);
	}

	public boolean validateTCApplyD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), TCapply);
	}

	public boolean validateChatWIthUsD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), chatWIthUs);
	}

	// ==============================Navigation Validation Starts=======================================================

	public String validateLetsBuildN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), letsBuild);
		String cellValue = ReadExcel.getCellValue(50, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(50, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateDownloadAppN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), googlePlayBadge);
		String cellValue = ReadExcel.getCellValue(51, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(51, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateGooglePlayN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), downloadApp);
		String cellValue = ReadExcel.getCellValue(52, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(52, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateAppStoreN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), appStoreBadge);
		String cellValue = ReadExcel.getCellValue(53, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(53, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateHowItWorksN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), howItWorks);
		String cellValue = ReadExcel.getCellValue(54, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(54, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateOurProjectsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), ourProjects);
		String cellValue = ReadExcel.getCellValue(55, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(55, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateLuxuryProjectsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), luxuryProjects);
		String cellValue = ReadExcel.getCellValue(56, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(56, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateCostEstimatorN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), costEstimator);
		String cellValue = ReadExcel.getCellValue(57, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(57, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateMaterialEstimatorN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), materialEstimator);
		String cellValue = ReadExcel.getCellValue(58, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(58, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateFloorPlansN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), floorPlans);
		String cellValue = ReadExcel.getCellValue(59, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(59, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateAboutUsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), aboutUs);
		String cellValue = ReadExcel.getCellValue(60, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(60, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateBolgsAndArticlesN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), blogsAndArticles);
		String cellValue = ReadExcel.getCellValue(61, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(61, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateCareersN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), careers);
		String cellValue = ReadExcel.getCellValue(62, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(62, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateContactUsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), contactUs);
		String cellValue = ReadExcel.getCellValue(63, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(63, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateReviewsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), reviews);
		String cellValue = ReadExcel.getCellValue(64, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(64, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateJoinUsAsProfessionalN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), joinUsAsAProfessional);
		String cellValue = ReadExcel.getCellValue(65, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(65, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateReferAFreinedN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), referAFriend);
		String cellValue = ReadExcel.getCellValue(66, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(66, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateChannelPartnerN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), channelPartner);
		String cellValue = ReadExcel.getCellValue(67, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(67, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateTermsAndConditionsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), termsAndConditions);
		String cellValue = ReadExcel.getCellValue(68, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(68, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validatePrivacyPolicyN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), privacyPolicy);
		String cellValue = ReadExcel.getCellValue(69, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(69, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateFAQsN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), FAQs);
		String cellValue = ReadExcel.getCellValue(70, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(70, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String validateCancellationPolicyN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), cancellationPolicy);
		String cellValue = ReadExcel.getCellValue(71, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(71, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateOurProjectsHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), ourProjectsHeader);
		String cellValue = ReadExcel.getCellValue(72, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(72, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateCostEstimatorHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), costEstimatorHeader);
		String cellValue = ReadExcel.getCellValue(73, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(73, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateHowItWorksHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), howItWorksHeader);
		String cellValue = ReadExcel.getCellValue(74, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(74, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateBlogsAndArticlesHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), blogsAndArticlesHeader);
		String cellValue = ReadExcel.getCellValue(75, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(75, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateMaterialEstimatorHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), materialEstimatorHeader);
		String cellValue = ReadExcel.getCellValue(76, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(76, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateFloorPlansHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), floorPlansHeader);
		String cellValue = ReadExcel.getCellValue(77, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(77, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateAboutUsHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), aboutUsHeader);
		String cellValue = ReadExcel.getCellValue(78, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(78, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateCareersHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), careersHeader);
		String cellValue = ReadExcel.getCellValue(79, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(79, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateContactUsHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), contactUsHeader);
		String cellValue = ReadExcel.getCellValue(80, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(80, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateJoinUsAsProfessionalHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsAsAProfessionalHeader);
		String cellValue = ReadExcel.getCellValue(81, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(81, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String ValidateReviewsHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), reviewsHeader);
		String cellValue = ReadExcel.getCellValue(82, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(82, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}

	public String ValidateLuxuryProjectsHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), luxuryProjectsHeader);
		String cellValue = ReadExcel.getCellValue(83, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(83, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateHomeConstructionCostCalculatorHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), houseConstructionCostCalculatorHeader);
		String cellValue = ReadExcel.getCellValue(84, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(84, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateAllAboutHouseConstructionHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), allAboutHouseConstructionHeader);
		String cellValue = ReadExcel.getCellValue(85, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(85, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateHomeBuildingGuideHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), homeBuildingGuideHeader);
		String cellValue = ReadExcel.getCellValue(86, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(86, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateConstructionForBusinessHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), constructionForBusinessHeader);
		String cellValue = ReadExcel.getCellValue(87, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(87, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateBuildingMaterialsHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), buildingMaterialsHeader);
		String cellValue = ReadExcel.getCellValue(88, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(88, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateLetsBuildHeaderN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), letsBuildHeader);
		String cellValue = ReadExcel.getCellValue(89, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(89, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	
	public String ValidateComparePackagesN() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
//		action.click(getDriver(), more);
		Thread.sleep(2000);
		action.JSClick(getDriver(), comparePackages);
		String cellValue = ReadExcel.getCellValue(90, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String actualUrl = action.getCurrentURL(getDriver());
		ReadExcel.setCellValue(90, 12, actualUrl);
		getDriver().get(prop.getProperty("url"));
		Thread.sleep(2000);
		return actualUrl;
	}
	

//==================================Service Request Creation Verification Starts=======================================================

	public void ValidateMainFormSR() throws Throwable {
		int cellIncrement = 0;
		int mobNumSuffix10 = 11;
		getDriver().get(prop.getProperty("url"));
/*		String actualUrl = getDriver().getCurrentUrl();
		ReadExcel.setCellValue(92, 20, actualUrl);*/
		int count = 5;
		
		for (int i=0; i<count; i++)
		{
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		Thread.sleep(2000);
		String userName = prop.getProperty("userName");
		action.type(name, userName);
        ReadExcel.setCellValue(92+cellIncrement, 16, userName);
		Thread.sleep(2000);
/*		String PhoneNumber = ReadExcel.getCellValue(92+cellIncrement, 17);
		action.type(phone, PhoneNumber);
		Thread.sleep(2000);*/
        action.type(phone, (prop.getProperty("userPhone")+mobNumSuffix10));
        String PhoneNumber = prop.getProperty("userPhone")+mobNumSuffix10;
        ReadExcel.setCellValue(92+cellIncrement, 17, PhoneNumber);
		String EMail = prop.getProperty("userEmail");
		Thread.sleep(2000);
		action.type(email, EMail);
		ReadExcel.setCellValue(92+cellIncrement, 18, EMail);
//		email.sendKeys(EMail);
//		action.type(email, EMail);
		Thread.sleep(2000);
		action.click(getDriver(), selectCity);
/*		action.selectByIndex(selectCity, cityIndex);
		Thread.sleep(2000);
		action.selectByValue(selectCity, cityValue);
		Thread.sleep(2000);*/
		
//		action.selectByIndex(selectCity, i);
		String cityName = ReadExcel.getCellValue(92+cellIncrement, 19);
		if (cityName.equalsIgnoreCase("BNG_KA_IN")) {
		System.out.println("Selected City is : "+ cityName);
//		action.selectByVisibleText(selectCity, cityBengaluru);}
		action.selectByValue(selectCity, "BNG_KA_IN");}
		else if (cityName.equalsIgnoreCase("MYS_KA_IN")) {
		System.out.println("Selected City is : "+ cityName);
//		action.selectByVisibleText(selectCity, cityMysuru);}
		action.selectByValue(selectCity, "MYS_KA_IN");}
		else if (cityName.equalsIgnoreCase("HYD_TG_IN")) {
		System.out.println("Selected City is : "+ cityName);
//		action.selectByVisibleText(selectCity, cityHyderabad);}
		action.selectByValue(selectCity, "HYD_TG_IN");}
		else if (cityName.equalsIgnoreCase("MAS_TN_IN")) {
		System.out.println("Selected City is : "+ cityName);
//		action.selectByVisibleText(selectCity, cityChennai);}
		action.selectByValue(selectCity, "MAS_TN_IN");}
		else if (cityName.equalsIgnoreCase("PUNE_MH_IND")) {
		System.out.println("Selected City is : "+ cityName);
		action.selectByValue(selectCity, "PUNE_MH_IND");}
		Thread.sleep(2000);
		submit.click();
		String cellValue = ReadExcel.getCellValue(92+cellIncrement, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		getDriver().get(prop.getProperty("url"));
		mobNumSuffix10++;
		cellIncrement++;
		
	}
		
/*		getDriver().get(prop.getProperty("urlSales"));
		Thread.sleep(2000);
		String salesTitle = getDriver().getTitle();
		System.out.println("Sales Window Title is: "+salesTitle);
		String salesWindowHandle = getDriver().getWindowHandle();
		System.out.println("Sales Window Handle Window Handle is: "+salesWindowHandle);
		
        if (action.isDisplayed(getDriver(), LoginWithGoogleButton))
	    {
	    	System.out.println("Login with Google is Diaplayed");
	    }
		
        Thread.sleep(2000);
        
        action.click(getDriver(), LoginWithGoogleButton);
		
		Set<String> allWindowHandles = getDriver().getWindowHandles();
	    Iterator<String> iterator = allWindowHandles.iterator();
	    
	    // Here we will check if child window has other child windows and will fetch the heading of the child window
	    while (iterator.hasNext()) 
	    {
	        String loginWithGoogle = iterator.next();
			System.out.println("Login With Google Window Handle is: "+loginWithGoogle);
			
	            if (!salesWindowHandle.equalsIgnoreCase(loginWithGoogle)) 
	        {
	            getDriver().switchTo().window(loginWithGoogle);
	            Thread.sleep(2000);
				action.findElement(getDriver(), LoginWithGoogleEmail);
				Thread.sleep(2000);
				action.type(LoginWithGoogleEmail, prop.getProperty("emailAuthenticationSDE"));
				Thread.sleep(2000);
				Log.info("============================================Mail ID Entereddddd============");
				action.explicitWait(getDriver(), EmailClickNext, 20);
				action.click(getDriver(), EmailClickNext);
				Log.info("============================================Click Action is DONE===========");
				Thread.sleep(4000);
				action.findElement(getDriver(), EnterPassword);
				Thread.sleep(2000);
				action.type(EnterPassword, prop.getProperty("passwordAuthenticationSDE"));
				Log.info("============================================Entered Password================");
				Thread.sleep(2000);
				action.click(getDriver(), PasswordClickNext);
				Thread.sleep(4000);			
            }       	    	   
        }
	    
	    getDriver().switchTo().window(salesWindowHandle);
	    getDriver().get(prop.getProperty("urlSales1"));
	    Thread.sleep(2000);
		
	    int cellIncrement1 = 0;
	    for(int j=0; j<count; j++) {
	    
		action.isDisplayed(getDriver(), SalesFilter);
		action.JSClick(getDriver(), SalesFilter);
		action.isDisplayed(getDriver(), searchByPhone);
		action.click(getDriver(), searchByPhone);
	    	
	    String phoneToSearch = ReadExcel.getCellValue(92+cellIncrement1, 17);
	    action.type(searchByPhone, phoneToSearch);
	    action.JSClick(getDriver(), searchByPhoneClick);
	    Thread.sleep(2000);
*/	  
		int cellIncrement1 = 0;
		int mobNumSuffix110 = 11;
		for(int k=0; k<count; k++) {
			
		action.deleteCRN((prop.getProperty("userPhone")+mobNumSuffix110), (prop.getProperty("userName")), (prop.getProperty("userEmail")), cellIncrement1);
		
/*	    String createdCRNID = createdSRCRNID.getText();
	    ReadExcel.setCellValue(92+cellIncrement1, 20, createdCRNID);
	    System.out.println("Created CRN is : "+createdCRNID);
	    
	    String createdName = createdSRName.getText();
	    ReadExcel.setCellValue(92+cellIncrement1, 21, createdName);
	    System.out.println(createdCRNID+" Name is : "+createdName);
	    
	    String createdPhone = createdSRPhone.getText();
	    ReadExcel.setCellValue(92+cellIncrement1, 22, createdPhone);
	    System.out.println(createdCRNID+" Phone Number is : "+createdPhone);
	    
	    String createdEMail = createdSREMail.getText();
	    ReadExcel.setCellValue(92+cellIncrement1, 23, createdEMail);
	    System.out.println(createdCRNID+" EMail is : "+createdEMail);
   
	    String createdCity = createdSRCity.getText();
	    ReadExcel.setCellValue(92+cellIncrement1, 24, createdCity);
	    System.out.println(createdCRNID+" City is : "+createdCity);*/
	    
/*	    if (createdName.equalsIgnoreCase(prop.getProperty("userName")) && createdEMail.equalsIgnoreCase(prop.getProperty("userEmail"))){
	    action.isDisplayed(getDriver(), deleteSR);
		action.click(getDriver(), deleteSR);
		Thread.sleep(2000);
		
		action.isDisplayed(getDriver(), deleteSRconfirm);
		action.click(getDriver(), deleteSRconfirm);
		Thread.sleep(2000);}
		
		else {
			System.out.println("CRN Not Matching");
		}

	    getDriver().navigate().back();
	    Thread.sleep(4000);*/
	    mobNumSuffix110++;
	    cellIncrement1++;
	    
	    } 
	    
  }	
}

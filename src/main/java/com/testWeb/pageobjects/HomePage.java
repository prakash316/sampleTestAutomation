package com.testWeb.pageobjects;

import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BnBweb.actiondriver.Action;
import com.BnBweb.base.BaseClass;
import com.BnBweb.utility.Log;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseClass {

	Action action = new Action();
	//--------------------------------------------------------------New Down ---------------------------------------------------------------------
	@FindBy(xpath = "//img[contains(@src,'/assets/images/logo/Logo_Home.svg')]")
	private WebElement imageLogo;

	@FindBy(css = "div[class='form__action__btns'] button[type='submit']")
	private WebElement bookFreeConsultationMainForm;

	@FindBy(xpath = "(//a[contains(@href,'/lets-build')])[1]")
	private WebElement letsBuild;

	@FindBy(xpath = "(//p[normalize-space()='*name field is required'])[1]")
	private WebElement nameFieldRequired;

	@FindBy(xpath = "(//label[@for='name'])[1]") //(//input[@id='name'])[1]
	private WebElement nameField;
	@FindBy(xpath = "(//input[@id='name'])[1]") //(//input[@id='name'])[1]
	private WebElement nameFieldMailForm;

	@FindBy(xpath = "(//p[normalize-space()='*phone number field is required'])[1]")
	private WebElement phoneNumberFieldIsRequired;
	@FindBy(xpath = "(//input[@id='phone'])[1]")
	private WebElement phoneNumberField;

	@FindBy(xpath = "(//label[@for='email'])[1]") // (//input[@id='email'])[1]
	private WebElement eMail;

	@FindBy(xpath = "(//input[@id='email'])[1]") // (//input[@id='email'])[1]
	private WebElement eMailMainForm;

	@FindBy(xpath = "(//p[normalize-space()='*Please select location of your plot'])[1]")
	private WebElement pleaseSelectLocationOfYourPlot;

	@FindBy(xpath = "(//label[@for='address'])[1]") // (//input[@id='address'])[1]
	private WebElement locationOfYourPlot;

	@FindBy(xpath = "(//input[@id='address'])[1]")
	private WebElement locationOfYourPlotMainForm;

	@FindBy(xpath = "(//label[@for='offerCode'])[1]")
	private WebElement offerCode;

	@FindBy(xpath = "(//a[normalize-space()='privacy policy'])[1]")
	private WebElement privacyPolicy;


//--------------------------------------------------------------New Up ---------------------------------------------------------------------

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
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

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void hiddenSR() {
		if (hiddenSR.isDisplayed()) {
			hiddenSR.click();
			System.out.println("Closed HiddenSRRR");
		}
	}

	public void hiddenSR1() {
		if (hiddenSR.isDisplayed()) {
			hiddenSR.click();
			//System.out.println("Closed HiddenSRRR");
		}
	}

	public boolean validateLogoImageD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), imageLogo);
	}

	public boolean validateBookFreeConsultationD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), bookFreeConsultationMainForm);
	}

	public String validateBookFreeConsultationT() throws Throwable {
//		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return bookFreeConsultationMainForm.getText();
	}

	public List<String> validateMainFormFieldsText() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();

		action.scrollByVisibilityOfElement(getDriver(),nameField);
		// Get the Field =Texts
		String nameFieldError = nameField.getText();
		String phoneFieldError = phoneNumberField.getAttribute("placeholder");
		;
		String locationFieldError = locationOfYourPlot.getText();

		// Create a list to store the error messages
		List<String> fieldTexts = new ArrayList<>();
		fieldTexts.add(nameFieldError);
		fieldTexts.add(phoneFieldError);
		fieldTexts.add(locationFieldError);

		// Return the list of error messages
		return fieldTexts;
	}

	public List<String> validateBookFreeConsultationC() throws Throwable {
//		if (hiddenSR.isDisplayed()) hiddenSR.click();
//		hiddenSR();


		action.JSClick(getDriver(), bookFreeConsultationMainForm);
		action.scrollByVisibilityOfElement(getDriver(),nameField);
		action.scrollByVisibilityOfElement(getDriver(),imageLogo);

		// Get the error messages
		String nameFieldError = nameFieldRequired.getText();
		String phoneFieldError = phoneNumberFieldIsRequired.getText();
		String locationFieldError = pleaseSelectLocationOfYourPlot.getText();

		// Create a list to store the error messages
		List<String> errorMessages = new ArrayList<>();
		errorMessages.add(nameFieldError);
		errorMessages.add(phoneFieldError);
		errorMessages.add(locationFieldError);

		// Return the list of error messages
		return errorMessages;
	}

	public String clickNavigationNextPageCheck(WebElement ele) throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), ele);

		Set<String> allWindowHandles = getDriver().getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		String mainWindowHandle = getDriver().getWindowHandle();

		// Here we will check if child window has other child windows and will fetch the heading of the child window
		String actualPrivacyLink = null;
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
//			String actualPrivacyLink = getDriver().getCurrentUrl();
//			String expectedPrivacyLink = "https://uat.bricknbolt.com/privacy-policy";

			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				getDriver().switchTo().window(ChildWindow);
				Thread.sleep(2000);
				actualPrivacyLink = getDriver().getCurrentUrl();
//				String expectedPrivacyLink = "https://uat.bricknbolt.com/privacy-policy";
				Log.info("=========================================================================================");
				Log.info("url of child window is: " + actualPrivacyLink);
			}
		}
		imageLogo.click(); // return to Homepage
		return actualPrivacyLink;
	}

	public List<String> clickNavigationSamePageCheck(WebElement ele) throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.JSClick(getDriver(), ele);
		List<String> titlelist = new ArrayList<>();
		titlelist.add(getDriver().getCurrentUrl());
		titlelist.add(getDriver().getTitle());
		imageLogo.click(); // return to Homepage
		return titlelist;
	}

	public List<String> navigationSamePageCheck() throws Throwable {
		List<String> titlelist = new ArrayList<>();
		titlelist.add(getDriver().getCurrentUrl());
		titlelist.add(getDriver().getTitle());
		return titlelist;
	}

	public List<String> alertTextCheckPage(WebElement imageEle, List<WebElement> elementList, WebElement clickEle) throws Throwable {
		action.isDisplayed(getDriver(), imageEle);
		List<String> elementTextList = new ArrayList<>();

		// Iterate through the list of WebElements
		for (WebElement element : elementList) {
			// Get the text of each element and add it to the list
			String text = element.getText();
			elementTextList.add(text);
		}
		action.JSClick(getDriver(), clickEle);
		return elementTextList;
	}

	public List<String> validatePrivacyPolicyLink() throws Throwable {
		List<String> actualPrivacyLinkList = clickNavigationSamePageCheck(privacyPolicy);
		return actualPrivacyLinkList;
	}


//	public boolean validateOfferCodeD() throws Throwable {
//		if (hiddenSR.isDisplayed()) hiddenSR.click();
//		return action.isDisplayed(getDriver(), offerCode);
//	}


	public String validateprivacyPolicyT() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return privacyPolicy.getText();
	}

	public boolean privacyPolicyD() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		return action.isDisplayed(getDriver(), privacyPolicy);
	}

	// Function to generate a 10-digit mobile number
	public static String generateMobileNumber() {
		Random random = new Random();

		// First digit must be between 6 and 9 (inclusive)
		int firstDigit = 6 + random.nextInt(4); // Generates 6, 7, 8, or 9

		// Remaining 9 digits can be any number from 0 to 9
		StringBuilder mobileNumber = new StringBuilder();
		mobileNumber.append(firstDigit);

		for (int i = 0; i < 9; i++) {
			mobileNumber.append(random.nextInt(10)); // Generates a random number from 0 to 9
		}

		return mobileNumber.toString();
	}

	@FindBy(xpath = "(//input[@id='pincode'])[1]")
	private WebElement addedPincode;

	// Function to return a random city and its corresponding pincode as a key-value pair
	public static Map<String, String> getRandomPincode() {
		Random random = new Random();
		Map<String, String> cityPincodeMap = new HashMap<>();

		// Define the city prefixes
		String[][] cityData = {
				/*{"Pune", "411"},
				{"Hyderabad", "500"},*/
				{"Bengaluru", "560"}/*,
				{"Chennai", "600"}*/
		};

		// Select a random city
		int randomCityIndex = random.nextInt(cityData.length);
		String cityName = cityData[randomCityIndex][0];
		String prefix = cityData[randomCityIndex][1];

		// Generate a random number between 0 and 100 for the suffix
		int randomSuffix = random.nextInt(101); // Generates numbers from 0 to 100
		String pincode = prefix + String.format("%03d", randomSuffix); // Format suffix to three digits

		// Store the result in the map
		cityPincodeMap.put(cityName, pincode);

		return cityPincodeMap; // Return the map with a single key-value pair
	}

	public static List<String> crnDetails(){
		List<String> crnDetails = new ArrayList<>();
		crnDetails.add(prop.getProperty("userName"));
		crnDetails.add(generateMobileNumber());
		crnDetails.add(prop.getProperty("userEmail"));
		Map<String, String> randomPincodeCity = getRandomPincode();
		String city = randomPincodeCity.keySet().iterator().next(); // Get the key (city)
		String pincode = randomPincodeCity.get(city); // Get the value (pincode)
		crnDetails.add(pincode);
		crnDetails.add(city);
		return crnDetails;
	}

	public void crnCreation() throws Throwable {
		hiddenSR();
		List<String> crnDetails = crnDetails();
		Iterator<String> it = crnDetails.iterator();
		System.out.println("Adding Details :");
		while (it.hasNext()){
			System.out.println(it.next());
		}
//		System.out.println("Adding Details : "+prop.getProperty("userName")+" | "+generateMobileNumber()+" | "+prop.getProperty("userEmail")+" | "+city+" | "+pincode);
		Thread.sleep(1000);
		nameFieldMailForm.sendKeys(crnDetails.get(0));
		Thread.sleep(1000);
		phoneNumberField.sendKeys(crnDetails.get(1));
		Thread.sleep(1000);
		eMailMainForm.sendKeys(crnDetails.get(2));
		Thread.sleep(1000);
		locationOfYourPlotMainForm.sendKeys(crnDetails.get(3));
		Thread.sleep(1000);
		// Step 3: Press the down arrow key to select the first suggestion
		locationOfYourPlotMainForm.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		locationOfYourPlotMainForm.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		// Step 4: Press Enter to select the suggestion
		locationOfYourPlotMainForm.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Added Above Details");

		action.JSClick(getDriver(), bookFreeConsultationMainForm);
		Thread.sleep(1000);

	}

	public List<String> validateThankYouPageLink() throws Throwable {
		List<String> thankYouPageLinkList = navigationSamePageCheck();
		return thankYouPageLinkList;
	}

	@FindBy(xpath = "(//img[@src='./assets/images/thank-you-form-header.svg'])[1]")
	private WebElement thankYouPageAlertPageImage;

	@FindBy(xpath = "(//div[normalize-space()='Thank you for filling in your details.'])[1]")
	private WebElement thankYouPageAlertPageMainText;

	@FindBy(xpath = "(//div[contains(text(),'We will get in touch with you shortly. Please answ')])[1]")
	private WebElement thankYouPageAlertPageSubText;

	@FindBy(xpath = "(//div[normalize-space()='What is your budget?'])[1]")
	private WebElement thankYouPageAlertPage1MainText;

	@FindBy(xpath = "(//span[normalize-space()='More than 2cr'])[1]")
	private WebElement thankYouPageAlertPage1Question1;
	@FindBy(xpath = "(//span[normalize-space()='1cr to 2cr'])[1]")
	private WebElement thankYouPageAlertPage1Question2;
	@FindBy(xpath = "(//span[normalize-space()='50 L to 1cr'])[1]")
	private WebElement thankYouPageAlertPage1Question3;
	@FindBy(xpath = "(//span[normalize-space()='20 L to 50 L'])[1]")
	private WebElement thankYouPageAlertPage1Question4;
	@FindBy(xpath = "(//span[normalize-space()='Less than 20 L'])[1]")
	private WebElement thankYouPageAlertPage1Question5;

	@FindBy(xpath = "(//div[normalize-space()='1/6'])[1]")
	private WebElement thankYouPageAlertPage1BottomPageNum;

	public List<String> validateThankYouPageAlertTextsPage1() throws Throwable {
		List<WebElement> elementList = new ArrayList<>();
		elementList.add(thankYouPageAlertPageMainText);
		elementList.add(thankYouPageAlertPageSubText);
		elementList.add(thankYouPageAlertPage1MainText);
		elementList.add(thankYouPageAlertPage1Question1);
		elementList.add(thankYouPageAlertPage1Question2);
		elementList.add(thankYouPageAlertPage1Question3);
		elementList.add(thankYouPageAlertPage1Question4);
		elementList.add(thankYouPageAlertPage1Question5);
		elementList.add(thankYouPageAlertPage1BottomPageNum);

		List<String> thankYouPageAlertTexts = alertTextCheckPage(thankYouPageAlertPageImage,elementList, thankYouPageAlertPage1Question3);
		return thankYouPageAlertTexts;
	}



	@FindBy(xpath = "(//div[normalize-space()='Do you have government permit to construct?'])[1]")
	private WebElement thankYouPageAlertPage2MainText; //Do you have government permit to construct?

	@FindBy(xpath = "(//span[normalize-space()='Yes I have permit'])[1]")
	private WebElement thankYouPageAlertPage2Question1; //Yes I have permit
	@FindBy(xpath = "(//span[normalize-space()='I have applied'])[1]")
	private WebElement thankYouPageAlertPage2Question2; //I have applied
	@FindBy(xpath = "(//span[normalize-space()='Yet to apply'])[1]")
	private WebElement thankYouPageAlertPage2Question3; //Yet to apply
	@FindBy(xpath = "(//span[normalize-space()='Permit not required'])[1]")
	private WebElement thankYouPageAlertPage2Question4; //Permit not required

	@FindBy(xpath = "(//div[normalize-space()='2/6'])[1]")
	private WebElement thankYouPageAlertPage2BottomPageNum;

	public List<String> validateThankYouPageAlertTextsPage2() throws Throwable {
		List<WebElement> elementList = new ArrayList<>();
		elementList.add(thankYouPageAlertPageMainText);
		elementList.add(thankYouPageAlertPageSubText);
		elementList.add(thankYouPageAlertPage2MainText);
		elementList.add(thankYouPageAlertPage2Question1);
		elementList.add(thankYouPageAlertPage2Question2);
		elementList.add(thankYouPageAlertPage2Question3);
		elementList.add(thankYouPageAlertPage2Question4);
		elementList.add(thankYouPageAlertPage2BottomPageNum);

		List<String> thankYouPageAlertTexts = alertTextCheckPage(thankYouPageAlertPageImage,elementList, thankYouPageAlertPage2Question1);
		return thankYouPageAlertTexts;
	}

	@FindBy(xpath = "(//div[normalize-space()='When do you want to start the construction?'])[1]")
	private WebElement thankYouPageAlertPage3MainText; //When do you want to start the construction?

	@FindBy(xpath = "(//span[normalize-space()='Immediately'])[1]")
	private WebElement thankYouPageAlertPage3Question1; //Immediately
	@FindBy(xpath = "(//span[normalize-space()='Within 3 months'])[1]")
	private WebElement thankYouPageAlertPage3Question2; //Within 3 months
	@FindBy(xpath = "(//span[normalize-space()='Within 6 months'])[1]")
	private WebElement thankYouPageAlertPage3Question3; //Within 6 months
	@FindBy(xpath = "(//span[normalize-space()='After 6 months'])[1]")
	private WebElement thankYouPageAlertPage3Question4; //After 6 months

	@FindBy(xpath = "(//div[normalize-space()='3/6'])[1]")
	private WebElement thankYouPageAlertPage3BottomPageNum;

	public List<String> validateThankYouPageAlertTextsPage3() throws Throwable {
		List<WebElement> elementList = new ArrayList<>();
		elementList.add(thankYouPageAlertPageMainText);
		elementList.add(thankYouPageAlertPageSubText);
		elementList.add(thankYouPageAlertPage3MainText);
		elementList.add(thankYouPageAlertPage3Question1);
		elementList.add(thankYouPageAlertPage3Question2);
		elementList.add(thankYouPageAlertPage3Question3);
		elementList.add(thankYouPageAlertPage3Question4);
		elementList.add(thankYouPageAlertPage3BottomPageNum);

		List<String> thankYouPageAlertTexts = alertTextCheckPage(thankYouPageAlertPageImage,elementList, thankYouPageAlertPage3Question1);
		return thankYouPageAlertTexts;
	}

	@FindBy(xpath = "(//div[normalize-space()='Is the plot registered under your name?'])[1]")
	private WebElement thankYouPageAlertPage4MainText; //Is the plot registered under your name?

	@FindBy(xpath = "(//span[normalize-space()='Yes'])[1]")
	private WebElement thankYouPageAlertPage4Question1; //Yes
	@FindBy(xpath = "//span[contains(text(), 'Registered')]") //(//span[normalize-space()="No - Registered under relative's name"])[1]
	private WebElement thankYouPageAlertPage4Question2; //No - Registered under relative's name
	@FindBy(xpath = "(//span[normalize-space()='No - Yet to buy the plot'])[1]")
	private WebElement thankYouPageAlertPage4Question3; //No - Yet to buy the plot

	@FindBy(xpath = "(//div[normalize-space()='4/6'])[1]")
	private WebElement thankYouPageAlertPage4BottomPageNum;

	public List<String> validateThankYouPageAlertTextsPage4() throws Throwable {
		List<WebElement> elementList = new ArrayList<>();
		elementList.add(thankYouPageAlertPageMainText);
		elementList.add(thankYouPageAlertPageSubText);
		elementList.add(thankYouPageAlertPage4MainText);
		elementList.add(thankYouPageAlertPage4Question1);
		elementList.add(thankYouPageAlertPage4Question2);
		elementList.add(thankYouPageAlertPage4Question3);
		elementList.add(thankYouPageAlertPage4BottomPageNum);

		List<String> thankYouPageAlertTexts = alertTextCheckPage(thankYouPageAlertPageImage,elementList, thankYouPageAlertPage4Question1);
		return thankYouPageAlertTexts;
	}

	@FindBy(xpath = "(//div[normalize-space()='What is the floor area you are planning?'])[1]")
	private WebElement thankYouPageAlertPage5MainText; //What is the floor area you are planning?

	@FindBy(xpath = "(//span[normalize-space()='Greater than 2500 sqft.'])[1]")
	private WebElement thankYouPageAlertPage5Question1; //Greater than 2500 sqft.
	@FindBy(xpath = "(//span[normalize-space()='1500 to 2500 sqft.'])[1]")
	private WebElement thankYouPageAlertPage5Question2; //1500 to 2500 sqft.
	@FindBy(xpath = "(//span[normalize-space()='1000 to 1500 sqft.'])[1]")
	private WebElement thankYouPageAlertPage5Question3; //1000 to 1500 sqft.
	@FindBy(xpath = "(//span[normalize-space()='500 to 999 sqft.'])[1]")
	private WebElement thankYouPageAlertPage5Question4; //500 to 999 sqft.
	@FindBy(xpath = "(//span[normalize-space()='Less than 500 sqft.'])[1]")
	private WebElement thankYouPageAlertPage5Question5; //Less than 500 sqft.

	@FindBy(xpath = "(//div[normalize-space()='5/6'])[1]")
	private WebElement thankYouPageAlertPage5BottomPageNum;

	public List<String> validateThankYouPageAlertTextsPage5() throws Throwable {
		List<WebElement> elementList = new ArrayList<>();
		elementList.add(thankYouPageAlertPageMainText);
		elementList.add(thankYouPageAlertPageSubText);
		elementList.add(thankYouPageAlertPage5MainText);
		elementList.add(thankYouPageAlertPage5Question1);
		elementList.add(thankYouPageAlertPage5Question2);
		elementList.add(thankYouPageAlertPage5Question3);
		elementList.add(thankYouPageAlertPage5Question4);
		elementList.add(thankYouPageAlertPage5Question5);
		elementList.add(thankYouPageAlertPage5BottomPageNum);

		List<String> thankYouPageAlertTexts = alertTextCheckPage(thankYouPageAlertPageImage,elementList, thankYouPageAlertPage5Question3);
		return thankYouPageAlertTexts;
	}

	@FindBy(xpath = "(//div[normalize-space()='What is your profession?'])[1]")
	private WebElement thankYouPageAlertPage6MainText; //What is your profession?

	@FindBy(xpath = "(//span[normalize-space()='Govt. Employee'])[1]")
	private WebElement thankYouPageAlertPage6Question1; //Govt. Employee
	@FindBy(xpath = "(//span[normalize-space()='Private Sector Employee'])[1]")
	private WebElement thankYouPageAlertPage6Question2; //Private Sector Employee
	@FindBy(xpath = "(//span[normalize-space()='Business Owner'])[1]")
	private WebElement thankYouPageAlertPage6Question3; //Business Owner
	@FindBy(xpath = "(//span[normalize-space()='Others'])[1]")
	private WebElement thankYouPageAlertPage6Question4; //Others

	@FindBy(xpath = "(//div[normalize-space()='6/6'])[1]")
	private WebElement thankYouPageAlertPage6BottomPageNum;

	public List<String> validateThankYouPageAlertTextsPage6() throws Throwable {
		List<WebElement> elementList = new ArrayList<>();
		elementList.add(thankYouPageAlertPageMainText);
		elementList.add(thankYouPageAlertPageSubText);
		elementList.add(thankYouPageAlertPage6MainText);
		elementList.add(thankYouPageAlertPage6Question1);
		elementList.add(thankYouPageAlertPage6Question2);
		elementList.add(thankYouPageAlertPage6Question3);
		elementList.add(thankYouPageAlertPage6Question4);
		elementList.add(thankYouPageAlertPage6BottomPageNum);

		List<String> thankYouPageAlertTexts = alertTextCheckPage(thankYouPageAlertPageImage,elementList, thankYouPageAlertPage6Question2);
		return thankYouPageAlertTexts;
	}

	public List<String> getTextFromWebElements(List<WebElement> elementList) {
		// Create an empty list to store the text from each WebElement
		List<String> textList = new ArrayList<>();

		// Iterate through each WebElement and get its text
		for (WebElement element : elementList) {
			// Extract the text and add it to the list
			String text = element.getText();
			textList.add(text);
		}

		// Return the list containing the text of all elements
		return textList;
	}

	@FindBy(xpath = "//h1[contains(text(), 'Thank you')]") // //h1[contains(text(), 'Thank you')] (//h1[normalize-space()='Thank you!'])[1]
	private WebElement thankYouPagetext1; //Thank you!
	@FindBy(xpath = "//p[contains(text(), 'Thank you for filling in')]")
	private WebElement thankYouPagetext2; //Thank you for filling in your details. We will get in touch with you shortly.
	@FindBy(xpath = "(//h2[contains(text(),'We construct your dream home. You track progress o')])[1]")
	private WebElement thankYouPagetext3; //We construct your dream home. You track progress on app.
	@FindBy(xpath = "(//p[@class='section-subtitle app-description'])[1]")
	private WebElement thankYouPagetext4; //Track house construction project progress, raise queries, view inspection reports and more.
	@FindBy(xpath = "(//div[contains(text(),'View packages, floor plans, design recommendations')])[1]")
	private WebElement thankYouPagetext5; //View packages, floor plans, design recommendations
	@FindBy(xpath = "(//div[contains(text(),'Capture house construction progress in 3D')])[1]")
	private WebElement thankYouPagetext6; //Capture house construction progress in 3D
	@FindBy(xpath = "(//div[contains(text(),'Realtime tracking until project completion')])[1]")
	private WebElement thankYouPagetext7; //Realtime tracking until project completion

	@FindBy(xpath = "(//img[@src='assets/images/offerLandingPageBanner.webp'])[1]")
	private WebElement thankYouPagetextImage;


	public List<String> validateThankYouPageT() throws Throwable {

		action.JSClick(getDriver(),thankYouPagetextImage);
		List<WebElement> elementList = new ArrayList<>();
//		elementList.add(thankYouPagetext1);
//		elementList.add(thankYouPagetext2);
		elementList.add(thankYouPagetext3);
		elementList.add(thankYouPagetext4);
		elementList.add(thankYouPagetext5);
		elementList.add(thankYouPagetext6);
		elementList.add(thankYouPagetext7);
		List<String> textList = getTextFromWebElements(elementList);
		System.out.println(textList.get(0));
		System.out.println(textList.get(1));
		System.out.println(textList.get(2));
		System.out.println(textList);
		return textList;
	}


}
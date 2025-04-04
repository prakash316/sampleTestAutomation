package com.testWeb.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.BnBweb.actiondriver.Action;
import com.BnBweb.base.BaseClass;
import org.testng.annotations.Test;

public class SalesDashboard extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//input[contains(@type,'email')]")
	private WebElement loginWithGoogleEmail;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	private WebElement loginWithGoogleButton;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement emailClickNext;

	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement enterPassword;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement passwordClickNext;

	@FindBy(xpath = "(//span[@class='ant-collapse-header-text'])[1]") //
	private WebElement salesFilterExpand;

	@FindBy(xpath = "(//input[@placeholder='Search On CrnId, Phone, Email, Name'])[1]") //
	private WebElement nameFilter;

	@FindBy(xpath = "(//input[@placeholder='From'])[1]") //
	private WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='To'])[1]") //
	private WebElement toDate;
	@FindBy(xpath = "(//span[normalize-space()='Filter'])[1]") //
	private WebElement clickFilter;

	@FindBy(xpath = "//a[contains(@href, 'conversion-pipeline')][1]") //
	private WebElement crnLink;


	public SalesDashboard() {
		PageFactory.initElements(getDriver(), this);
	}

	public static String getCurrentDate() {
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Define the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		System.out.println("Todays Date is : " + currentDate.format(formatter));
		// Format the date and return it as a string
		return currentDate.format(formatter);
	}

	public void lauchSalesDashboard() throws Throwable {

		getDriver().get(prop.getProperty("urlSales"));
//		if (hiddenSR.isDisplayed()) hiddenSR.click();
		Thread.sleep(500);
		String salesWindowHandle = getDriver().getWindowHandle();
		System.out.println("Sales Window Handle Window Handle is: " + salesWindowHandle);

		if (action.isDisplayed(getDriver(), loginWithGoogleButton)) {
			System.out.println("Login with Google is Diaplayed");
		}

		Thread.sleep(500);

		action.click(getDriver(), loginWithGoogleButton);

		Set<String> allWindowHandles = getDriver().getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the heading of the child window
		while (iterator.hasNext()) {
			String loginWithGoogle = iterator.next();
			System.out.println("Login With Google Window Handle is: " + loginWithGoogle);

			if (!salesWindowHandle.equalsIgnoreCase(loginWithGoogle)) {
				getDriver().switchTo().window(loginWithGoogle);
				Thread.sleep(2000);
				action.findElement(getDriver(), loginWithGoogleEmail);
				Thread.sleep(2000);
				action.type(loginWithGoogleEmail, prop.getProperty("emailAuthenticationSDE"));
				Thread.sleep(2000);
				action.click(getDriver(), emailClickNext);
				Thread.sleep(2000);
				action.findElement(getDriver(), enterPassword);
				Thread.sleep(2000);
				action.type(enterPassword, prop.getProperty("passwordAuthenticationSDE"));
				Thread.sleep(2000);
				action.click(getDriver(), passwordClickNext);

				getDriver().switchTo().window(salesWindowHandle);
				Thread.sleep(2000);
				System.out.println("Current Window handle is : " + getDriver().getCurrentUrl());
			}
		}
	}

	public Map<String, String> searchDataSalesDashboard() throws Throwable {
		action.JSClick(getDriver(), salesFilterExpand);
		fromDate.sendKeys(getCurrentDate());
		toDate.sendKeys(getCurrentDate());
		nameFilter.sendKeys(prop.getProperty("userName"));
		action.JSClick(getDriver(), clickFilter);
		Thread.sleep(2000);
		String crnId = crnLink.getText();
		System.out.println("The CRN ID is | " + crnId);
		String fullHref = crnLink.getAttribute("href");
		// Extract the part after '/conversion-pipeline/'
		String specificationId = fullHref.substring(fullHref.lastIndexOf("/") + 1);
		System.out.println("Extracted ID: " + specificationId);
		// Store or print the extracted value

		// Step 2: Construct the XPath using the extracted idPart
		String dynamicXPathSpecId = "//tr[@data-row-key='" + specificationId + "']";

		// Step 3: Locate the <tr> element using the dynamically constructed XPath
		WebElement parentRow = getDriver().findElement(By.xpath(dynamicXPathSpecId));

		// Extract and store the text from each <td> child
		// Create a map to store the extracted data

		Map<String, String> salesDashboardDetailsWebsiteMap = new HashMap<>();
		// Add the extracted data to the map
		salesDashboardDetailsWebsiteMap.put("extractedCrnId", parentRow.findElement(By.xpath("./td[1]//a")).getText());
		salesDashboardDetailsWebsiteMap.put("customerName", parentRow.findElement(By.xpath("./td[2]")).getText());
		salesDashboardDetailsWebsiteMap.put("projectSize", parentRow.findElement(By.xpath("./td[3]")).getText());
		salesDashboardDetailsWebsiteMap.put("interestLevel", parentRow.findElement(By.xpath("./td[4]")).getText());
		salesDashboardDetailsWebsiteMap.put("stage", parentRow.findElement(By.xpath("./td[5]")).getText());
		salesDashboardDetailsWebsiteMap.put("country", parentRow.findElement(By.xpath("./td[6]")).getText());
		salesDashboardDetailsWebsiteMap.put("cityName", parentRow.findElement(By.xpath("./td[7]")).getText());
		salesDashboardDetailsWebsiteMap.put("pincode", parentRow.findElement(By.xpath("./td[8]")).getText());
		salesDashboardDetailsWebsiteMap.put("CxWaReq", parentRow.findElement(By.xpath("./td[9]")).getText());
		salesDashboardDetailsWebsiteMap.put("location", parentRow.findElement(By.xpath("./td[10]")).getText());
		salesDashboardDetailsWebsiteMap.put("floors", parentRow.findElement(By.xpath("./td[11]")).getText());
		salesDashboardDetailsWebsiteMap.put("plotArea", parentRow.findElement(By.xpath("./td[12]")).getText());
		salesDashboardDetailsWebsiteMap.put("isName", parentRow.findElement(By.xpath("./td[13]")).getText());
		salesDashboardDetailsWebsiteMap.put("osName", parentRow.findElement(By.xpath("./td[14]")).getText());
		salesDashboardDetailsWebsiteMap.put("crnCreatedDateAge", parentRow.findElement(By.xpath("./td[15]")).getText());
		salesDashboardDetailsWebsiteMap.put("immediatenessScore", parentRow.findElement(By.xpath("./td[16]")).getText());
		salesDashboardDetailsWebsiteMap.put("qualification", parentRow.findElement(By.xpath("./td[17]")).getText());
		salesDashboardDetailsWebsiteMap.put("utmSource", parentRow.findElement(By.xpath("./td[18]")).getText());
		salesDashboardDetailsWebsiteMap.put("utmMedium", parentRow.findElement(By.xpath("./td[19]")).getText());
		salesDashboardDetailsWebsiteMap.put("utmCampaign", parentRow.findElement(By.xpath("./td[20]")).getText());
		salesDashboardDetailsWebsiteMap.put("utmTerm", parentRow.findElement(By.xpath("./td[21]")).getText());
		salesDashboardDetailsWebsiteMap.put("utmContent", parentRow.findElement(By.xpath("./td[22]")).getText());
		salesDashboardDetailsWebsiteMap.put("channel", parentRow.findElement(By.xpath("./td[23]")).getText());

		// Output the map to verify the stored values
		System.out.println(salesDashboardDetailsWebsiteMap);

		return salesDashboardDetailsWebsiteMap;
	}
}
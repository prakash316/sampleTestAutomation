package com.testWeb.pageobjects;/*package com.BnBweb.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.BnBweb.actiondriver.Action;
import com.BnBweb.base.BaseClass;
import com.BnBweb.utility.Log;
import com.BnBweb.utility.ReadExcel;

public class ChatWithUs extends BaseClass {
	
	Action action = new Action();
	
	@FindBy(xpath = "//div[contains(text(),'Chat With Us')]")
	private WebElement chatWithUs;
	
	@FindBy(xpath = "//span[contains(@aria-hidden,'true')]")
	private WebElement hiddenSR;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Type your message here')]")
	private WebElement chats;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Search On CrnId, Phone, Email, Name')]")
	private WebElement searchServiceRequest;
	
	@FindBy(name = "ant-btn ant-btn-primary ant-input-search-button")
	private WebElement searchServiceRequestClick;
	
	@FindBy(xpath = "(//td[contains(@class,'ant-table-cell')])[4]")
	private WebElement mobNumberCheck;
	
	@FindBy(xpath = "//span[contains(@style,'padding: 10px; margin-top: 2px;')]")
	private WebElement sendChat;
	
	@FindBy(xpath = "//button[contains(text(),'Login with Google')]")
	private WebElement loginWIthGoogle;
	
	@FindBy(xpath = "//input[contains(@type,'email')]")
	private WebElement eamilAuthetication;
	
	public ChatWithUs() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String ValidateChatWIthUsSR() throws InterruptedException {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		action.isDisplayed(getDriver(), chatWithUs);
		Thread.sleep(2000);
		action.JSClick(getDriver(), chatWithUs);
		Thread.sleep(2000);
		action.type(chats, prop.getProperty("chatWIth"));
		action.JSClick(getDriver(), sendChat);
		Thread.sleep(3000);
		action.type(chats, prop.getProperty("userName"));
		action.JSClick(getDriver(), sendChat);
		Thread.sleep(2000);
		action.type(chats, prop.getProperty("userPhoneCWS"));
		action.JSClick(getDriver(), sendChat);
		getDriver().get(prop.getProperty("urlSales"));
		String mainWindowHandle = getDriver().getWindowHandle();
		action.JSClick(getDriver(), loginWIthGoogle);
		Thread.sleep(2000);
	    Set<String> allWindowHandles = getDriver().getWindowHandles();
	    Iterator<String> iterator = allWindowHandles.iterator();
		  // Here we will check if child window has other child windows and will fetch the heading of the child window
	    while (iterator.hasNext()) 
	    {
	        String ChildWindow = iterator.next();
	        
	            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
	        {
	            getDriver().switchTo().window(ChildWindow);
	            Thread.sleep(2000);
	            action.type(eamilAuthetication, prop.getProperty("emailAuthenticationSDE"));
	            break;
	        }
		Thread.sleep(2000);
		action.isDisplayed(getDriver(), searchServiceRequest);
		action.type(searchServiceRequest, prop.getProperty("userPhoneCWS"));
		Thread.sleep(2000);
		action.JSClick(getDriver(), searchServiceRequestClick);
		Thread.sleep(2000);
		action.isDisplayed(getDriver(), mobNumberCheck);
		Thread.sleep(1000);
		String mobNumberGetText = mobNumberCheck.getText();
		System.out.println("Thge CRN created is associated to the Mobile Number : "+mobNumberGetText);
	
		return mobNumberGetText;
	}

}
*/
package com.testWeb.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

import com.BnBweb.actiondriver.Action;
import com.BnBweb.base.BaseClass;
import com.BnBweb.utility.Log;
import com.BnBweb.utility.ReadExcel;
import org.testng.annotations.Test;

public class LandingPages extends BaseClass {
	
	Action action = new Action();
	
	@FindBy(id = "name1")
	private WebElement name1;

	@FindBy(id = "phone1")
	private WebElement phone1;

	@FindBy(id = "email1")
	private WebElement email1;

/*	@FindBy(id = "offerCode1")
	private WebElement code1;*/

	@FindBy(id = "city1")
	private WebElement selectCity;
	
	@FindBy(xpath = "//button[contains(@id,'submit1')]")
//	@FindBy(xpath = "(//button[contains(@type,'submit')]")
	private WebElement submit1;
	
	@FindBy(xpath = "//span[contains(@aria-hidden,'true')]")
	private WebElement hiddenSR;

	private int number = 1;
    private int mobNumSuffix = 11;

	public LandingPages() {
		PageFactory.initElements(getDriver(), this);
	}
	
	/*public void validateLandingPageSR() throws Throwable  {

		getDriver().get(prop.getProperty("url"));
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		
		String mainWindowHandle = getDriver().getWindowHandle();
		
	    JavascriptExecutor jse = (JavascriptExecutor) getDriver();
*//*	    jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/affordable-house-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/villa-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/construction-contractors', '_blank');");	
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction-stages', '_blank');");*//*
		
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-construction-request', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/building-construction-company', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/construction-contractors?', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/construction-cost-per-square-feet', '_blank');");	
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/villa-construction?', '_blank');");
		
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/house-construction-company', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/house-construction-cost?', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/duplex-house-construction', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/cost-estimator?', '_blank');");	
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/building-construction-cost?', '_blank');");

*//*		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-house-construction-company-hyderabad', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/house-construction-stages', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-house-construction-company-bengaluru', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/cost-estimator?', '_blank');");	
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-commercial-construction', '_blank');");
		
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-house-construction-company-hyderabad', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/house-construction-stages', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-house-construction-company-bengaluru', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/lp-commercial-construction', '_blank');");	
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/affordable-house-construction', '_blank');");
		
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/house-construction', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/farmhouse-construction', '_blank');");
		jse.executeScript("window.open('https://bengaluru-construction-preprod.bricknbolt.com/', '_blank');");
		jse.executeScript("window.open('https://mysuru-construction-preprod.bricknbolt.com/', '_blank');");	
		jse.executeScript("window.open('https://hyderabad-construction-preprod.bricknbolt.com/', '_blank');");
		
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/referral', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/building-contractor', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/bengaluru', '_blank');");
		jse.executeScript("window.open('https://lp-preprod.bricknbolt.com/hyderabad', '_blank');");	
		jse.executeScript("window.open('https://chennai-construction-preprod.bricknbolt.com/', '_blank');");
		
		jse.executeScript("window.open('https://construction-offer-preprod.bricknbolt.com/', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/building-construction-company', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/construction-contractors', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/construction-cost-per-square-feet', '_blank');");	
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/villa-construction', '_blank');");
		
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction-company', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction-cost', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/duplex-house-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/building-contractor', '_blank');");	
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/building-construction-cost', '_blank');");
		
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction-stages', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/lp-house-construction-company-chennai', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/lp-commercial-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/affordable-house-construction', '_blank');");	
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction', '_blank');");
		
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/farmhouse-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/cost-estimator', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/construction-request', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/', '_blank');");	
		
/*		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/luxury-packages', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/big-projects-construction', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/commercial-construction', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/home', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/Lp2-construction-offer', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/luxury', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/our-project-app', '_blank');");
		jse.executeScript("window.open('https://website-preprod.bricknbolt.com/projects', '_blank');");*//*
		
		Thread.sleep(6000);
		
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
	            String pageInitialTitle = getDriver().getTitle();
	            Log.info("=========================================================================================");
	            Log.info(number+") Title of child window is: " + pageInitialTitle);
	    
*//*		    		if (action.findElement(getDriver(), code1))
	    		{
	    			Log.info("----------------------------------------------------------------------------------------");
	    			Log.info("Offer Code is Displayed for Landing Page Number:"+number );
	    			Log.info("----------------------------------------------------------------------------------------");
	    		}
	    		else 
	    		{
	    			Log.info("----------------------------------------------------------------------------------------");
	    			Log.info("Offer Code is NOT Displayed for Landing Page Number:"+number );
	    			Log.info("----------------------------------------------------------------------------------------");
	    		}
	            
            System.out.println("----------------------------------------------------------------------------------------");
	            System.out.println(number+") Title of child window is " + getDriver().getTitle());
	            System.out.println("Window Handle of child window is " + getDriver().getWindowHandle());*//*

	            
		Thread.sleep(2000);
		action.type(name1, prop.getProperty("userName"));
		Thread.sleep(2000);
		action.type(phone1, (prop.getProperty("userPhoneLP")+mobNumSuffix));
		Thread.sleep(2000);
		action.type(email1, prop.getProperty("userEmail"));
		Thread.sleep(2000);
		

*//*		action.type(code1, prop.getProperty("offerCode"));
		Thread.sleep(2000);
		action.click(getDriver(), selectCity);
		Thread.sleep(2000);
		action.selectByIndex(selectCity, cityIndex);
		Thread.sleep(2000);
		action.selectByValue(selectCity, cityValue);
		Thread.sleep(2000);
		action.selectByVisibleText(selectCity, cityVisibleText); 
		action.JSClick(getDriver(), submit1);
		String cellValue = ReadExcel.getCellValue(73+number, 11);
		action.fluentWaitUrl(getDriver(), cellValue);
		String pageFinalTitle = getDriver().getTitle();
		ReadExcel.setCellValue(73+number, 12, pageFinalTitle);
		System.out.println(pageFinalTitle); *//*
		
		
		number++;
		mobNumSuffix++;
	}

   }
 }*/


	public void validateLandingPageSR() throws Throwable  {

		getDriver().get(prop.getProperty("url"));
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		List<String> urls = new ArrayList<>();
		urls.add("https://uat.bricknbolt.com/c/bnb-home-construction?");
		urls.add("https://uat.bricknbolt.com/c/house-construction?");
		urls.add("https://uat.bricknbolt.com/c/cost-estimator?");
		urls.add("https://uat.bricknbolt.com/c/construction-packages?");
		urls.add("https://uat.bricknbolt.com/c/building-contractors?");
		urls.add("https://uat.bricknbolt.com/c/building-construction?");
		urls.add("https://uat.bricknbolt.com/c/building-construction-calculator?");
		urls.add("https://uat.bricknbolt.com/c/bnb-house-construction?");

		String concatenateLink = "utm_source=google&utm_medium=cpc&utm_campaign=Pmax_BLR&utm_content=Pmax&utm_term=PmaxBLR&city=bengaluru&gclid=EAIaIQobChMIpfa-qrvEhwMVWT-DAx3eby78EAEYASAAEgKYN_D_BwE";
		// Select a random URL
		Random random = new Random();
		String randomUrl = urls.get(random.nextInt(urls.size()));
		System.out.println("Random url is : "+randomUrl+concatenateLink);

		// Use JavaScript to open the link in a new tab
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.open(arguments[0])", randomUrl);

		for (String tab : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(tab);
		}

		Thread.sleep(4000);

	}
	
}

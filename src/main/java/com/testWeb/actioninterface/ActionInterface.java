package com.testWeb.actioninterface;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface {
	
	//Added all user actions abstract methods to achieve Abstraction  
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);
	public void click(WebDriver driver, WebElement ele);
	public boolean isDisplayed(WebDriver driver, WebElement ele);
	public boolean type(WebElement ele, String text);
	public boolean findElement(WebDriver driver, WebElement ele);
	public boolean isSelected(WebDriver driver, WebElement ele);
	public boolean isEnabled(WebDriver driver, WebElement ele);
	public boolean selectBySendkeys(String value,WebElement ele);
	public boolean selectByIndex(WebElement ele, int index);
	public boolean selectByValue(WebElement ele,String value);
	public boolean selectByVisibleText(WebElement ele, String visibletext);
	public boolean mouseHoverByJavaScript(WebElement locator);
	public boolean JSClick(WebDriver driver, WebElement ele);
	public boolean switchToFrameByIndex(WebDriver driver,int index);
	public boolean switchToFrameById(WebDriver driver,String idValue);
	public boolean switchToFrameByName(WebDriver driver,String nameValue);
	public boolean switchToDefaultFrame(WebDriver driver);
	public void mouseOverElement(WebDriver driver,WebElement element);
	public boolean moveToElement(WebDriver driver, WebElement ele);
	public boolean mouseover(WebDriver driver, WebElement ele);
	public boolean draggable(WebDriver driver,WebElement source, int x, int y);
	public boolean draganddrop(WebDriver driver,WebElement source, WebElement target);
	public boolean slider(WebDriver driver,WebElement ele, int x, int y);
	public boolean rightclick(WebDriver driver,WebElement ele);
	public boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count);
	public boolean switchToNewWindow(WebDriver driver);
	public boolean switchToOldWindow(WebDriver driver);
	public int getColumncount(WebElement row);
	public int getRowCount(WebElement table);
	public boolean Alert(WebDriver driver);
	public boolean launchUrl(WebDriver driver,String url);
	public boolean isAlertPresent(WebDriver driver);
	public String getCurrentURL(WebDriver driver);
	public String getTitle(WebDriver driver);
	public boolean click1(WebElement locator, String locatorName);
	public void fluentWaitVisibility(WebDriver driver,WebElement element, int timeOut);
	public void fluentWaitUrl(WebDriver driver, String Url);
	public void implicitWait(WebDriver driver, int timeOut);
	public void explicitWait(WebDriver driver, WebElement element, int timeOut);
	public void pageLoadTimeOut(WebDriver driver, int timeOut);
	public String screenShot(WebDriver driver, String filename);
	public String getCurrentTime();
	public void navigateBack(WebDriver driver);
	public String landingPagesLaunch(WebDriver driver);
//	public void deleteCRN(String phoneNumber, String userName, String eMail);
	public void deleteCRN(String phoneNumber, String userName, String eMail, int m) throws IOException;

}

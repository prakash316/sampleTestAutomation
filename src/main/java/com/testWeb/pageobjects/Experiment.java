package com.testWeb.pageobjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Experiment {
	
	@FindBy(name = "bb-milestone__count")
	private WebElement HomesTry;
	
	@FindBy(xpath = "//span[contains(@aria-hidden,'true')]")
	private WebElement hiddenSR;
	
	public String getProperty() throws Throwable {
		if (hiddenSR.isDisplayed()) hiddenSR.click();
		
		String CssValue=HomesTry.getCssValue(getProperty());
		System.out.println(CssValue +": Css Value");
		String text=HomesTry.getText();
		System.out.println(text +": text");
		String tagName=HomesTry.getTagName();
		System.out.println(tagName +": tag Name");
		Point location=HomesTry.getLocation();
		System.out.println(location +": Location");
		Dimension size = HomesTry.getSize();
		System.out.println(size +": Size");
		return tagName;

	}

}

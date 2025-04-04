package com.testWeb.base;

//import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.BnBweb.utility.ExtentManager;
//import com.BnBweb.utility.File;
import com.BnBweb.utility.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;

	// Declare ThreadLocal Driver
	//public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	//loadConfig method is to load the configuration
	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void loadConfig() {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + File.separator + "Configuration"+ File.separator + "Config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}

	public void launchBrowser(String browserName) {
		// String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			if (prop.getProperty("headLess").equalsIgnoreCase("true")) {
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--no-sandbox");
				chromeOptions.addArguments("--headless");
				chromeOptions.addArguments("--disable-gpu");
				// Set Browser to ThreadLocalMap
				driver.set(new ChromeDriver(chromeOptions));
			} else {
//				ChromeOptions chromeOptions = new ChromeOptions();
//				chromeOptions.addArguments("enable-automation");
//				chromeOptions.addArguments("--disable-extensions");
//				chromeOptions.addArguments("--dns-prefetch-disable");
//				chromeOptions.addArguments("--disable-gpu");
////				chromeOptions.addArguments("start-maximized");
//				chromeOptions.addArguments("--disable-dev-shm-usage");
//				chromeOptions.addArguments("--disable-browser-side-navigation");
//	//			chromeOptions.addArguments("enable-features=NetworkServiceInProcess");
//				chromeOptions.addArguments("disable-features=NetworkService");
//				chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//				driver.set(new ChromeDriver(chromeOptions));
				WebDriverManager.chromedriver().driverVersion("130.0.6723.58").setup();
				//WebDriverManager.chromedriver().setup();
				// Set Browser to ThreadLocalMap
				driver.set(new ChromeDriver());
			}

		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
		}
		//Maximize the screen
		getDriver().manage().window().maximize();
		//Delete all the cookies
		getDriver().manage().deleteAllCookies();
		//Implicit TimeOuts
		getDriver().manage().timeouts().implicitlyWait
		(Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
		//PageLoad TimeOuts
		getDriver().manage().timeouts().pageLoadTimeout
		(Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
		//Launching the URL
		getDriver().get(prop.getProperty("url"));
		
//		try {
//		WebElement element= getDriver().findElement(By.xpath("//img[@src='/assets/images/svg/bangalore.svg']"));
//		element.click();
//		}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//			Log.info("Location popu not found");
//			
//		}
		
	}

	@AfterSuite(groups = { "Smoke", "Regression","Sanity" })
	public void afterSuite() {
		ExtentManager.endReport();
//		Desktop.getDesktop().browse(//BnB_Web_Automation//test-output/ExtentReport/BnB_WebTestReport.html);
	}
	
	
}


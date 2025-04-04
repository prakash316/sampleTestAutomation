package com.testWeb.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() {
//		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"BnB_WebTestReport_"+Action.getCurrentTime()+".html");
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"BnB_WebTestReport.html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
/*		htmlReporter.config().setDocumentTitle("Automation Test Report");
		htmlReporter.config().setReportName("Brick & Bolt Website Test Automation Report"); 
		htmlReporter.config().setTheme(Theme.DARK); */
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName", "QA Windows");
		extent.setSystemInfo("ProjectName", "Brick & Bolt Website Automation");
		extent.setSystemInfo("Tested By", "TEAM Quality Assurance");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Environment", "PreProd");
		extent.setSystemInfo("Browser", "Chrome");
	}
	public static void endReport() {
		extent.flush();
	}
}

package com.testWeb.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import com.BnBweb.utility.Log;

public class RetryFailedTests implements IRetryAnalyzer{

	private int count = 0;
	private int retries = 1;
	
	@Override
	public boolean retry(ITestResult result) {
		
		boolean value = count<retries;
		count++;
		Log.info("Retrying.... " + count + " time(s)");
		return value;
	}

}

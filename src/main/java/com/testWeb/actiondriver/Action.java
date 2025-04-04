package com.testWeb.actiondriver;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BnBweb.actioninterface.ActionInterface;
import com.BnBweb.base.BaseClass;
import com.BnBweb.utility.Log;
import com.BnBweb.utility.ReadExcel;
import com.google.common.base.Function;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Action extends BaseClass implements ActionInterface {
	
	private static SoftAssert softAssert = new SoftAssert();

	@Override
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}

	public void scrollthepage(WebDriver driver, WebElement ele) {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0,700);");
		
		
	}

	@Override
	public void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}

	@Override
	public boolean findElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
		// System.out.println("Location not found: "+locatorName);
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully Found element");

			} else {
				System.out.println("Unable to locate element");
			}
		}
		return flag;
	}

	@Override
	public boolean isDisplayed(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findElement(driver, ele);
		Action act = new Action();
		act.scrollByVisibilityOfElement(getDriver(), ele);
		System.out.println("Scrolled to Element");
		if (flag) {
			flag = ele.isDisplayed();
			if (flag) {
				System.out.println("The element is Displayed");
				Assert.assertTrue(flag);
			} else {
				System.out.println("The element is not Displayed");
				Assert.assertTrue(flag);
			}
		} else {
			System.out.println("Not displayed ");
		}
		return flag;
	}

	@Override
	public boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findElement(driver, ele);
		if (flag) {
			flag = ele.isSelected();
			if (flag) {
				System.out.println("The element is Selected");
			} else {
				System.out.println("The element is not Selected");
			}
		} else {
			System.out.println("Not selected ");
		}
		return flag;
	}

	@Override
	public boolean isEnabled(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findElement(driver, ele);
		if (flag) {
			flag = ele.isEnabled();
			if (flag) {
				System.out.println("The element is Enabled");
			} else {
				System.out.println("The element is not Enabled");
			}
		} else {
			System.out.println("Not Enabled ");
		}
		return flag;
	}

	@Override
	public boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value: "+text);
			} else {
				System.out.println("Unable to enter value: "+text);
			}

		}
		return flag;
	}

	@Override
	public boolean selectBySendkeys(String value,WebElement ele) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Select value from the DropDown");		
			} else {
				System.out.println("Not Selected value from the DropDown");
				// throw new ElementNotFoundException("", "", "")
			}
		}
	}


	@Override
	public boolean selectByIndex(WebElement element, int index) {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Index");
			} else {
				System.out.println("Option not selected by Index");
			}
		}
	}


	@Override
	public boolean selectByValue(WebElement element,String value) {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Value");
			} else {
				System.out.println("Option not selected by Value");
			}
		}
	}


	@Override
	public boolean selectByVisibleText(WebElement ele, String visibletext ) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibletext);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by VisibleText");
			} else {
				System.out.println("Option not selected by VisibleText");
			}
		}
	}

	@Override
	public boolean mouseHoverByJavaScript(WebElement ele) {
		boolean flag = false;
		try {
			WebElement mo = ele;
			String javaScript = "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
					+ "arguments[0].dispatchEvent(evObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScript, mo);
			flag = true;
			return true;
		}

		catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed");
			} else {
				System.out.println("MouseOver Action is not performed");
			}
		}
	}

	@Override
	public boolean JSClick(WebDriver driver, WebElement ele) {
		boolean flag = false;
		Action act = new Action();
		act.scrollByVisibilityOfElement(getDriver(), ele);
		System.out.println("Scrolled to Element");
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);

			flag = true;

		}

		catch (Exception e) {
			throw e;

		} finally {
			if (flag) {
				System.out.println("Click Action is performed");
			} else if (!flag) {
				System.out.println("Click Action is not performed");
			}
		}
		return flag;
	}

	@Override
	public boolean switchToFrameByIndex(WebDriver driver, int index) {
		return false;
	}

//	@Override
//	public boolean switchToFrameByIndex(WebDriver driver,int index) {
//		boolean flag = false;
//		try {
//			new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
//			driver.switchTo().frame(index);
//			flag = true;
//			return true;
//		} catch (Exception e) {
//
//			return false;
//		} finally {
//			if (flag) {
//				System.out.println("Frame with index \"" + index + "\" is selected");
//			} else {
//				System.out.println("Frame with index \"" + index + "\" is not selected");
//			}
//		}
//	}

	@Override
	public boolean switchToFrameById(WebDriver driver,String idValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(idValue);
			flag = true;
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with Id \"" + idValue + "\" is selected");
			} else {
				System.out.println("Frame with Id \"" + idValue + "\" is not selected");
			}
		}
	}

	/**
	 * This method switch the to frame using frame Name.
	 * 
	 * @param nameValue : Frame Name wish to switch
	 * 
	 */
	@Override
	public boolean switchToFrameByName(WebDriver driver,String nameValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(nameValue);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with Name \"" + nameValue + "\" is selected");
			} else if (!flag) {
				System.out.println("Frame with Name \"" + nameValue + "\" is not selected");
			}
		}
	}

	@Override
	public boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				// SuccessReport("SelectFrame ","Frame with Name is selected");
			} else if (!flag) {
				// failureReport("SelectFrame ","The Frame is not selected");
			}
		}
	}

	@Override
	public void mouseOverElement(WebDriver driver,WebElement element) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(element).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println(" MouserOver Action is performed on ");
			} else {
				System.out.println("MouseOver action is not performed on");
			}
		}
	}

	@Override
	public boolean moveToElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement(locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean mouseover(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(ele).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			/*
			 * if (flag) {
			 * SuccessReport("MouseOver ","MouserOver Action is performed on \""+locatorName
			 * +"\""); } else {
			 * failureReport("MouseOver","MouseOver action is not performed on \""
			 * +locatorName+"\""); }
			 */
		}
	}
	@Override
	public boolean draggable(WebDriver driver,WebElement source, int x, int y) {
		boolean flag = false;
		try {
			new Actions(driver).dragAndDropBy(source, x, y).build().perform();
			Thread.sleep(5000);
			flag = true;
			return true;

		} catch (Exception e) {
		
			return false;
			
		} finally {
			if (flag) {
				System.out.println("Draggable Action is performed on \""+source+"\"");			
			} else if(!flag) {
				System.out.println("Draggable action is not performed on \""+source+"\"");
			}
		}
	}
	@Override
	public boolean draganddrop(WebDriver driver,WebElement source, WebElement target) {
		boolean flag = false;
		try {
			new Actions(driver).dragAndDrop(source, target).perform();
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("DragAndDrop Action is performed");
			} else if(!flag) {
				System.out.println("DragAndDrop Action is not performed");
			}
		}
	}
	
	@Override
	public boolean slider(WebDriver driver,WebElement ele, int x, int y) {
		boolean flag = false;
		try {
			// new Actions(driver).dragAndDropBy(dragitem, 400, 1).build()
			// .perform();
			new Actions(driver).dragAndDropBy(ele, x, y).build().perform();// 150,0
			Thread.sleep(5000);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Slider Action is performed");
			} else {
				System.out.println("Slider Action is not performed");
			}
		}
	}
	
	@Override
	public boolean rightclick(WebDriver driver,WebElement ele) {
		boolean flag = false;
		try {
			Actions clicker = new Actions(driver);
			clicker.contextClick(ele).perform();
			flag = true;
			return true;
			// driver.findElement(by1).sendKeys(Keys.DOWN);
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("RightClick Action is performed");
			} else {
				System.out.println("RightClick Action is not performed");
			}
		}
	}
	
	@Override
	public boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count) {
		boolean flag = false;
		try {
			Set<String> windowList = driver.getWindowHandles();

			String[] array = windowList.toArray(new String[0]);

			driver.switchTo().window(array[count-1]);

			if (driver.getTitle().contains(windowTitle)){
				flag = true;
			}else{
				flag = false;
			}
			return flag;
		} catch (Exception e) {
			//flag = true;
			return false;
		} finally {
			if (flag) {
				System.out.println("Navigated to the window with title");
			} else {
				System.out.println("The Window with title is not Selected");
			}
		}
	}
	@Override
	public boolean switchToNewWindow(WebDriver driver) {
		boolean flag = false;
		try {

			Set<String> s=driver.getWindowHandles();
			Object popup[]=s.toArray();
			driver.switchTo().window(popup[1].toString());
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return flag;
		} finally {
			if (flag) {
				System.out.println("Window is Navigated with title");				
			} else {
				System.out.println("The Window with title: is not Selected");
			}
		}
	}
	@Override
	public boolean switchToOldWindow(WebDriver driver) {
		boolean flag = false;
		try {

			Set<String> s=driver.getWindowHandles();
			Object popup[]=s.toArray();
			driver.switchTo().window(popup[0].toString());
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return flag;
		} finally {
			if (flag) {
				System.out.println("Focus navigated to the window with title");			
			} else {
				System.out.println("The Window with title: is not Selected");
			}
		}
	}
	@Override
	public int getColumncount(WebElement row) {
		List<WebElement> columns = row.findElements(By.tagName("td"));
		int a = columns.size();
		System.out.println(columns.size());
		for (WebElement column : columns) {
			System.out.print(column.getText());
			System.out.print("|");
		}
		return a;
	}
	
	@Override
	public int getRowCount(WebElement table) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int a = rows.size() - 1;
		return a;
	}
	
	
	/**
	 * Verify alert present or not
	 * 
	 * @return: Boolean (True: If alert preset, False: If no alert)
	 * 
	 */
	@Override
	public boolean Alert(WebDriver driver) {
		boolean presentFlag = false;
		Alert alert = null;

		try {
			// Check the presence of alert
			alert = driver.switchTo().alert();
			// if present consume the alert
			alert.accept();
			presentFlag = true;
		} catch (NoAlertPresentException ex) {
			// Alert present; set the flag

			// Alert not present
			ex.printStackTrace();
		} finally {
			if (!presentFlag) {
				System.out.println("The Alert is handled successfully");		
			} else{
				System.out.println("There was no alert to handle");
			}
		}

		return presentFlag;
	}
	@Override
	public boolean launchUrl(WebDriver driver,String url) {
		boolean flag = false;
		try {
			driver.navigate().to(url);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Current Url is \""+url+"\"");				
			} else {
				System.out.println("Failed to launch \""+url+"\"");
			}
		}
	}
	
	@Override
	public boolean isAlertPresent(WebDriver driver) 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}   // catch 
	}
	
	@Override
	public String getTitle(WebDriver driver) {
		boolean flag = false;

		String text = driver.getTitle();
		if (flag) {
			System.out.println("Title of the page is: \""+text+"\"");
		}
		return text;
	}
	
	@Override
	public String getCurrentURL(WebDriver driver)  {
		boolean flag = false;

		String text = driver.getCurrentUrl();
		if (flag) {
			System.out.println("Current URL is: \""+text+"\"");
		}
		return text;
	}
	
	@Override
	public boolean click1(WebElement locator, String locatorName) {
		boolean flag = false;
		try {
			locator.click();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Able to click on \""+locatorName+"\"");
			} else {
				System.out.println("Click Unable to click on \""+locatorName+"\"");
			}
		}

	}
	
	@Override
	public void fluentWaitVisibility(WebDriver driver,WebElement element, int timeOut) {
	    Wait<WebDriver> wait = null;
	    try {
	        wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(20))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.click();
	    }catch(Exception e) {
	    }
	}
	
	public WebElement fluentWaitWithIgnoringNoSuchElement(WebDriver driver,WebElement element, int timeOut) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>((WebDriver) driver)
			       .withTimeout(Duration.ofSeconds(timeOut))
			       .pollingEvery(Duration.ofSeconds(2L))
			       .ignoring(NoSuchElementException.class)
			       .ignoring(StaleElementReferenceException.class)
			       .withMessage("--time is out is done..element is not found");
		
		return wait.until(ExpectedConditions.elementToBeClickable(element));

//			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//					return element;
//			     }
//			   });
	}
	
	public void fluentWaitUrl(WebDriver driver,String Url) {
	    Wait<WebDriver> wait = null;
	    try {
	        wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(4))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.titleContains(Url));
	    }catch(Exception e) {
	    }
	}
	
	@Override
	public void implicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Override
	public void explicitWait(WebDriver driver, WebElement element, int timeOut) {
		//WebDriverWait wait = new WebDriverWait(driver,timeOut);

	}

	//	@Override
//	public void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
//		WebDriverWait wait = new WebDriverWait(driver,timeOut);
//		wait.until(ExpectedConditions.visibilityOf(element));
//		System.out.println("======================Element is visible===============================");
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		System.out.println("======================Element is Clickable=============================");
//	}
	@Override
	public void pageLoadTimeOut(WebDriver driver, int timeOut) {
		driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
	}
	@Override
	public String screenShot(WebDriver driver, String filename) {
		/*String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";
*/
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";
        File finalDestination = new File(destination);
		
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		// This new path for jenkins
/*		String newImageString = "http://localhost:8082/job/MyStoreProject/ws/MyStoreProject/ScreenShots/" + filename + "_"
				+ dateName + ".png";*/
		return destination;
	}
	@Override
	public String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}
	
	@Override
	public void navigateBack(WebDriver driver) {
	driver.navigate().back();	
	}
	
	public String landingPagesLaunch(WebDriver driver) {
		
		String mainWindowHandle = getDriver().getWindowHandle();
		
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/affordable-house-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/villa-construction', '_blank');");
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/construction-contractors', '_blank');");	
		jse.executeScript("window.open('https://chennai-preprod.bricknbolt.com/house-construction-stages', '_blank');");
		
		return mainWindowHandle;
	}
	
	//=============================SALES API VERIFICATION=======================
	
	@Override
	 public void deleteCRN(String phoneNumber, String userName, String eMail, int p) throws IOException {

	        String token = null;
	        String userId = "62c7da8e72e9720974791c0e"; // This is pradeep's user id in prod
	        String preprod_userId = "62c7d4746c351e6d26a5ce52"; // This is pradeep's user id in pre-prod

	        // Calling the sign in api to get the auth token
	        RestAssured.baseURI = "https://sales.bricknbolt.com/";
	        Response response = RestAssured
	                .given()
	                .body("{\n" +
	                        "    \"email\": \"\",\n" +
	                        "    \"phone\": 9000000008,\n" +
	                        "    \"country\": \"91\",\n" +
	                        "    \"otp\": 142857,\n" +
	                        "    \"mode\": \"PHONE\",\n" +
	                        "    \"username\": \"\",\n" +
	                        "    \"serviceId\": \"customerService\"\n" +
	                        "}")
	                .contentType("application/json")
	                .header("requestType","automationJob")
	                .when()
	                .post("/authService/customer/signIn");
	        JsonPath dataOne = response.jsonPath();

	        if (response.statusCode() == 200) {
	            token = dataOne.get("responseData.Authorization");
	        }

	        // Calling sales search api to get the list of first 50 CRNs
	        Response response2 = RestAssured
	                .given()
	                .body("{\n" +
	                        "    \"startDate\": null,\n" +
	                        "    \"endDate\": null,\n" +
	                        "    \"srInterestLevel\": [],\n" +
	                        "    \"srStatus\": [],\n" +
	                        "    \"city\": [],\n" +
	                        "    \"insideSalesId\": [],\n" +
	                        "    \"outsideSalesId\": [],\n" +
	                        "    \"minSqQuote\": null,\n" +
	                        "    \"maxSqQuote\": null,\n" +
	                        "    \"noSQSubmitted\": false,\n" +
	                        "    \"noTaskSR\": false,\n" +
	                        "    \"searchString\": \"\",\n" +
	                        "    \"searchStringUtm\": \"\"\n" +
	                        "}")
	                .header("authorization", "Bearer " + token)
	                .header("requestType","automationJob")
	                .contentType("application/json")
	                .when()
	                .post("/crmBackendService/api/crm/search/v1/search?pageNumber=0&pageSize=50");
	        dataOne = response2.jsonPath();
	        List<LinkedHashMap> obj = dataOne.get("responseData.object");
	        ArrayList<String> test = new ArrayList<>();
	        for (LinkedHashMap n : obj) {
	              if (n.get("phone").equals(phoneNumber) && n.get("email").equals(eMail) && n.get("name").equals(userName) ) {
//	        	  if (n.get("phone").equals("6644444811") && n.get("email").equals("testwebqa@yopmail.com") && n.get("name").equals("BnB Home Construction") ) {    	
	                test.add((String) n.get("id"));
//	                System.out.println(n.get("id"));
	                
	                String createdCRNID = (String) (n.get("crnId"));
	        	    ReadExcel.setCellValue(92+p, 20, createdCRNID);
	        	    System.out.println("Created CRN is : "+createdCRNID);
	        	    
	        	    String createdName = (String) (n.get("name"));
	        	    ReadExcel.setCellValue(92+p, 21, createdName);
	        	    System.out.println(createdCRNID+" Name is : "+createdName);
	        	    
	        	    String createdPhone = (String) (n.get("phone"));
	        	    ReadExcel.setCellValue(92+p, 22, createdPhone);
	        	    System.out.println(createdCRNID+" Phone Number is : "+createdPhone);
	        	    
	        	    String createdEMail = (String) (n.get("email"));
	        	    ReadExcel.setCellValue(92+p, 23, createdEMail);
	        	    System.out.println(createdCRNID+" EMail is : "+createdEMail);
	           
	        	    String createdCity = (String) (n.get("city"));
	        	    ReadExcel.setCellValue(92+p, 24, createdCity);
	        	    System.out.println(createdCRNID+" City is : "+createdCity);

	                
//	                System.out.println(n.get("crnId"));
//	                System.out.println(n.get("name"));
//	                System.out.println(n.get("email"));
//	                System.out.println(n.get("city"));
//	                System.out.println(n.get("phone"));
	                System.out.println("Deleting the CRN : " + n.get("crnId"));
	                break;
	            }

	        }
	        if (test.size() == 1) {
	            // Deleting if there is a match of the CRN
	            Response response3 = RestAssured
	                    .given()
	                    .header("authorization", "Bearer " + token)
	                    .header("requestType","automationJob")
	                    .contentType("application/json")
	                    .when()
	                    .delete("/crmBackendService/api/crm/servReq/delete/"+test.get(0)+"/"+userId);
	            dataOne = response3.jsonPath();
	            System.out.println(response3.asPrettyString());
	        }
	        else {
	            System.out.println("Result value is not 1 hence skipping delete...");
	        }

	    }
	
		public void verifyText(WebElement driver, String str) {
			String text = driver.getText();
			if (text.contains(str)) {
				Log.info("Text present");
				Assert.assertTrue(true);

			} else {

				Log.info("Text Not present");
				Assert.assertTrue(false);
			}

		}


}

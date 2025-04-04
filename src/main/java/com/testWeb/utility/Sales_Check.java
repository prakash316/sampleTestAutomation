package com.testWeb.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Sales_Check {

	static String token;
	String id;
	String phone;
	String role;

	String name = null;
	static JsonPath dataOne;

	ArrayList<String> ids = new ArrayList<String>();

	@Test(priority = 0, enabled = true)
	void signIn() {
		RestAssured.baseURI = "https://sales.bricknbolt.com/";
		Response response = RestAssured.given()
				.body("{\n" + "    \"email\": \"\",\n" + "    \"phone\": 9000000008,\n" + "    \"country\": \"91\",\n"
						+ "    \"otp\": 142857,\n" + "    \"mode\": \"PHONE\",\n" + "    \"username\": \"\",\n"
						+ "    \"serviceId\": \"customerService\"\n" + "}")
				.contentType("application/json").when().post("/authService/customer/signIn");
		JsonPath dataOne = response.jsonPath();

		if (response.statusCode() == 200) {
			token = dataOne.get("responseData.Authorization");
			// System.out.println(token);
		} else {
		}

	}

	@DataProvider(name = "userList")
	Iterator<Object> crnList() {
		RestAssured.baseURI = "https://sales.bricknbolt.com/";
		Response response = RestAssured.given()
				.body("{\n" + "    \"startDate\": null,\n" + "    \"endDate\": null,\n"
						+ "    \"srInterestLevel\": [],\n" + "    \"srStatus\": [],\n" + "    \"city\": [],\n"
						+ "    \"insideSalesId\": [],\n" + "    \"outsideSalesId\": [],\n"
						+ "    \"minSqQuote\": null,\n" + "    \"maxSqQuote\": null,\n"
						+ "    \"noSQSubmitted\": false,\n" + "    \"noTaskSR\": false,\n"
						+ "    \"searchString\": \"\",\n" + "    \"searchStringUtm\": \"\"\n" + "}")
				.header("authorization", "Bearer " + token).contentType("application/json").when()
				.post("/crmBackendService/api/crm/search/v1/search?pageNumber=0&pageSize=50");
		dataOne = response.jsonPath();
		// System.out.println(response.asPrettyString());
		if (response.statusCode() == 200) {
			List<Object> totalObj = dataOne.get("responseData.object");
			List<Object> siteObj = new ArrayList<Object>();
			List<Object> obj = dataOne.get("responseData.object");
			// System.out.println(response.asPrettyString());
			for (Object n : obj) {
				siteObj.add(n);
			}
			return siteObj.iterator();
			// return siteObj.iterator();
			// for(int i=0;i<totalObj.size();i++){
			// checkField("ID", "object["+i+"].id");
			// String id=dataOne.get("responseData.object["+i+"].id");
			// ids.add(id);
			// }
		} else {

		}
		return null;
	}

	@Test(dataProvider = "userList", enabled = true, dependsOnMethods = "signIn")
	void deleteId(LinkedHashMap h) {

		System.out.println(h.get("name"));
		if (h.get("phone").equals("9999999999")) {
			System.out.println(h.get("id"));
			System.out.println(h.get("crnId"));
			System.out.println(h.get("name"));
			System.out.println(h.get("email"));
			System.out.println(h.get("city"));
			System.out.println(h.get("phone"));
			System.out.println("Deleting the CRN : " + h.get("crnId"));
			RestAssured.baseURI = "https://sales.bricknbolt.com/";
			Response response = RestAssured.given().header("authorization", "Bearer " + token)
					.contentType("application/json").when()
					.get("/crmBackendService/api/crm/servReq/delete/" + h.get("id"));

			dataOne = response.jsonPath();
			System.out.println(response.asPrettyString());
		}

	}

	// void checkField(String Field, Object FieldName) {
	// Object m = dataOne.get("responseData." + FieldName.toString());
	// if (m == null) {
	// test.fail(Field + " : Should not be null/empty");
	// sa.assertNotNull(m, Field + " Should not be null/empty");
	// } else if (m.toString() != "null" || m.toString().isEmpty() != true) {
	// System.out.println(Field + " is : " + dataOne.get("responseData." +
	// FieldName));
	// test.pass(Field + " is : " + m.toString());
	// } else {
	// Assert.assertNotNull(m, Field + " Should not be null/empty");
	// }

	// }

}

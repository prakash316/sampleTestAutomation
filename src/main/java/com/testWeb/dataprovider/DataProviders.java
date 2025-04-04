package com.testWeb.dataprovider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.BnBweb.utility.NewExcelLibrary;

public class DataProviders {

	NewExcelLibrary obj = new NewExcelLibrary();
	
	@DataProvider(name = "testData")
	public Object[][] getTestData() {
		// Totals rows count
		int rows = obj.getRowCount("Sheet1");
		// Total Columns
		int column = obj.getColumnCount("Sheet1");
		int actRows = rows -1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Sheet1", i, j);
			}
		}
		return data;
	}

}

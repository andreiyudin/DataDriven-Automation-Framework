package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException {

		if(!data.get("runmode").equals("Y")) {
			
			throw new SkipException("Skipping the test case as the Run mode for data set is No");
		}
		
		click("addCustBtn_CSS");
		type("firstName_CSS", data.get("firstname"));
		type("lastName_XPATH", data.get("lastname"));
		type("postCode_CSS", data.get("postcode"));
		click("addbtn_CSS");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		
		alert.accept();
		
		//Assert.fail("Customer not added successfully");
		Thread.sleep(2000);
		
//		Thread.sleep(3000);
	}


}

package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {

//		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("Inside Login Test");
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		click("bmlBtn_CSS");
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login succesfully executed");
		Reporter.log("Login succesfully executed");
		
		//Assert.fail("Login not successful");
	}

//	public void click(String locator) {
//		// TODO Auto-generated method stub
//		
//	}

}

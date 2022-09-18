package org.testCases;

import java.io.IOException;

import org.baseUtils.BaseClass;
import org.pageObject.LoginPageObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass{
	
	public LoginPageObject object;
	@Parameters("searchEngine")
	@BeforeClass
	public void launchingBrowser (String searchEngine) {
		browserLaunch(searchEngine);
	}

	@Test
	public void testCase_001() throws IOException {
		launchUrl(propertyDetails("Url"));
		object = new LoginPageObject(driver);
		inputBox(object.getUserId(), propertyDetails("UserID"));
		inputBox(object.getPassword(), propertyDetails("Password"));
		JavaScriptClick(object.getLogin());
	}
	
	
	
}

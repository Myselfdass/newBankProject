package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	@FindBy(xpath = "//input[@name=\"uid\"]")
	private WebElement UserId;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	private WebElement login;

	public WebElement getUserId() {
		return UserId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

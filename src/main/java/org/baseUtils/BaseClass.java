package org.baseUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public JavascriptExecutor script;
	
	
	public void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			else if(browser.equalsIgnoreCase("fireFox")) {
				WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void launchUrl(String object) {
		driver.get(object);
		
	}
	


	public void inputBox(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void clickButton(WebElement element) {
		element.click();
	}
	public void scrollUpandDown(WebElement element,String trueorfalse) {
		script.executeScript("arguments[0].scrollIntoView("+trueorfalse+")", element);
		
	}
	public void JavaScriptClick(WebElement element) {
		script = (JavascriptExecutor)driver;
		script.executeScript("arguments[0].click()", element);
	}
	
	public String propertyDetails(String propertyFileData) throws IOException {
		File file = new File("C:\\Users\\91971\\eclipse-workspace\\BankProject\\src\\main\\resources\\CommonDetails.properties");
			FileInputStream stream = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(stream);
		return	properties.getProperty(propertyFileData);
	}

}

package com.cucumber.framework.helper.rs.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver ;
	public static WebDriverWait wait ;
	public static String Url = "http://uk.rs-online.com/web/";
	public static String browser = "chrome";
	

	
	public void init() {
		
		selectBrowser(browser);
		getUrl(Url);
		 }
	

	public void selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			 
			driver = new FirefoxDriver();
		
		}
	}

	public void getUrl(String Url) {

		driver.get(Url);
	
		driver.manage().window().maximize();

	}

	public WebElement waitForClickability( WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,50);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public void waitForVisibility( WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void sendKeys(WebElement element, String str) {
		waitForVisibility(element);
	element.clear();
	element.sendKeys(str);
	}
	public void click(WebElement element) {
		waitForClickability(element);
	element.click();
	}
	

	public WebElement find(By locator) {
		return driver.findElement(locator);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void quit() {
		driver.quit();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}

	

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public boolean  isElementPresent(WebElement element) {
		
		return element.isDisplayed();
		
	}
	
	
		
	public void teardown(){
		driver.quit();
	}
	
}

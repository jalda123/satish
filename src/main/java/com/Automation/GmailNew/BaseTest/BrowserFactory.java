package com.Automation.GmailNew.BaseTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;

		switch (browserName) {
		case "chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
				driver = (WebDriver) new ChromeDriver();
				drivers.put("chrome", driver);
			}
			break;
		case "ie":
			driver = drivers.get("IE");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
				driver = (WebDriver) new InternetExplorerDriver();
				drivers.put("IE", driver);
			}
			break;
		case "firefox":
			driver = drivers.get("Firefox");
			if (driver == null) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+"\\lib\\geckodriver.exe");
				driver = (WebDriver) new FirefoxDriver();
				drivers.put("Firefox", driver);
			}
			break;
		}
		return driver;
	}
	
	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
	}

}

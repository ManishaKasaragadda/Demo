package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInitialisation {
	
		private static WebDriver driver;
		public static Properties prop;

		/* ****Read the properties file**** */
		@Test(priority = 0)
		public void TestBaseMethod() throws IOException {
			
			prop = new Properties();
			FileInputStream reader = new FileInputStream(
					"E:\\ProjectWithMaven\\LPP_FI\\src\\main\\java\\com\\qa\\config\\FilePath.properties");
			prop.load(reader);

		}

		/* ****Open the browser and load URL**** */

		@Test(priority = 1)
		public void getdriver() throws InterruptedException {
	        String browserName =prop.getProperty("BROWSER");
			if (getDriver() == null && browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().version("88").setup();
				setDriver(new ChromeDriver());
			}
		}

		@Test(priority=2)
		public void getUrl() {
			getDriver().manage().window().maximize();
			getDriver().manage().deleteAllCookies();
			getDriver().get(prop.getProperty("UAT_URL"));
			
		}

		public static WebDriver getDriver() {
			return driver;
		}

		public void setDriver(WebDriver driver) {
			BrowserInitialisation.driver = driver;
		}
}

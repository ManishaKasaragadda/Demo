package com.qa.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.BrowserInitialisation;
public class Layer1_LoginScreen {
	
	//passing the driver initialised in BrowserInitialisation class to this class driver
	
		public static WebDriver loginDriver=BrowserInitialisation.getDriver();  
		
		//using the driver in below 2 methods so declaring as static so that no need to create an object the class
		
		public static WebDriverWait wait=new WebDriverWait(loginDriver, 30);
		
		
		@FindBy(id="username")  // or use some other locators 
		WebElement textUserName;
		
		@FindBy(className="password")     
		WebElement textPassword;
		
		@FindBy(id="login")
		WebElement Login;
			
		/* ****initializing page object**** */
		
		@Test(priority=1)
		public void LoginPageIntialisation() {
			
			PageFactory.initElements(loginDriver, this);
		}

		/* ****Login into the application**** */
		@Parameters({"username","password"})               //passing the parameters to login screen using .xml file 
		
		@Test(priority=2)
		public void loginApplication(String username, String password) throws InterruptedException{
			
			
			wait.until(ExpectedConditions.visibilityOf(textUserName)).sendKeys(username);
			//or
			textUserName.sendKeys(username);
			
		    textPassword.sendKeys(password);
		    //or
		    wait.until(ExpectedConditions.visibilityOf(textPassword)).sendKeys(password);
		    
			wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
	        //or
			Login.click();
			
			//can use implicit or explicit wait when the elements not locating on time
			
			loginDriver.wait(1000); 
			
			//or
			
			Thread.sleep(1000);  //this is not suggestable since the execution will hault untill the time limit completes
			
			//or
			
			loginDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("addind additional lines to check git");

		}

}

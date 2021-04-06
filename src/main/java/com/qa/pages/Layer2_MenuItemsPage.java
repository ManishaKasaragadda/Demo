package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.BrowserInitialisation;

public class Layer2_MenuItemsPage {
	
	@FindBy(id="menu1")
	WebElement Menu1;
	
	@FindBy(xpath = "//select//option[2]")
	WebElement Menu2;
	
	//... and so on to define the menu options available on this page
	
	WebDriver menuDriver=BrowserInitialisation.getDriver(); 
	
	@Test(priority=1)
	public void LoginPageIntialisation() {
		PageFactory.initElements(menuDriver, this);
	}

	
	//writing methods to access the menu items depends on the role, 
	//   once Role based action methods are defined here then can call then in Test Cases directly role wise
	
	@Parameters()               //passing the parameters to this screen using .xml file  or DataProvider
	@Test(priority=2)
	public void module1() {
	
		//actions to be performed like click or select the module
	}
	
	@Parameters()               
	@Test(priority=2)
	public void sub_module1() {
	
		//actions to be performed like click or select the module
	}
	
	@Parameters()               //passing the parameters to this screen using .xml file  or DataProvider
	@Test(priority=3)
	public void module2() {
	
		//actions to be performed like click or select the module
	}
	
	@Parameters()               
	@Test(priority=4)
	public void sub_module2() {
	
		//actions to be performed like click or select the module
	}
	
	// write all the methods here
}

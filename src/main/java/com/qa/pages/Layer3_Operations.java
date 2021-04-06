package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.BrowserInitialisation;

public class Layer3_Operations {
	
	// after defining the elements and Page initialisation then 
	//methods to be written to perform operations on the menu items selected
	
WebDriver operationsDriver=BrowserInitialisation.getDriver(); 
	
	@Test(priority=1)
	public void LoginPageIntialisation() {
		PageFactory.initElements(operationsDriver, this);
	}

	
	//writing methods to access the menu items depends on the role, 
	//   once Role based action methods are defined here then can call then in Test Cases directly role wise
	
	@Test
	public void view() {
	
		//actions to be performed like click or select the module
	}
	@Test
	public void add() {
	
		//actions to be performed like click or select the module
	}
	@Test
	public void update() {
	
		//actions to be performed like click or select the module
	}
	@Test
	public void delete() {
	
		//actions to be performed like click or select the module
	}
}

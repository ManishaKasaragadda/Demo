package com.qa.rolewise_testcases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Layer2_MenuItemsPage;

public class LogisticManager {

	
	//Create objects to the classes (where methods are written) 
	//Call the methods accessible to this login
	
	Layer2_MenuItemsPage menu=new Layer2_MenuItemsPage();
	
	
	@Parameters()
	@Test
	public void assignAccesstoRole() {
	
	menu.module1();
	menu.sub_module1();
}
}

package com.qa.rolewise_testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Layer2_MenuItemsPage;
import com.qa.pages.Layer3_Operations;

public class Administrator {

		
		//Create objects to the classes (where methods are written) 
		//Call the methods accessible to this login
	
	//after writing the test cases call them from tesng.xml file, can call multiple test cases at a time
		
		Layer2_MenuItemsPage menu=new Layer2_MenuItemsPage();
		Layer3_Operations op=new Layer3_Operations();
		
		
		@Parameters()
		@Test
		public void assignAccesstoRole() {
		
		menu.module1();
		menu.sub_module1();
		
		op.add();
		op.delete();
		op.view();
		
	  }
}

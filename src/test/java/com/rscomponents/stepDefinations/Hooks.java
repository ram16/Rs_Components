
package com.rscomponents.stepDefinations;

import org.openqa.selenium.WebDriver;
import com.cucumber.framework.helper.rs.TestBase.TestBase;
import cucumber.api.java.Before;

import cucumber.api.java.After;


public class Hooks  {
	
	public static WebDriver driver;

	TestBase testbase = new TestBase(); 
	
	@Before
	public void BeforeSenario() {
		
		testbase.init();
		

	}

	@After
	public void tearDown() {
		
		testbase.teardown();
	
	}

}

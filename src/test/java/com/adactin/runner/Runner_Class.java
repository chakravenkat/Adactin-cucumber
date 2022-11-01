package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.bassmethods.Bass_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
glue = "com.adactin.stepdef",
monochrome = true,
dryRun =false,plugin = {"pretty",
"html:Htmlreport.html","json:reports/Adactin.json",
"com.Cucumber.listner.ExtentCucumberFormatter.Report/Extent_Report.html"
}

)


public class Runner_Class {
	public static WebDriver driver;
	
	@BeforeClass
	public static  void setUp() {
	driver=	Bass_Class.getBrowser("chrome");

	}
	@AfterClass
	public static void tearDown() {
		driver=Bass_Class.close();
	}
	
	
	
	
	
	

}

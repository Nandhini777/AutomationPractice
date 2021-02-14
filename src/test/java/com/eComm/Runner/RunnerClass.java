package com.eComm.Runner;

import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.eComm.Utils.DriverClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Features"},glue= {"com.eComm.StepDefinitions"},
				plugin = { "pretty:STDOUT",
						"html:src\\Reports\\PrettyReport\\install", "json:src\\Reports\\JSONReport\\cucumber.json",
						"com.cucumber.listener.ExtentCucumberFormatter:" }, tags = {"@Automation"})
						


public class RunnerClass extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void  initializeDriver()
	{
		System.out.println("enter before test");
		DriverClass.getDriver("chrome");
		
	}
	 
	@BeforeClass
	public void initializeReport() {
		System.out.println("enter before Report");

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String dateName = new SimpleDateFormat("dd_MM_YYY_hh.mm").format(new Date());
		extentProperties.setReportPath("src/Reports/ExtendReports/Result_"+dateName+".html"); 
		extentProperties.setProjectName("Ecomm Ghana Web");
		System.out.println("Launch driver before class");
	}
	     
	@AfterClass
	public void afterClass() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		System.out.println("Report being generated");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", "Windows 10");
		Reporter.setSystemInfo("2.53.0", "Selenium");
		Reporter.setSystemInfo("3.3.9", "Maven");
		Reporter.setSystemInfo("1.8.0_66", "Java Version");
		Reporter.setTestRunnerOutput("Cucumber TestNG Test Runner");
		
	}
	

	@AfterTest	
	public void stopDriver() throws IOException
	{
		//DriverClass.quitdriver();
		//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	}  
 
}

package com.eComm.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.eComm.ObjectRepository.LoginRepo;

public class DriverClass {
	protected static WebDriver driver;
	

	
	public static WebDriver getDriver(String browser) {
		if(driver==null){
			if(browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\Drivers\\chromedriver.exe");
			    driver=new ChromeDriver();
			    System.out.println("driver launched");
			    driver.manage().window().maximize();
			}
			else if(browser=="firefox"){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if (browser=="ie") {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else if (browser=="safari"){
				System.setProperty("webdriver.safari.noinstall","true");
				driver= new SafariDriver();
			}
		}
		return driver;
		
	}
	
	
	 
	public static void quitdriver()
	{
		//driver.close();
		
	}  
	

}

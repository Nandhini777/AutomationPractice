package com.eComm.Utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;



public class CommonActions {
	
public static WebDriver driver;
	
public static CommonActions actionItem=null;
	
	public CommonActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
		
	}

	public static CommonActions getInstance()
	{
		if(actionItem==null)
		{
			actionItem= new CommonActions(DriverClass.driver);
		}
		return actionItem;
	}
	
	
// Navigate to URL

	public void navigateToURL(String URL) throws InterruptedException {
		driver.get(URL);
	}
	
	

	// Sleep

	public void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	// Click Action

	public void clickAction(WebElement element) throws InterruptedException {
		element.click();

	}
// Send Keys Action

	public void sendKeysAction(WebElement element, String inputText) {
		element.sendKeys(inputText);

	}

	// Clear Action

	public void clearAction(WebElement element) {
		element.clear();

	}
	
	// get text from element by attribute
	public String getTextUsingAttribute(WebElement element, String attributeValue) {
		String text = element.getAttribute(attributeValue);
		return text;

	}
	


	// get size of the elements
	public int getSizeByXpath(String xpath) {
		int size = driver.findElements(By.xpath(xpath)).size();
		return size;

	}
	
	
	public String getStringUsingFindElements(String xpath,int index) {
		List<WebElement> List=driver.findElements(By.xpath(xpath));
		String text = List.get(index).getText();
		return text;

	}
	
	
	// get text of the element


	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}
	

	public String getAttributeValue(WebElement element) {
		String text = element.getAttribute("value");
		return text;

	}

	// Implicit wait

	public void implicitWait(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	// Tab Keys

	public void pressKeys(Keys key) {

		driver.switchTo().activeElement().sendKeys(key);
	}


	// moveToElement using action Method

	public void moveToElement(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	// Send keys using active element
	
	public void typeIntoActiveElement(String inputText) {
		driver.switchTo().activeElement().sendKeys(inputText);

	}

	// scroll by visible element

	public void scrollToMakeElementVisible(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// scroll to the bottom of the page

	public void scrollToBottomOfPage() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// scroll to the top of the page

	public void scrollToToOfPage() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
	}

	// wait till element clickable

	public void verifyElementClickableThenClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public boolean isEnabled(WebElement element) {
		boolean flag = element.isEnabled();
		return flag;

	}

	public boolean isDisplayed(WebElement element) {
		boolean flag = element.isDisplayed();
		return flag;

	}

	public boolean isSelected(WebElement element) {
		boolean flag = element.isSelected();
		return flag;

	}

	public void selectByVisibleText(WebElement element, String text) {
		Select se = new Select(element);
		se.selectByVisibleText(text);

	}

	public void selectByValue(WebElement element, String Value) {
		Select se = new Select(element);
		se.selectByValue(Value);

	}

	public void waitTillClickable(WebElement element) {

		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click()", element);
	}

	public void checkPageIsReady() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			// To check page ready state.
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	public WebElement findElementByID(String id){
		WebElement NEWID = driver.findElement(By.id(id));
		return NEWID;
	}
	
	public WebElement findElementByXpath(String xpath){
		WebElement NEWID = driver.findElement(By.xpath(xpath));
		return NEWID;
	}


	public void pageTitleValidation(String actualTitle) {
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	// Report log with screen shot
	       public void add_Log_With_ScreenShot(String message) {
	              Reporter.addStepLog(message);
	              get_Screenshot(DriverClass.driver);
	       }

	       // Attach screenshot
	       public void get_Screenshot(WebDriver driver) {
	              String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	              TakesScreenshot ts = (TakesScreenshot) driver;
	              File source = ts.getScreenshotAs(OutputType.FILE);
	              String destination = System.getProperty("user.dir") + "/test-output/" + "screenshot" + dateName + ".png";
	              File finalDestination = new File(destination);
	              try {
	                     FileUtils.copyFile(source, finalDestination);
	                     Reporter.addScreenCaptureFromPath(
	                                  System.getProperty("user.dir") + "/test-output/" + "screenshot" + dateName + ".png");
	              } catch (IOException e) {
	                     e.printStackTrace();
	              }
	       }


	
	
	
	// Enter Keys

		public void enterKeys() {

			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		}
		
	public int randomNumber()
	{
		int randomNum = ThreadLocalRandom.current().nextInt(1, 9999 + 1);      
	    //Generates 10 Random Numbers in the range 1 -20
		return randomNum;
	    
	}
	
	public int randnum(int size) {
		int randomNum = ThreadLocalRandom.current().nextInt(1, size + 1);
		// Generates 10 Random Numbers in the range 1 -20
		return randomNum;

	}
	
	
	public String currentTime() {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return timeStamp;

	}

	public String Weekday() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));
		return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());

	}

	public int maxDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c = Calendar.getInstance();
		int date = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		return date;

	}
	
	public void clickTab(String tabName)
	{
		driver.findElement(By.xpath("//span[contains(@id,'tab') and text()='"+tabName+"']")).click();
	}
	
	
	public boolean orderNumber(String orderNumber)
	{
		boolean order=driver.findElement(By.xpath("//td[text()='"+orderNumber+"']")).isDisplayed();
		return order;
	}
	
	public void clickProductViewDetails(String productCode)
	{
		driver.findElement(By.xpath("//div[@class='text-alt' and text()='"+productCode+"']//ancestor::tr//a[contains(text(),'View Details')]")).click();
	}
	
	public void windowHandle()
	{
		 String originalHandle = driver.getWindowHandle();
		 for(String handle : driver.getWindowHandles()) {
		        if (!handle.equals(originalHandle)) {
		            driver.switchTo().window(handle);
		            driver.close();
		        }
		    }

		    driver.switchTo().window(originalHandle);
	}

	
}


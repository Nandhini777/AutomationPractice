package com.eComm.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eComm.Utils.DriverClass;

public class RegistrationRepo extends DriverClass {
	
	public static RegistrationRepo RegistrationRepo=null;
	
//	Page intialize
	public RegistrationRepo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Create Singleton Class
	
	public static RegistrationRepo getInstance()
	{
		if(RegistrationRepo==null)
		{
			RegistrationRepo=new RegistrationRepo(DriverClass.driver);
		}
		return RegistrationRepo;
		
		
	}

	@FindBy(xpath ="//a[@class='login']")
	public static WebElement signIn;
	
	@FindBy(id ="email_create")
	public static WebElement txtEmailCreate;
	
	@FindBy(id="SubmitCreate")
	public static WebElement btncreateAccount;
	
	@FindBy(id="create_account_error")
	public static WebElement invalidEmail;

	@FindBy(id="email")
	public static WebElement email;

	@FindBy(xpath ="//input[@id='passwd']")
	public static WebElement password;
	
	@FindBy(id="SubmitLogin")
	public static WebElement btnSignIn;
	
	@FindBy(xpath ="//*[@title='Recover your forgotten password']")
	public static WebElement lnkforgetPassword;
		
	@FindBy(xpath ="//*[@class='logout']")
	public static WebElement logout;

	@FindBy(xpath="//div[@id='center_column']//*//*[@class='alert alert-danger']")
	public static WebElement ErrorMessageCreateAnAccount;
	
	@FindBy(xpath="//*[@class='alert alert-danger']//li")
	public static WebElement EmailError;
	
	@FindBy(id="block_top_menu")
	public static WebElement topMenu;
	
	@FindBy(xpath="//a[@title='Women']")
	public static WebElement womanMenu;
	
	@FindBy(xpath="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//*[@title='Women']//parent::li//*//*[@title='T-shirts']")
	public static WebElement tshirtMenu;
	
	@FindBy(xpath="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//*[@title='Women']//parent::li//*//*[@title='Dresses']")
	public static WebElement DressesMenu;

	@FindBy(xpath="//*[@class='alert alert-danger']//li")
	public static WebElement passError;


}

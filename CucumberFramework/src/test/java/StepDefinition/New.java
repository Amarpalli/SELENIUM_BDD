package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import Utilities.ReadConfig;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.*;

public class New {
	public static  WebDriver driver;
	public static Logger log;
	public SearchCustomerPage SearchCustPg;
	public AddNewCustomerPage addNewCustPg;
	public LoginPage loginPg;
	public ReadConfig readConfig;
	
	//generate unique email id
		public String generateEmailId()
		{
			return(RandomStringUtils.randomAlphabetic(5));
		}
}

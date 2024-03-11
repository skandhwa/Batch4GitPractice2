package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerCreationPage extends BaseClass {
	
	WebDriver driver;

	public NewCustomerCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NewCustlink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement CustName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dOB;
	
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	
	public void clickOnNewCustLink()
	{
		NewCustlink.click();
	}
	
	public void enterCustomerName(String customer_name)
	{
		CustName.sendKeys(customer_name);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	
	public void enterdateofBirth(String date_of_birth)
	{
		dOB.sendKeys(date_of_birth);
	}
	
	
	public void enterCity(String city)
	{
		City.sendKeys(city);
	}
	
	
	
	
	
	
	
	

}

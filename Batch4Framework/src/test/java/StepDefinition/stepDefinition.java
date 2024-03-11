package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageFactory.LoginPage;
import PageFactory.NewCustomerCreationPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPage obj=new LoginPage(driver);
	NewCustomerCreationPage obj1=new NewCustomerCreationPage(driver);
	
	
	

@Given("User navigates to the application under test")
public void user_navigates_to_the_application_under_test() {
	
	System.out.println("User is navigated to application home page");
   
}

@Given("User will enter the username as {string}")
public void user_will_enter_the_username_as(String Username) {
	
	obj.enterUsername(Username);
	
	
    
}

@Given("User enters the password as {string}")
public void user_enters_the_password_as(String Password) {
	
	obj.enterPassword(Password);
	
	
	
	
    
}

@When("User will click on the login  button")
public void user_will_click_on_the_login_button() {
	
	obj.clickOnSubmit();
	
    
}

@Then("User will be navigated to the home page of the application")
public void user_will_be_navigated_to_the_home_page_of_the_application() throws IOException {
	
	System.out.println("The title of the page is ");
	getTitleofPage();
	takeScreenShot();
	
   
}

@Then("User will click on New Customer link")
public void user_will_click_on_new_customer_link() throws InterruptedException {
	
	
	
	obj1.clickOnNewCustLink();
	AddHarcodedwait();
	
	
	
    
}

@Then("User will enter the Customer name as {string}")
public void user_will_enter_the_customer_name_as(String customer_name) {
	
	obj1.enterCustomerName(customer_name);
    
}

@Then("User will select gender")
public void user_will_select_gender() {
	
	obj1.selectGender();
  
}

@Then("User will add the Date of birth as {string}")
public void user_will_add_the_date_of_birth_as(String date_of_birth) {
	
	obj1.enterdateofBirth(date_of_birth);
   
}

@Then("User enter the city as {string}")
public void user_enter_the_city_as(String city) {
	
	obj1.enterCity(city);
   
}








	
	
	
	

}

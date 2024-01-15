package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass{
    
	public static LoginPage loginPage;
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	    
		BaseClass.initialization();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
	    
		 loginPage=new LoginPage();
		 loginPage.enterUnameAndPassFunctionality("Admin", "admin123");
	}

	@Then("user click Login Button")
	public void user_click_login_button() throws InterruptedException {
		loginPage.clickLoginButton();
	}

}

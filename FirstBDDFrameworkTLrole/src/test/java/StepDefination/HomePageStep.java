package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	public static HomePage homePage;

	@When("user is on Home page and validate Home Page Title")
	public void user_is_on_home_page_and_validate_home_page_title() throws InterruptedException {

		homePage = new HomePage();
		String actualTitle = homePage.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");

	}

	@When("user validate Home Page URL")
	public void user_validate_home_page_url() throws InterruptedException {

		String actualUrl = homePage.getUrl();
		boolean b = actualUrl.contains("dashboard");
		Assert.assertEquals(b, true);
	}

	@When("user validate Home Page Logo")
	public void user_validate_home_page_logo() throws InterruptedException {

		boolean c = homePage.getHomePageLogo();
		Assert.assertEquals(c, true);
	}
}

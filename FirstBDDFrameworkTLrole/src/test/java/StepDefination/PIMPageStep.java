package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.When;

public class PIMPageStep extends BaseClass {
	public static PIMPage pIMPage;
	public static String empid;

	@When("user is on PIM Page and Validate PIM Page URL")
	public void user_is_on_pim_page_and_validate_pim_page_url() throws InterruptedException {
		pIMPage = new PIMPage();
		pIMPage.verifyPIMPageUrl();
		String actualUrl = pIMPage.verifyPIMPageUrl();
		boolean vv = actualUrl.contains("pim");
		Assert.assertEquals(vv, true);

	}

	@When("user click on Add Employee and enter firstName , lastName and click on save button")
	public void user_click_on_add_employee_and_enter_first_name_last_name_and_click_on_save_button() throws InterruptedException {

		pIMPage.firstNameAndLastName("Shivanya", "Bhosale");
	}

	@When("user capture the Employee id")
	public void user_capture_the_employee_id() throws InterruptedException {
		empid = pIMPage.captureEmployeeID();
	}

	@When("user click on Employee List Button")
	public void user_click_on_employee_list_button() throws InterruptedException {
		pIMPage.clickOnEmployeeList();
	}

	@When("user enter employeeId")
	public void user_enter_employee_id() throws InterruptedException {
		pIMPage.enterEmployeeId(empid);

	}

	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		pIMPage.clickOnSearch();
	}

	@When("user click on checkbox of employeeID")
	public void user_click_on_checkbox_of_employee_id() throws InterruptedException {
		pIMPage.selectEMPIDCheckbox();

	}

	@When("user selete the EmployeeId")
	public void user_selete_the_employee_id() throws InterruptedException {
		pIMPage.deletebutton();
		pIMPage.yesDeleteButton();
	}
}

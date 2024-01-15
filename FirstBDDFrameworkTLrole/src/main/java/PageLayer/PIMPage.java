package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimLink;

	@FindBy(name = "//a[text()='Add Employee']")
	private WebElement addEmployeeButton;

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(xpath = "lastName")
	private WebElement lname;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	private WebElement captureEmployeeId;

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employeeList;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	private WebElement enterEmployeeId;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyPIMPageUrl() {
		Wait.click(pimLink);

		return driver.getCurrentUrl();
	}

	public void firstNameAndLastName(String FirstName, String LastName) {
		Wait.click(addEmployeeButton);
		Wait.sendKeys(fname, FirstName);
		Wait.sendKeys(lname, LastName);
		Wait.click(saveButton);

	}

	public String captureEmployeeID() {
		return Wait.getAttribute(captureEmployeeId, "value");
	}

	public void clickOnEmployeeList() {

		Wait.click(employeeList);

	}

	
}

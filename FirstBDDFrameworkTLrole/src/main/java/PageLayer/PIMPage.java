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

	@FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
	private WebElement checkboxbutton;

	@FindBy(xpath = "//button[text()=' Delete Selected ']")
	private WebElement deleteselectedButton;

	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	private WebElement yesdeletedButton;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyPIMPageUrl() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(pimLink);

		return driver.getCurrentUrl();
	}

	public void firstNameAndLastName(String FirstName, String LastName) throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(addEmployeeButton);
		Thread.sleep(3000);
		Wait.sendKeys(fname, FirstName);
		Thread.sleep(3000);
		Wait.sendKeys(lname, LastName);
		Thread.sleep(3000);
		Wait.click(saveButton);

	}

	public String captureEmployeeID() throws InterruptedException {
		Thread.sleep(3000);
		return Wait.getAttribute(captureEmployeeId, "value");
	}

	public void clickOnEmployeeList() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(employeeList);

	}

	public void enterEmployeeId(String empid) throws InterruptedException {
		Thread.sleep(3000);
		Wait.sendKeys(enterEmployeeId, empid);

	}

	public void clickOnSearch() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(searchButton);

	}

	public void selectEMPIDCheckbox() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(checkboxbutton);

	}

	public void deletebutton() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(deleteselectedButton);

	}

	public void yesDeleteButton() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(yesdeletedButton);

	}
}

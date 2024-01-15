package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement uname;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginbutton;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public void enterUnameAndPassFunctionality(String userName, String passWord) throws InterruptedException {
		Thread.sleep(3000);
		Wait.sendKeys(uname, userName);
		Thread.sleep(3000);
		Wait.sendKeys(pass, passWord);

	}

	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(loginbutton);
	}

}

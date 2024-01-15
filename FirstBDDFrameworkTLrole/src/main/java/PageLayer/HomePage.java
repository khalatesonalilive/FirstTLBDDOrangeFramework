package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement HomePageLogo ;
	
	public HomePage() throws InterruptedException
	{
		Thread.sleep(3000);
		PageFactory.initElements(driver, this);
		
	}
	
	public String getTitle() throws InterruptedException
	{
		Thread.sleep(3000);
	return	driver.getTitle();
	}
	
	public String getUrl() throws InterruptedException
	{
		Thread.sleep(3000);
	return	driver.getCurrentUrl();
		
	}
	 public boolean getHomePageLogo() throws InterruptedException
	 {
		 Thread.sleep(3000);
		return HomePageLogo.isDisplayed();
	 }
}

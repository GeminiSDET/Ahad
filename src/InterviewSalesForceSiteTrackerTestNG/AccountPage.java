package InterviewSalesForceSiteTrackerTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@title='New']")
	WebElement newAccountButton;
	
	@FindBy(xpath="//input[@placeholder='Account Name']")
	WebElement accountNameField;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//span[contains(@class,'toastMessage')]")
	WebElement toastMessage;
	
	@FindBy(xpath="//span[text()='Files']")
	WebElement filesTab;
	
	public AccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewAccount(String accountName)
	{
		newAccountButton.click();
		accountNameField.sendKeys(accountName);
		saveButton.click();
	}
	
		 public boolean isToastMessageDisplayed() 
		 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 return wait.until(ExpectedConditions.visibilityOf(toastMessage)).isDisplayed();
	}
		 public void navigateToFilesTab() 
		 {
			 filesTab.click();
		 }
}

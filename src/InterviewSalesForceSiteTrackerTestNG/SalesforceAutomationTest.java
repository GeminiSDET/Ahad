package InterviewSalesForceSiteTrackerTestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalesforceAutomationTest {

	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	AccountPage accountPage;
	
	@BeforeClass
	public void setUp()
	{
        System.setProperty("webdriver.chrome.driver", "/Users/azarahmed/Desktop/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://login.salesforce.com/");
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        accountPage=new AccountPage(driver);
	}
	@Test(priority=1)
	public void loginTest()
	{
		loginPage.login("azarriju88-vd7d@force.com", "Azar~!@#4");
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}
	@Test(priority=2)
	public void createAccountTest()
	{
		homePage.navigateToAccounts();
		accountPage.createNewAccount("Test Account");
		Assert.assertTrue(accountPage.isToastMessageDisplayed());
	}
	@Test(priority=3)
	public void attachFilesTest()
	{
		accountPage.navigateToFilesTab();
		// Code to attach files (use WebDriver's `sendKeys` method for file input fields)
        // Validate file attachment
	}
	@Test(priority=4)
    public void deleteAccountTest() {
		// Navigate to Accounts
        // Search and delete the created account
        // Validate account deletion
	}
	
	  @AfterClass
	    public void tearDown() 
	  {
	        driver.quit();
	  }

}
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Interv {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/azarahmed/Desktop/chromedriver");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("azarriju88-vd7d@force.com");
		driver.findElement(By.id("password")).sendKeys("Azar~!@#4");
		driver.findElement(By.id("Login")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}
		catch(Exception e) {
		}

		  try {
              WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".popup-class"))); // Update selector
              System.out.println("Popup content: " + popup.getText());
              WebElement dismissButton = popup.findElement(By.cssSelector(".dismiss-button-class")); // Update selector
              dismissButton.click(); // Dismiss the modal popup
              System.out.println("Modal popup dismissed.");
          } catch (Exception e) {
              System.out.println("No modal popup present.");
          }
      {
      }
		
		driver.quit();

		driver.findElement(By.className("appItemImage")).click();
		driver.findElement(By.className("forceActionLink")).click();
		
		driver.findElement(By.className("slds-form-element__control slds-grow")).sendKeys("Azar1");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Assert.assertTrue(driver.findElement(By.className("forceToastMessage")).isDisplayed());
		
		
		driver.findElement(By.className("slds-file-selector__button")).click();
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dismiss {
    public static void main(String[] args) {
        // Set up WebDriver (adjust the path to your ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "/Users/azarahmed/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open the Salesforce login page
            driver.get("https://login.salesforce.com/");
            driver.manage().window().maximize();
            
            // Enter username
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("azarriju88-vd7d@force.com");
            
            // Enter password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Azar~!@#4");
            
            // Click the login button
            WebElement loginButton = driver.findElement(By.id("Login"));
            loginButton.click();
            
            // Wait for the page to load and check for popups
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Handle browser alert popup (if any)
            try {
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = driver.switchTo().alert();
                System.out.println("Alert text: " + alert.getText());
                alert.dismiss(); // Dismiss the alert (click Cancel or Close)
                System.out.println("Alert dismissed.");
            } catch (Exception e) {
                System.out.println("No browser alert present.");
            }

            // Handle modal or notification popup (if any)
            try {
                WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".popup-class"))); // Update selector
                System.out.println("Popup content: " + popup.getText());
                WebElement dismissButton = popup.findElement(By.cssSelector(".dismiss-button-class")); // Update selector
                dismissButton.click(); // Dismiss the modal popup
                System.out.println("Modal popup dismissed.");
            } catch (Exception e) {
                System.out.println("No modal popup present.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

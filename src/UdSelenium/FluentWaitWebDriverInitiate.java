package UdSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
//https://www.youtube.com/watch?v=vDpRjMHnNus

public class FluentWaitWebDriverInitiate {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement Alert=driver.findElement(By.id("elementId"));
		Alert.click();
		
		
		Wait<WebDriver> FluentWait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(ElementNotInteractableException.class);
		
		FluentWait.until(ExpectedConditions.alertIsPresent());
		
		
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}
}


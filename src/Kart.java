import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kart {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/Users/azarahmed/Desktop/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		
		{
			String name=products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElement(By.xpath("//button[[text()='ADD TO CART']")).click();
				break;
			}
		}
		
	}

}

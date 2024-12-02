import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Powerplay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/azarahmed/Desktop/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("ap_email")).sendKeys("azarriju@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Azar~!@#4");
		driver.findElement(By.id("signInSubmit")).click();


		//driver.quit();
		
	}

}

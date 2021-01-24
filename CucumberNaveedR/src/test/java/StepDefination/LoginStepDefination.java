package StepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class LoginStepDefination {

	WebDriver driver;
	
	@Given("User open the browser")
	public void user_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Naveed\\Testing Software\\Selinium Web Driver\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://example.testproject.io/web/");
	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("name")).sendKeys("naveed");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
}

	@And("user enters data")
	public void user_enters_data() {
		System.out.println("enters data");
	}

	@Then("user signout from page and quits the browser")
	public void user_signout_from_page_and_quits_the_browser() {
		driver.findElement(By.id("logout")).click();
	}
}

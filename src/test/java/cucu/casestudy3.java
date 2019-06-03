package cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy3 {
	WebDriver driver;
	@Given("User launches TestMeApp")
	public void user_launches_TestMeApp() {
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
		
	   
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	    
	}

	@When("user clicks login")
	public void user_clicks_login() {
		driver.findElement(By.name("Login")).click();
	    
	}

	@When("user Enters product to search")
	public void user_Enters_product_to_search() throws InterruptedException {
		WebElement s=driver.findElement(By.name("products"));
		  s.sendKeys("HeadPhone");
		//driver.findElement(By.name("products")).sendKeys("head");
	}

	@When("User clicks on findproduct")
	public void user_clicks_on_findproduct() {
		driver.findElement(By.name("val")).click();
	   
	}

	@Then("User verifies")
	public void user_verifies() {
	   
	}
}

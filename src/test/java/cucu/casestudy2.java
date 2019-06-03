package cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy2 {
	WebDriver driver;
	@Given("Url")
	public void url() {
		System.out.println("User launches browser");
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters {string}")
	public void user_enters(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
		
	   
	}
	@When("user enters  the {string}")
	public void user_enters_the(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	   
	}


	@Then("login")
	public void login() {
		driver.findElement(By.name("Login")).click();
	    
	}

}

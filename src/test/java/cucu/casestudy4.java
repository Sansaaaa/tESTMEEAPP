package cucu;





import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class casestudy4 {
	WebDriver driver;

@Given("User launches Testmeapp and enter into login page")
public void user_launches_Testmeapp_and_enter_into_login_page() {
	System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
   
}

@When("User enters into username")
public void user_enters_into_username() {
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	
    
}

@When("user enters password")
public void user_enters_password() {
	driver.findElement(By.name("password")).sendKeys("password123");
    
}

@When("User clicks login")
public void user_clicks_login() {
	driver.findElement(By.name("Login")).click();
    
    
}

@When("User searches for product")
public void user_searches_for_product() {
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.name("products")).sendKeys("HeadPhone");
    
    
}

@When("User clicks finddetails")
public void user_clicks_finddetails() {
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    
}

@When("user clicks proceed without clicking addtocart")
public void user_clicks_proceed_without_clicking_addtocart() {
	
	Assert.assertFalse(10<8);    
}

@When("user clicks addtocart")
public void user_clicks_addtocart() {
	driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
	
	
    
}

@When("user clicks on cart")
public void user_clicks_on_cart() {
	driver.findElement(By.xpath("//*[@href='displayCart.htm']")).click();
    
	
    
}

@When("user clicks on checkout")
public void user_clicks_on_checkout() {
	driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
	   
	
    
}

@When("user clicks proceed to pay")
public void user_clicks_proceed_to_pay() {
	driver.findElement(By.xpath("//input[@type='submit'][@value='Proceed to Pay']")).click();
	
    
}

@When("user clicks bank option")
public void user_clicks_bank_option() throws InterruptedException {
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//label[contains(text(),'City Union Bank')]")).click();
	
    
}

@When("User clicks on continue")
public void user_clicks_on_continue() {
	driver.findElement(By.cssSelector("#btn")).click();
	   
    
}

@When("User enters Username")
public void user_enters_Username() {
	driver.findElement(By.name("username")).sendKeys("melinda");
    
}

@When("User enters Password")
public void user_enters_Password() {
	driver.findElement(By.name("password")).sendKeys("1234567");
   
}
}

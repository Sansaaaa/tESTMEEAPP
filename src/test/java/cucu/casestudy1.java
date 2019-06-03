package cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1 {
	WebDriver driver;
	@Given("User Lanchues TestMeApp And Enter into signin page")
	public void user_Lanchues_TestMeApp_And_Enter_into_signin_page() {
		System.out.println("User launches browser");
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	    
	}

	@When("User Enters New UserName as {string}")
	public void user_Enters_New_UserName_as(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);;
		   
	    
	}

	@When("User Enters  FirstName as {string}")
	public void user_Enters_FirstName_as(String fn) {
		driver.findElement(By.name("firstName")).sendKeys(fn);;
	    
		
	   
	}

	@When("User Enters LastName as {string}")
	public void user_Enters_LastName_as(String ln) {
		driver.findElement(By.name("lastName")).sendKeys(ln);;
		   
		
	    
	}

	@When("User Enters Password as {string} And confirm password as {string}")
	public void user_Enters_Password_as_And_confirm_password_as(String pa, String cp) {
		driver.findElement(By.name("password")).sendKeys(pa);;
		driver.findElement(By.name("confirmPassword")).sendKeys(cp);;
		
	}  

	@When("User Selects Gender as {string}")
	public void user_Selects_Gender_as(String gd) {
		driver.findElement(By.xpath("//input[@type='radio'][@value='Female']")).click();
	  
	}

	@When("User Enters E-Mail as{string}")
	public void user_Enters_E_Mail_as(String em) {
		driver.findElement(By.name("emailAddress")).sendKeys(em);;
		
		
	    
	}

	@When("User Enters Mobile Number as {string}")
	public void user_Enters_Mobile_Number_as(String mn) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mn);;
	    
	    
	}

	@When("User Enters DOB as {string}")
	public void user_Enters_DOB_as(String db) {
		driver.findElement(By.name("dob")).sendKeys(db);;
	    
	    
	}

	@When("User Enters Address as {string}")
	public void user_Enters_Address_as(String ad) {
		driver.findElement(By.name("address")).sendKeys(ad);;
	   
	}

	@When("User Selects Security Question as {string}")
	public void user_Selects_Security_Question_as(String string) {
		Select s= new Select (driver.findElement(By.name("securityQuestion")));
		s.selectByValue("411012");
	    
	}

	@When("User Enters Answers as {string}")
	public void user_Enters_Answers_as(String string) {
		driver.findElement(By.name("answer")).sendKeys("Dobby");
		   
	   
	}

	@Then("User clicks on Submit")
	public void user_clicks_on_Submit() {
		driver.findElement(By.xpath("//input[@type='submit'][@value='Register']")).click();
	    
	    
	}


}

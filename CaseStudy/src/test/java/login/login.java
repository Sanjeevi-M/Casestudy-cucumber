package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("user is in signin page")
	public void user_in_signin_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
			driver=UtilityClass.getDriver("Chrome");
		 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

	}
	
	@Given("user clickss signin")
	public void user_clickss_signin() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("SignIn")).click();
	}

	@Given("user enterss the username {string}")
	public void user_enterss_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement( By.name("userName")).sendKeys(string);
	    
	}

	@Given("user enterss the password {string}")
	public void user_enterss_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	    
	}
	

    @When("user clickss login button")
    public void user_clickss_login_button() {
    // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.name("Login")).click();
}


	@Then("user log inn successful")
	public void user_log_inn_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("log in successful");
		
	    
	}


}
